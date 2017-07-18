package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Import;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Extension javadoc description
 */
@Extension(name = "Imports", description = "Connectors With Imports Description")
@Configurations({ AdvanceExtensionConfig.class })
@ConnectionProviders({ AdvanceConnectionProvider.class })
@Import(type = ComplexPojo.class)
public class AdvanceExtension
{

}