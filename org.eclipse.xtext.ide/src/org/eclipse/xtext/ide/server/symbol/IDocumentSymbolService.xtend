/*******************************************************************************
 * Copyright (c) 2018 TypeFox and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.server.symbol

import com.google.common.annotations.Beta
import com.google.inject.ImplementedBy
import java.util.List
import org.eclipse.lsp4j.DocumentSymbol
import org.eclipse.lsp4j.DocumentSymbolParams
import org.eclipse.lsp4j.SymbolInformation
import org.eclipse.lsp4j.jsonrpc.messages.Either
import org.eclipse.xtext.ide.server.Document
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator

/**
 * Common service interface for providing document symbol information for text documents.
 * 
 * <p>
 * For more details, see the <a href="https://microsoft.github.io/language-server-protocol/specification#textDocument_documentSymbol">{@code textDocument/documentSymbol}</a> LSP method.
 * 
 * <p>
 * This interface is not meant to be injected. Use the {@link DocumentSymbolService} and the {@link HierarchicalDocumentSymbolService} directly instead.
 */
@Beta
@ImplementedBy(Noop)
interface IDocumentSymbolService {

	def List<Either<SymbolInformation, DocumentSymbol>> getSymbols(Document document, XtextResource resource,
		DocumentSymbolParams params, CancelIndicator cancelIndicator);

	static class Noop implements IDocumentSymbolService {

		override getSymbols(Document document, XtextResource resource, DocumentSymbolParams params,
			CancelIndicator cancelIndicator) {

			return emptyList;
		}

	}

}
