/*******************************************************************************
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.build.BuildRequest;
import org.eclipse.xtext.build.IncrementalBuilder;
import org.eclipse.xtext.build.IndexState;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ChunkedResourceDescriptions;
import org.eclipse.xtext.resource.impl.LocalLayeredResourceDescriptionsData;
import org.eclipse.xtext.resource.impl.ProjectDescription;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.IFileSystemScanner;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.workspace.IProjectConfig;
import org.eclipse.xtext.workspace.ISourceFolder;
import org.eclipse.xtext.workspace.ProjectConfigAdapter;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.11
 */
public class ProjectManager {
	@Inject
	protected IncrementalBuilder incrementalBuilder;

	@Inject
	protected Provider<XtextResourceSet> resourceSetProvider;

	@Inject
	protected IResourceServiceProvider.Registry languagesRegistry;

	@Inject
	protected IFileSystemScanner fileSystemScanner;

	@Inject
	protected IExternalContentSupport externalContentSupport;

	private IndexState persistedIndexState = new IndexState();

	private IndexState dirtyIndexState;

	private URI baseDir;

	private Procedure2<? super URI, ? super Iterable<Issue>> issueAcceptor;

	private Provider<Map<String, ResourceDescriptionsData>> persistedIndexProvider;

	private Provider<Map<String, ResourceDescriptionsData>> dirtyIndexProvider;

	private IExternalContentSupport.IExternalContentProvider openedDocumentsContentProvider;

	private IExternalContentSupport.IExternalContentProvider dirtyDocumentsContentProvider;

	private XtextResourceSet persistedResourceSet;

	private XtextResourceSet dirtyResourceSet;

	private ProjectDescription projectDescription;

	private IProjectConfig projectConfig;

	/**
	 * @since 2.29
	 */
	public void initialize(ProjectDescription description, IProjectConfig projectConfig,
			Procedure2<? super URI, ? super Iterable<Issue>> acceptor,
			IExternalContentSupport.IExternalContentProvider openedDocumentsContentProvider,
			Provider<Map<String, ResourceDescriptionsData>> indexProvider,
			IExternalContentSupport.IExternalContentProvider dirtyDocumentsContentProvider,
			Provider<Map<String, ResourceDescriptionsData>> dirtyIndexProvider, CancelIndicator cancelIndicator) {
		this.projectDescription = description;
		this.projectConfig = projectConfig;
		this.baseDir = projectConfig.getPath();
		this.issueAcceptor = acceptor;
		this.openedDocumentsContentProvider = openedDocumentsContentProvider;
		this.persistedIndexProvider = indexProvider;
		this.dirtyDocumentsContentProvider = dirtyDocumentsContentProvider;
		this.dirtyIndexProvider = dirtyIndexProvider;
		setDirtyIndexState(wrapPersistedIndexState(persistedIndexState));
		createDirtyResourceSet(dirtyIndexState.getResourceDescriptions());
	}

	/**
	 * Initial build of this project.
	 */
	public IncrementalBuilder.Result doInitialBuild(CancelIndicator cancelIndicator) {
		List<URI> allUris = new ArrayList<>();
		for (ISourceFolder srcFolder : projectConfig.getSourceFolders()) {
			allUris.addAll(srcFolder.getAllResources(fileSystemScanner));
		}
		return doPersistedBuild(allUris, Collections.emptyList(), Collections.emptyList(), cancelIndicator);
	}

	/**
	 * Build this project.
	 *
	 * @since 2.29
	 */
	public IncrementalBuilder.Result doPersistedBuild(List<URI> dirtyFiles, List<URI> deletedFiles,
			List<IResourceDescription.Delta> externalDeltas, CancelIndicator cancelIndicator) {
		BuildRequest request = newPersistedBuildRequest(dirtyFiles, deletedFiles, externalDeltas, cancelIndicator);
		IncrementalBuilder.Result result = incrementalBuilder.build(request,
				languagesRegistry::getResourceServiceProvider);
		persistedIndexState = result.getIndexState();
		persistedResourceSet = request.getResourceSet();
		persistedIndexProvider.get().put(projectDescription.getName(), persistedIndexState.getResourceDescriptions());
		setDirtyIndexState(wrapPersistedIndexState(persistedIndexState));
		createDirtyResourceSet(dirtyIndexState.getResourceDescriptions());
		return result;
	}

	/**
	 * @since 2.29
	 */
	protected IndexState wrapPersistedIndexState(IndexState persisted) {
		return new IndexState(new LocalLayeredResourceDescriptionsData(persisted.getResourceDescriptions()),
				persisted.getFileMappings());
	}

