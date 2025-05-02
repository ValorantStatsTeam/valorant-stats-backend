
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "afk_rounds",
    "friendly_fire",
    "rounds_in_spawn"
})
@Generated("jsonschema2pojo")
public class Behavior {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("afk_rounds")
    private Long afkRounds;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("friendly_fire")
    private FriendlyFire friendlyFire;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds_in_spawn")
    private Long roundsInSpawn;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("afk_rounds")
    public Long getAfkRounds() {
        return afkRounds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("afk_rounds")
    public void setAfkRounds(Long afkRounds) {
        this.afkRounds = afkRounds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("friendly_fire")
    public FriendlyFire getFriendlyFire() {
        return friendlyFire;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("friendly_fire")
    public void setFriendlyFire(FriendlyFire friendlyFire) {
        this.friendlyFire = friendlyFire;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds_in_spawn")
    public Long getRoundsInSpawn() {
        return roundsInSpawn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds_in_spawn")
    public void setRoundsInSpawn(Long roundsInSpawn) {
        this.roundsInSpawn = roundsInSpawn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Behavior.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("afkRounds");
        sb.append('=');
        sb.append(((this.afkRounds == null)?"<null>":this.afkRounds));
        sb.append(',');
        sb.append("friendlyFire");
        sb.append('=');
        sb.append(((this.friendlyFire == null)?"<null>":this.friendlyFire));
        sb.append(',');
        sb.append("roundsInSpawn");
        sb.append('=');
        sb.append(((this.roundsInSpawn == null)?"<null>":this.roundsInSpawn));
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
        result = ((result* 31)+((this.friendlyFire == null)? 0 :this.friendlyFire.hashCode()));
        result = ((result* 31)+((this.roundsInSpawn == null)? 0 :this.roundsInSpawn.hashCode()));
        result = ((result* 31)+((this.afkRounds == null)? 0 :this.afkRounds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Behavior) == false) {
            return false;
        }
        Behavior rhs = ((Behavior) other);
        return ((((this.friendlyFire == rhs.friendlyFire)||((this.friendlyFire!= null)&&this.friendlyFire.equals(rhs.friendlyFire)))&&((this.roundsInSpawn == rhs.roundsInSpawn)||((this.roundsInSpawn!= null)&&this.roundsInSpawn.equals(rhs.roundsInSpawn))))&&((this.afkRounds == rhs.afkRounds)||((this.afkRounds!= null)&&this.afkRounds.equals(rhs.afkRounds))));
    }

}
