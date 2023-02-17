/**
 * Copyright (c) 2015, 2023 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.wizard;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.JUnitVersion;
import org.eclipse.xtext.util.XtextVersion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@FinalFieldsConstructor
@SuppressWarnings("all")
public class TargetPlatformProject extends ProjectDescriptor {
  @Override
  public String getNameQualifier() {
    return ".target";
  }

  @Override
  public boolean isEclipsePluginProject() {
    return false;
  }

  @Override
  public boolean isPartOfGradleBuild() {
    return false;
  }

  @Override
  public boolean isPartOfMavenBuild() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return this.getConfig().needsTychoBuild();
  }

  @Override
  public void setEnabled(final boolean enabled) {
    throw new UnsupportedOperationException("The target platform project is activated automatically for Tycho builds");
  }

  @Override
  public Iterable<? extends AbstractFile> getFiles() {
    ArrayList<AbstractFile> _xblockexpression = null;
    {
      final ArrayList<AbstractFile> files = CollectionLiterals.<AbstractFile>newArrayList();
      Iterable<? extends AbstractFile> _files = super.getFiles();
      Iterables.<AbstractFile>addAll(files, _files);
      String _name = this.getName();
      String _plus = (_name + ".target");
      PlainTextFile _file = this.file(Outlet.ROOT, _plus, this.target());
      files.add(_file);
      _xblockexpression = files;
    }
    return _xblockexpression;
  }

  @Override
  public Set<SourceFolderDescriptor> getSourceFolders() {
    return Collections.<SourceFolderDescriptor>unmodifiableSet(CollectionLiterals.<SourceFolderDescriptor>newHashSet());
  }

  public CharSequence target() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<?pde version=\"3.8\"?>");
    _builder.newLine();
    _builder.append("<target name=\"");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append("\" sequenceNumber=\"1\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<locations>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<location includeAllPlatforms=\"false\" includeConfigurePhase=\"false\" includeMode=\"planner\" includeSource=\"true\" type=\"InstallableUnit\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.eclipse.jdt.feature.group\" version=\"0.0.0\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.eclipse.platform.feature.group\" version=\"0.0.0\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.eclipse.pde.feature.group\" version=\"0.0.0\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.eclipse.draw2d.feature.group\" version=\"0.0.0\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.eclipse.emf.sdk.feature.group\" version=\"0.0.0\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<repository location=\"https://download.eclipse.org/releases/2023-03\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<location includeAllPlatforms=\"false\" includeConfigurePhase=\"false\" includeMode=\"planner\" includeSource=\"true\" type=\"InstallableUnit\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.eclipse.emf.mwe2.launcher.feature.group\" version=\"0.0.0\"/>");
    _builder.newLine();
    {
      boolean _matches = this.getConfig().getXtextVersion().getMweVersion().matches("\\d+\\.\\d+(\\.\\d+)+");
      if (_matches) {
        _builder.append("\t\t\t");
        _builder.append("<repository location=\"https://download.eclipse.org/modeling/emft/mwe/updates/releases/");
        String _mweVersion = this.getConfig().getXtextVersion().getMweVersion();
        _builder.append(_mweVersion, "\t\t\t");
        _builder.append("/\"/>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t\t\t");
        _builder.append("<repository location=\"https://download.eclipse.org/modeling/emft/mwe/updates/milestones/");
        String _mweBuildNumber = this.getConfig().getXtextVersion().getMweBuildNumber();
        _builder.append(_mweBuildNumber, "\t\t\t");
        _builder.append("/\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<location includeAllPlatforms=\"false\" includeConfigurePhase=\"false\" includeMode=\"planner\" includeSource=\"true\" type=\"InstallableUnit\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.eclipse.xtext.sdk.feature.group\" version=\"0.0.0\"/>");
    _builder.newLine();
    {
      boolean _isSnapshot = this.getConfig().getXtextVersion().isSnapshot();
      if (_isSnapshot) {
        _builder.append("\t\t\t");
        _builder.append("<repository location=\"https://download.eclipse.org/modeling/tmf/xtext/updates/nightly/\"/>");
        _builder.newLine();
      } else {
        boolean _isStable = this.getConfig().getXtextVersion().isStable();
        if (_isStable) {
          _builder.append("\t\t\t");
          _builder.append("<repository location=\"https://download.eclipse.org/modeling/tmf/xtext/updates/milestones/\"/>");
          _builder.newLine();
        } else {
          _builder.append("\t\t\t");
          _builder.append("<repository location=\"https://download.eclipse.org/modeling/tmf/xtext/updates/releases/");
          XtextVersion _xtextVersion = this.getConfig().getXtextVersion();
          _builder.append(_xtextVersion, "\t\t\t");
          _builder.append("/\"/>");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<location includeAllPlatforms=\"false\" includeConfigurePhase=\"false\" includeMode=\"planner\" includeSource=\"true\" type=\"InstallableUnit\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"com.google.gson\" version=\"2.10.1.v20230109-0753\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"com.google.inject\" version=\"5.0.1.v20221112-0806\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"javax.inject\" version=\"1.0.0.v20220405-0441\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.antlr.runtime\" version=\"3.2.0.v20220404-1927\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.junit\" version=\"4.13.2.v20211018-1956\"/>");
    _builder.newLine();
    {
      JUnitVersion _junitVersion = this.getConfig().getJunitVersion();
      boolean _equals = Objects.equal(_junitVersion, JUnitVersion.JUNIT_5);
      if (_equals) {
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.apiguardian\" version=\"1.1.2.v20211018-1956\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.jupiter.api\" version=\"5.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.jupiter.engine\" version=\"5.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.jupiter.migrationsupport\" version=\"5.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.jupiter.params\" version=\"5.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.platform.commons\" version=\"1.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.platform.engine\" version=\"1.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.platform.launcher\" version=\"1.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.platform.runner\" version=\"1.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.platform.suite.commons\" version=\"1.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.junit.vintage.engine\" version=\"5.9.1.v20221103-2317\"/>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<unit id=\"org.opentest4j\" version=\"1.2.0.v20211018-1956\"/>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"org.objectweb.asm\" version=\"9.4.0.v20221107-1714\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<unit id=\"io.github.classgraph\" version=\"4.8.149.v20220915-0556\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<repository location=\"https://download.eclipse.org/tools/orbit/downloads/2023-03\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</locations>");
    _builder.newLine();
    _builder.append("</target>");
    _builder.newLine();
    return _builder;
  }

  @Override
  public GradleBuildFile buildGradle() {
    throw new UnsupportedOperationException("Eclipse target platforms are not yet supported in Gradle");
  }

  @Override
  public PomFile pom() {
    PomFile _pom = super.pom();
    final Procedure1<PomFile> _function = (PomFile it) -> {
      it.setPackaging("eclipse-target-definition");
    };
    return ObjectExtensions.<PomFile>operator_doubleArrow(_pom, _function);
  }

  public TargetPlatformProject(final WizardConfiguration config) {
    super(config);
  }
}
