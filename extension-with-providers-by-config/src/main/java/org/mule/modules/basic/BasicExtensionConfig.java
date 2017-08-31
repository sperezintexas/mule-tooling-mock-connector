package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({BasicOperations.class})
@ConnectionProviders({AnotherConnectionProvider.class})
public class BasicExtensionConfig extends BaseConfig{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
