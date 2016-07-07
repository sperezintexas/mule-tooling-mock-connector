package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.Date;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig
{

    @Parameter
    private String stringParam;

    @Parameter
    private int intPrimitiveParam;

    @Parameter
    private Integer integerParam;

    @Parameter
    private Boolean booleanParam;

    @Parameter
    private boolean booleanPrimitiveParam;

    @Parameter
    private Date dateParam;

    @Parameter
    private float floatPrimitiveParam;

    @Parameter
    private Float floatParam;

    @Parameter
    private double doublePrimitiveParam;

    @Parameter
    private Double doubleParam;


}