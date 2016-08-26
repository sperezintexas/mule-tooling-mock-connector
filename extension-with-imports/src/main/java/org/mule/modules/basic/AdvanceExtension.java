package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Import;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connector.Providers;

/**
 * Extension javadoc description
 */
@Extension(name = "basic", description = "Advance Connector Description")
@Operations({ AdvanceOperations.class })
@Configurations({ AdvanceExtensionConfig.class })
@Providers({ AdvanceConnectionProvider.class })
@Import(type = ComplexPojo.class, from = "Pojo")
public class AdvanceExtension
{

}