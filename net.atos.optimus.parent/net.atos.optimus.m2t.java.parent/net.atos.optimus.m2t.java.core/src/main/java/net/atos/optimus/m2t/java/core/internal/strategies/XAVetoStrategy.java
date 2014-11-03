/**
 * Optimus, framework for Model Transformation
 *
 * Copyright (C) 2013 Worldline or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */
package net.atos.optimus.m2t.java.core.internal.strategies;

import net.atos.optimus.m2t.java.core.FileHandler;
import net.atos.optimus.m2t.java.core.IPostGenerationVetoStrategy;

/**
 * Default veto strategy. At the moment, it always accepts rewriting process.
 * 
 * @author Maxence Vanbésien (mvaawl@gmail.com)
 * @since 1.0
 * 
 */
public class XAVetoStrategy implements IPostGenerationVetoStrategy {

	/*
	 * (non-Javadoc)
	 * @see net.atos.optimus.m2t.java.core.IPostGenerationVetoStrategy#hasVeto(net.atos.optimus.m2t.java.core.FileHandler)
	 */
	public boolean hasVeto(FileHandler fileHandler) {
		return false;
	}

}
