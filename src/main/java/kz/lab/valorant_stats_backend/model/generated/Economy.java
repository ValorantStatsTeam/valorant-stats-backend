
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "spent",
    "loadout_value"
})
@Generated("jsonschema2pojo")
public class Economy implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spent")
    @Valid
    @NotNull
    private EconomyValue spent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loadout_value")
    @Valid
    @NotNull
    private EconomyValue loadoutValue;
    private final static long serialVersionUID = -5671957563667117668L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Economy() {
    }

    public Economy(EconomyValue spent, EconomyValue loadoutValue) {
        super();
        this.spent = spent;
        this.loadoutValue = loadoutValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spent")
    public EconomyValue getSpent() {
        return spent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spent")
    public void setSpent(EconomyValue spent) {
        this.spent = spent;
    }

    public Economy withSpent(EconomyValue spent) {
        this.spent = spent;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loadout_value")
    public EconomyValue getLoadoutValue() {
        return loadoutValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loadout_value")
    public void setLoadoutValue(EconomyValue loadoutValue) {
        this.loadoutValue = loadoutValue;
    }

    public Economy withLoadoutValue(EconomyValue loadoutValue) {
        this.loadoutValue = loadoutValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Economy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("spent");
        sb.append('=');
        sb.append(((this.spent == null)?"<null>":this.spent));
        sb.append(',');
        sb.append("loadoutValue");
        sb.append('=');
        sb.append(((this.loadoutValue == null)?"<null>":this.loadoutValue));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.loadoutValue == null)? 0 :this.loadoutValue.hashCode()));
        result = ((result* 31)+((this.spent == null)? 0 :this.spent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Economy) == false) {
            return false;
        }
        Economy rhs = ((Economy) other);
        return (((this.loadoutValue == rhs.loadoutValue)||((this.loadoutValue!= null)&&this.loadoutValue.equals(rhs.loadoutValue)))&&((this.spent == rhs.spent)||((this.spent!= null)&&this.spent.equals(rhs.spent))));
    }

}
