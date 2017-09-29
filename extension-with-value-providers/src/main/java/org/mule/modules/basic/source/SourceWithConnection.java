/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic.source;

import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.modules.basic.ValuesConnection;
import org.mule.modules.basic.resolver.WithConnectionValueProvider;

@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
public class SourceWithConnection extends AbstractSource {

  @OfValues(WithConnectionValueProvider.class)
  @Parameter
  String channel;

  @Connection
  ValuesConnection connection;

}
