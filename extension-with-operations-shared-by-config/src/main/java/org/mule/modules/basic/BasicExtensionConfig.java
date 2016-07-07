package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.connector.Providers;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({BasicOperations.class})
@Providers({BasicConnectionProvider.class})
public class BasicExtensionConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}