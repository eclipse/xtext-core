/**
 * Copyright (c) 2017, 2019 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.server;

import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.ServerCapabilities;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public interface ICapabilitiesContributor {
  /**
   * Allows an individual language to contribute to and overwrite properties in the server's capabilities.
   */
  public abstract ServerCapabilities contribute(final ServerCapabilities capabilities, final InitializeParams params);
}
