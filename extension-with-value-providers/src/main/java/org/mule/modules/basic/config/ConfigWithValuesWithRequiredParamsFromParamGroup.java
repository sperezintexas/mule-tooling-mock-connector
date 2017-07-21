/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic.config;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.modules.basic.GroupWithValuesParameter;
import org.mule.modules.basic.connection.ValuesConnectionProvider;
import org.mule.modules.basic.resolver.WithRequiredParameterFromGroupValueProvider;

@Configuration(name = "ValuesWithRequiredParamsFromParamGroup")
@ConnectionProviders(ValuesConnectionProvider.class)
public class ConfigWithValuesWithRequiredParamsFromParamGroup {

  @Parameter
  @OfValues(WithRequiredParameterFromGroupValueProvider.class)
  String valueParam;

  @ParameterGroup(name = "someGroup")
  GroupWithValuesParameter paramGroup;
}
