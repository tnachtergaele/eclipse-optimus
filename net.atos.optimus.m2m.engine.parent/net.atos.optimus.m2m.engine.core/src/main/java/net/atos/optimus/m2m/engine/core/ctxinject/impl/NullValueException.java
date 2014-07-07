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
package net.atos.optimus.m2m.engine.core.ctxinject.impl;

/**
 * Thrown when the process tries to inject a null value for a field, while the
 * field's annotation specifies that the field is not nullable. This also throws
 * the same error, if the field is updatable, and the value is null when trying
 * to update.
 * 
 * @author mvanbesien
 * 
 */
public class NullValueException extends Exception {

	private String name;

	private static final String MESSAGE = "Not allowed to inject null value into field %s";

	public NullValueException(String name) {
		this.name = name;
	}

	@Override
	public String getMessage() {
		return String.format(MESSAGE, this.name);
	}

	private static final long serialVersionUID = 1L;

}