	/**
	 * Build this project.
	 *
	 * @since 2.29
	 */
	public IncrementalBuilder.Result doDirtyBuild(List<URI> dirtyFiles, List<URI> deletedFiles,
			List<IResourceDescription.Delta> externalDeltas, CancelIndicator cancelIndicator) {
		BuildRequest request = newDirtyBuildRequest(dirtyFiles, deletedFiles, externalDeltas, cancelIndicator);
		IncrementalBuilder.Result result = incrementalBuilder.build(request,
				languagesRegistry::getResourceServiceProvider);
		setDirtyIndexState(result.getIndexState());
		dirtyResourceSet = request.getResourceSet();
		return result;
	}

	/**
	 * Creates a new build request for this project.
	 *
	 * @since 2.29
	 */
	protected BuildRequest newPersistedBuildRequest(List<URI> changedFiles, List<URI> deletedFiles,
			List<IResourceDescription.Delta> externalDeltas, CancelIndicator cancelIndicator) {
		BuildRequest result = new BuildRequest();
		result.setBaseDir(baseDir);
		result.setState(new IndexState(persistedIndexState.getResourceDescriptions().copy(),
				persistedIndexState.getFileMappings().copy()));
		result.setResourceSet(createFreshResourceSet(result.getState().getResourceDescriptions()));
		result.setDirtyFiles(changedFiles);
		result.setDeletedFiles(deletedFiles);
		result.setExternalDeltas(externalDeltas);
		result.setAfterValidate(this::afterValidate);
		result.setCancelIndicator(cancelIndicator);
		result.setIndexOnly(projectConfig.isIndexOnly());
		return result;
	}

	/**
	 * If the resource is not dirty, posts validation results via the configured {@link #getIssueAcceptor() issue
	 * acceptor}.
	 *
	 * @param validated
	 *            the uri of the resource that has just been validated.
	 * @param issues
	 *            the issues that have resulted from validating the resource.
	 * @return whether the build can proceed, <code>false</code> if the build should be interrupted.
	 * @since 2.29
	 */
	public boolean afterValidate(URI validated, Iterable<Issue> issues) {
		if (!dirtyDocumentsContentProvider.hasContent(validated)) {
			getIssueAcceptor().apply(validated, issues);
		}
		return true;
	}

	/**
	 * Creates a new build request for this project.
	 *
	 * @since 2.29
	 */
	protected BuildRequest newDirtyBuildRequest(List<URI> changedFiles, List<URI> deletedFiles,
			List<IResourceDescription.Delta> externalDeltas, CancelIndicator cancelIndicator) {
		BuildRequest result = new BuildRequest();
		result.setBaseDir(baseDir);
		result.setState(new IndexState(dirtyIndexState.getResourceDescriptions().copy(),
				dirtyIndexState.getFileMappings().copy()));
		result.setResourceSet(createDirtyResourceSet(result.getState().getResourceDescriptions()));
		result.setDirtyFiles(changedFiles);
		result.setDeletedFiles(deletedFiles);
		result.setExternalDeltas(externalDeltas);
		result.setAfterValidate(this::afterDirtyValidate);
		result.setCancelIndicator(cancelIndicator);
		result.setIndexOnly(projectConfig.isIndexOnly());
		return result;
	}

	/**
	 * Posts validation results via the configured {@link #getIssueAcceptor() issue acceptor}.
	 *
	 * @param validated
	 *            the uri of the resource that has just been validated.
	 * @param issues
	 *            the issues that have resulted from validating the resource.
	 * @return whether the build can proceed, <code>false</code> if the build should be interrupted.
	 * @since 2.29
	 */
	public boolean afterDirtyValidate(URI validated, Iterable<Issue> issues) {
		getIssueAcceptor().apply(validated, issues);
		return true;
	}

	/**
	 * Create and configure a new resource set for this project.
	 *
	 * @since 2.29
	 */
	public XtextResourceSet createNewResourceSet(ResourceDescriptionsData newIndex, Map<String, ResourceDescriptionsData> globalIndex) {
		XtextResourceSet result = resourceSetProvider.get();
		projectDescription.attachToEmfObject(result);
		ProjectConfigAdapter.install(result, projectConfig);
		ChunkedResourceDescriptions index = new ChunkedResourceDescriptions(globalIndex, result);
		index.setContainer(projectDescription.getName(), newIndex);
		externalContentSupport.configureResourceSet(result, openedDocumentsContentProvider);
		return result;
	}

	/**
	 * Create an empty resource set.
	 */
	protected XtextResourceSet createFreshResourceSet(ResourceDescriptionsData newIndex) {
		if (persistedResourceSet == null) {
			persistedResourceSet = createNewResourceSet(newIndex, persistedIndexProvider.get());
		} else {
			ChunkedResourceDescriptions resDescs = ChunkedResourceDescriptions.findInEmfObject(persistedResourceSet);
			for (Map.Entry<String, ResourceDescriptionsData> entry : persistedIndexProvider.get().entrySet()) {
				resDescs.setContainer(entry.getKey(), entry.getValue());
			}
			resDescs.setContainer(projectDescription.getName(), newIndex);
		}
		return persistedResourceSet;
	}

