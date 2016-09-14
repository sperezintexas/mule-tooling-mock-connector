package org.mule.modules.basic;

import static org.mule.runtime.extension.api.introspection.parameter.ExpressionSupport.NOT_SUPPORTED;
import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig {
	/**
	 * Complex pojo at config description
	 */
	@Parameter
	@Expression(NOT_SUPPORTED)
	private ComplexPojo complexPojoAtConfig;

	/**
	 * Ingredient At Config description
	 */
	@Parameter
	@Expression(NOT_SUPPORTED)
	private Ingredient ingredientAtConfig;

}