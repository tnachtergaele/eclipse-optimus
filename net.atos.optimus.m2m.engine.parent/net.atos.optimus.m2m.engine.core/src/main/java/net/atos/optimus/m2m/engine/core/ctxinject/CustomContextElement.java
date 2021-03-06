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
package net.atos.optimus.m2m.engine.core.ctxinject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Injects an context element into a field declared into an Optimus
 * transformation implementation.
 * 
 * The relation between the EObject to use as a key, from the current
 * transformation EObject, is computed by the implementation (contextRetriever)
 * to provide as a parameter.
 * 
 * @author mvanbesien
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CustomContextElement {

	/**
	 * @return the implementation used to retrieve, from the current EObject, the EObject to be
	 * used as a key in the context.
	 */
	Class<? extends IContextRetriever> contextRetriever();

	/**
	 * @return the mapping part of the key to use. Default is SELF
	 */
	String value() default ContextDefaultValues.SELF;

	/**
	 * @return the Context Element visibility. Default is IN
	 */
	ContextElementVisibility visibility() default ContextElementVisibility.IN;

	/**
	 * @return If set to false, and exception will be thrown is the value to
	 *         inject is null
	 */
	boolean nullable() default true;

}
