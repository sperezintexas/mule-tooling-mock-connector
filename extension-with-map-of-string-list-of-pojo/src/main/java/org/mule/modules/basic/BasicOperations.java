package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.List;
import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param mapParameters Map param description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithMap(@Config BasicExtensionConfig config, Map<String,List<Ingredient>> mapParameters) {
			return null;
	}

}
