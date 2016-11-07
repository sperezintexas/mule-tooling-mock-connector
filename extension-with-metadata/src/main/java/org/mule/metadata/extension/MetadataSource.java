/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.metadata.extension;

import org.mule.metadata.extension.resolver.TestInputAndOutputResolverWithKeyResolver;
import org.mule.metadata.extension.resolver.TestInputAndOutputWithAttributesResolverWithKeyResolver;
import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.MetadataScope;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

import java.util.Map;


@MetadataScope(keysResolver = TestInputAndOutputResolverWithKeyResolver.class,
    outputResolver = TestInputAndOutputWithAttributesResolverWithKeyResolver.class)
public class MetadataSource extends Source<Map<String, Object>, StringAttributes> {

  @MetadataKeyId
  @Parameter
  public String type;

  @Connection
  private MetadataConnection connection;

  @Override
  public void onStart(SourceCallback<Map<String, Object>, StringAttributes> sourceCallback) throws MuleException {
    if (!type.equals(MetadataConnection.PERSON)) {
      throw new RuntimeException(String.format("Invalid MetadataKey with value [%s], the key should be [%s]", type, MetadataConnection.PERSON));
    }
  }

  @Override
  public void onStop() {

  }
}