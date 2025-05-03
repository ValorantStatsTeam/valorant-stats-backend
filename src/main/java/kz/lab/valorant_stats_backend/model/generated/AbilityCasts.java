
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grenade",
    "ability_1",
    "ability_2",
    "ultimate"
})
@Generated("jsonschema2pojo")
public class AbilityCasts implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grenade")
    @NotNull
    private Long grenade;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_1")
    @NotNull
    private Long ability1;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_2")
    @NotNull
    private Long ability2;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ultimate")
    @NotNull
    private Long ultimate;
    private final static long serialVersionUID = -6304604696612471L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AbilityCasts() {
    }

    public AbilityCasts(Long grenade, Long ability1, Long ability2, Long ultimate) {
        super();
        this.grenade = grenade;
        this.ability1 = ability1;
        this.ability2 = ability2;
        this.ultimate = ultimate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grenade")
    public Long getGrenade() {
        return grenade;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("grenade")
    public void setGrenade(Long grenade) {
        this.grenade = grenade;
    }

    public AbilityCasts withGrenade(Long grenade) {
        this.grenade = grenade;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_1")
    public Long getAbility1() {
        return ability1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_1")
    public void setAbility1(Long ability1) {
        this.ability1 = ability1;
    }

    public AbilityCasts withAbility1(Long ability1) {
        this.ability1 = ability1;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_2")
    public Long getAbility2() {
        return ability2;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_2")
    public void setAbility2(Long ability2) {
        this.ability2 = ability2;
    }

    public AbilityCasts withAbility2(Long ability2) {
        this.ability2 = ability2;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ultimate")
    public Long getUltimate() {
        return ultimate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ultimate")
    public void setUltimate(Long ultimate) {
        this.ultimate = ultimate;
    }

    public AbilityCasts withUltimate(Long ultimate) {
        this.ultimate = ultimate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbilityCasts.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grenade");
        sb.append('=');
        sb.append(((this.grenade == null)?"<null>":this.grenade));
        sb.append(',');
        sb.append("ability1");
        sb.append('=');
        sb.append(((this.ability1 == null)?"<null>":this.ability1));
        sb.append(',');
        sb.append("ability2");
        sb.append('=');
        sb.append(((this.ability2 == null)?"<null>":this.ability2));
        sb.append(',');
        sb.append("ultimate");
        sb.append('=');
        sb.append(((this.ultimate == null)?"<null>":this.ultimate));
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
        result = ((result* 31)+((this.grenade == null)? 0 :this.grenade.hashCode()));
        result = ((result* 31)+((this.ability1 == null)? 0 :this.ability1 .hashCode()));
        result = ((result* 31)+((this.ability2 == null)? 0 :this.ability2 .hashCode()));
        result = ((result* 31)+((this.ultimate == null)? 0 :this.ultimate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AbilityCasts) == false) {
            return false;
        }
        AbilityCasts rhs = ((AbilityCasts) other);
        return (((((this.grenade == rhs.grenade)||((this.grenade!= null)&&this.grenade.equals(rhs.grenade)))&&((this.ability1 == rhs.ability1)||((this.ability1 != null)&&this.ability1 .equals(rhs.ability1))))&&((this.ability2 == rhs.ability2)||((this.ability2 != null)&&this.ability2 .equals(rhs.ability2))))&&((this.ultimate == rhs.ultimate)||((this.ultimate!= null)&&this.ultimate.equals(rhs.ultimate))));
    }

}
