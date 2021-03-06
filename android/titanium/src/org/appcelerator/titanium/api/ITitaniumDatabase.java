/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.titanium.api;

public interface ITitaniumDatabase {

	public ITitaniumDB install(String pathOrUrl, String name);

	public ITitaniumDB open(String name);

	// Internal
	public String getLastException();
}
