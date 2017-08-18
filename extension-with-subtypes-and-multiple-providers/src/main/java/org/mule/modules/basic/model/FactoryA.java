package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;

@TypeDsl(allowTopLevelDefinition = true)
public final class FactoryA implements IFactory
{
    @Parameter
    private String paramaterA;
}
