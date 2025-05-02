
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "loadout_value",
    "remaining",
    "weapon",
    "armor"
})
@Generated("jsonschema2pojo")
public class RoundEconomy {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loadout_value")
    private Long loadoutValue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remaining")
    private Long remaining;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("weapon")
    private Weapon weapon;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("armor")
    private Armor armor;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loadout_value")
    public Long getLoadoutValue() {
        return loadoutValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("loadout_value")
    public void setLoadoutValue(Long loadoutValue) {
        this.loadoutValue = loadoutValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remaining")
    public Long getRemaining() {
        return remaining;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("remaining")
    public void setRemaining(Long remaining) {
        this.remaining = remaining;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("weapon")
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("weapon")
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("armor")
    public Armor getArmor() {
        return armor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("armor")
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoundEconomy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("loadoutValue");
        sb.append('=');
        sb.append(((this.loadoutValue == null)?"<null>":this.loadoutValue));
        sb.append(',');
        sb.append("remaining");
        sb.append('=');
        sb.append(((this.remaining == null)?"<null>":this.remaining));
        sb.append(',');
        sb.append("weapon");
        sb.append('=');
        sb.append(((this.weapon == null)?"<null>":this.weapon));
        sb.append(',');
        sb.append("armor");
        sb.append('=');
        sb.append(((this.armor == null)?"<null>":this.armor));
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
        result = ((result* 31)+((this.weapon == null)? 0 :this.weapon.hashCode()));
        result = ((result* 31)+((this.armor == null)? 0 :this.armor.hashCode()));
        result = ((result* 31)+((this.remaining == null)? 0 :this.remaining.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoundEconomy) == false) {
            return false;
        }
        RoundEconomy rhs = ((RoundEconomy) other);
        return (((((this.loadoutValue == rhs.loadoutValue)||((this.loadoutValue!= null)&&this.loadoutValue.equals(rhs.loadoutValue)))&&((this.weapon == rhs.weapon)||((this.weapon!= null)&&this.weapon.equals(rhs.weapon))))&&((this.armor == rhs.armor)||((this.armor!= null)&&this.armor.equals(rhs.armor))))&&((this.remaining == rhs.remaining)||((this.remaining!= null)&&this.remaining.equals(rhs.remaining))));
    }

}
