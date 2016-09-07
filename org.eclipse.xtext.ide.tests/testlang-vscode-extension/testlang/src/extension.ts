/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
'use strict';

import * as net from 'net';

import { Disposable, ExtensionContext } from 'vscode';
import { LanguageClient, LanguageClientOptions, StreamInfo } from 'vscode-languageclient';

export function activate(context: ExtensionContext) {
	let serverOptions = {
		port: 5007
	}
	let serverInfo = () => {
		// Connect to the language server via a socket channel
		let socket = net.connect(serverOptions);
		let result: StreamInfo = {
			writer: socket,
			reader: socket
		}
		return Promise.resolve(result);
	}
	
	let clientOptions: LanguageClientOptions = {
		documentSelector: ['testlang']
	}
	
	// Create the language client and start the client.
	let disposable = new LanguageClient('xtext.server', 'Xtext Server', serverInfo, clientOptions).start();
	
	// Push the disposable to the context's subscriptions so that the 
	// client can be deactivated on extension deactivation
	context.subscriptions.push(disposable);
}