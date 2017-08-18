package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

@TypeDsl(allowTopLevelDefinition = true)
public class Ingredient
{

    @Parameter
    @Summary("Field Summary")
    private double amount;

    @Parameter
    private String type;

    @Parameter
    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Optional( defaultValue = "6")
    private String noExpressionField;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getNoExpressionField()
    {
        return noExpressionField;
    }

    public void setNoExpressionField(String noExpressionField)
    {
        this.noExpressionField = noExpressionField;
    }

}