	/**
	 * Create and configure a new live resource set for this project.
	 *
	 * @since 2.27
	 */
	public XtextResourceSet createLiveScopeResourceSet() {
		XtextResourceSet resourceSet = createNewResourceSet(getDirtyIndexState().getResourceDescriptions(), dirtyIndexProvider.get());
		resourceSet.getLoadOptions().put(ResourceDescriptionsProvider.LIVE_SCOPE, true);
		return resourceSet;
	}

	/**
	 * Create an empty resource set.
	 *
	 * @since 2.29
	 */
	protected XtextResourceSet createDirtyResourceSet(ResourceDescriptionsData newIndex) {
		if (dirtyResourceSet == null) {
			dirtyResourceSet = createNewResourceSet(newIndex, dirtyIndexProvider.get());
			externalContentSupport.configureResourceSet(dirtyResourceSet, dirtyDocumentsContentProvider);
		} else {
			ChunkedResourceDescriptions resDescs = ChunkedResourceDescriptions.findInEmfObject(dirtyResourceSet);
			for (Map.Entry<String, ResourceDescriptionsData> entry : dirtyIndexProvider.get().entrySet()) {
				resDescs.setContainer(entry.getKey(), entry.getValue());
			}
			resDescs.setContainer(projectDescription.getName(), newIndex);
		}
		return dirtyResourceSet;
	}

	/**
	 * Get the resource with the given URI.
	 */
	public Resource getResource(URI uri) {
		Resource resource = dirtyResourceSet.getResource(uri, true);
		resource.getContents();
		return resource;
	}

	public void reportProjectIssue(String message, String code, Severity severity) {
		Issue.IssueImpl result = new Issue.IssueImpl();
		result.setMessage(message);
		result.setCode(code);
		result.setSeverity(severity);
		result.setUriToProblem(baseDir);
		issueAcceptor.apply(baseDir, ImmutableList.of(result));
	}

	/**
	 * @since 2.29
	 */
	public IndexState getPersistedIndexState() {
		return persistedIndexState;
	}

	/**
	 * @since 2.29
	 */
	protected void setPersistedIndexState(IndexState indexState) {
		this.persistedIndexState = indexState;
		setDirtyIndexState(wrapPersistedIndexState(indexState));
	}

	/**
	 * @since 2.29
	 */
	public IndexState getDirtyIndexState() {
		return dirtyIndexState;
	}
	
	/**
	 * @since 2.29
	 */
	protected void setDirtyIndexState(IndexState indexState) {
		dirtyIndexState = indexState;
		dirtyIndexProvider.get().put(projectDescription.getName(), dirtyIndexState.getResourceDescriptions());
	}

	public URI getBaseDir() {
		return baseDir;
	}

	protected Procedure2<? super URI, ? super Iterable<Issue>> getIssueAcceptor() {
		return issueAcceptor;
	}

	/**
	 * @since 2.29
	 */
	protected Provider<Map<String, ResourceDescriptionsData>> getPersistedIndexProvider() {
		return persistedIndexProvider;
	}

	/**
	 * @since 2.29
	 */
	protected Provider<Map<String, ResourceDescriptionsData>> getDirtyIndexProvider() {
		return dirtyIndexProvider;
	}

	protected IExternalContentSupport.IExternalContentProvider getOpenedDocumentsContentProvider() {
		return openedDocumentsContentProvider;
	}

	/**
	 * @since 2.29
	 */
	protected IExternalContentSupport.IExternalContentProvider getDirtyDocumentsContentProvider() {
		return dirtyDocumentsContentProvider;
	}

	/**
	 * @since 2.29
	 */
	public XtextResourceSet getPersistedResourceSet() {
		return persistedResourceSet;
	}

	/**
	 * @since 2.29
	 */
	public XtextResourceSet getDirtyResourceSet() {
		return dirtyResourceSet;
	}

	public ProjectDescription getProjectDescription() {
		return projectDescription;
	}

	public IProjectConfig getProjectConfig() {
		return projectConfig;
	}
	
	/**
	 * @since 2.21
	 */
	public void aboutToRemoveFromWorkspace() {
		for (ISourceFolder srcFolder : projectConfig.getSourceFolders()) {
			for (URI resourceURI: srcFolder.getAllResources(fileSystemScanner)) {
				issueAcceptor.apply(resourceURI, Collections.emptyList());
			}
		}
	}
}
