package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@TypeDsl(allowTopLevelDefinition = true)
public final class FactoryC implements IFactory
{
    @Parameter
    @Optional
    private String paramaterC;
}
