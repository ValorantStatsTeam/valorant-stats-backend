
package kz.lab.valorant_stats_backend.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "round",
    "time_in_round_in_ms",
    "time_in_match_in_ms",
    "killer",
    "victim",
    "assistants",
    "location",
    "weapon",
    "secondary_fire_mode",
    "player_locations"
})
@Generated("jsonschema2pojo")
public class Kill {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round")
    private Long round;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_in_round_in_ms")
    private Long timeInRoundInMs;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_in_match_in_ms")
    private Long timeInMatchInMs;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("killer")
    private PlayerInfo killer;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("victim")
    private PlayerInfo victim;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assistants")
    private List<PlayerInfo> assistants = new ArrayList<PlayerInfo>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    private Location location;
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
    @JsonProperty("secondary_fire_mode")
    private Boolean secondaryFireMode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("player_locations")
    private List<PlayerLocation> playerLocations = new ArrayList<PlayerLocation>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round")
    public Long getRound() {
        return round;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round")
    public void setRound(Long round) {
        this.round = round;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_in_round_in_ms")
    public Long getTimeInRoundInMs() {
        return timeInRoundInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_in_round_in_ms")
    public void setTimeInRoundInMs(Long timeInRoundInMs) {
        this.timeInRoundInMs = timeInRoundInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_in_match_in_ms")
    public Long getTimeInMatchInMs() {
        return timeInMatchInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_in_match_in_ms")
    public void setTimeInMatchInMs(Long timeInMatchInMs) {
        this.timeInMatchInMs = timeInMatchInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("killer")
    public PlayerInfo getKiller() {
        return killer;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("killer")
    public void setKiller(PlayerInfo killer) {
        this.killer = killer;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("victim")
    public PlayerInfo getVictim() {
        return victim;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("victim")
    public void setVictim(PlayerInfo victim) {
        this.victim = victim;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assistants")
    public List<PlayerInfo> getAssistants() {
        return assistants;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assistants")
    public void setAssistants(List<PlayerInfo> assistants) {
        this.assistants = assistants;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
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
    @JsonProperty("secondary_fire_mode")
    public Boolean getSecondaryFireMode() {
        return secondaryFireMode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secondary_fire_mode")
    public void setSecondaryFireMode(Boolean secondaryFireMode) {
        this.secondaryFireMode = secondaryFireMode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("player_locations")
    public List<PlayerLocation> getPlayerLocations() {
        return playerLocations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("player_locations")
    public void setPlayerLocations(List<PlayerLocation> playerLocations) {
        this.playerLocations = playerLocations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Kill.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("round");
        sb.append('=');
        sb.append(((this.round == null)?"<null>":this.round));
        sb.append(',');
        sb.append("timeInRoundInMs");
        sb.append('=');
        sb.append(((this.timeInRoundInMs == null)?"<null>":this.timeInRoundInMs));
        sb.append(',');
        sb.append("timeInMatchInMs");
        sb.append('=');
        sb.append(((this.timeInMatchInMs == null)?"<null>":this.timeInMatchInMs));
        sb.append(',');
        sb.append("killer");
        sb.append('=');
        sb.append(((this.killer == null)?"<null>":this.killer));
        sb.append(',');
        sb.append("victim");
        sb.append('=');
        sb.append(((this.victim == null)?"<null>":this.victim));
        sb.append(',');
        sb.append("assistants");
        sb.append('=');
        sb.append(((this.assistants == null)?"<null>":this.assistants));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("weapon");
        sb.append('=');
        sb.append(((this.weapon == null)?"<null>":this.weapon));
        sb.append(',');
        sb.append("secondaryFireMode");
        sb.append('=');
        sb.append(((this.secondaryFireMode == null)?"<null>":this.secondaryFireMode));
        sb.append(',');
        sb.append("playerLocations");
        sb.append('=');
        sb.append(((this.playerLocations == null)?"<null>":this.playerLocations));
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
        result = ((result* 31)+((this.timeInMatchInMs == null)? 0 :this.timeInMatchInMs.hashCode()));
        result = ((result* 31)+((this.assistants == null)? 0 :this.assistants.hashCode()));
        result = ((result* 31)+((this.weapon == null)? 0 :this.weapon.hashCode()));
        result = ((result* 31)+((this.round == null)? 0 :this.round.hashCode()));
        result = ((result* 31)+((this.victim == null)? 0 :this.victim.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.killer == null)? 0 :this.killer.hashCode()));
        result = ((result* 31)+((this.playerLocations == null)? 0 :this.playerLocations.hashCode()));
        result = ((result* 31)+((this.timeInRoundInMs == null)? 0 :this.timeInRoundInMs.hashCode()));
        result = ((result* 31)+((this.secondaryFireMode == null)? 0 :this.secondaryFireMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Kill) == false) {
            return false;
        }
        Kill rhs = ((Kill) other);
        return (((((((((((this.timeInMatchInMs == rhs.timeInMatchInMs)||((this.timeInMatchInMs!= null)&&this.timeInMatchInMs.equals(rhs.timeInMatchInMs)))&&((this.assistants == rhs.assistants)||((this.assistants!= null)&&this.assistants.equals(rhs.assistants))))&&((this.weapon == rhs.weapon)||((this.weapon!= null)&&this.weapon.equals(rhs.weapon))))&&((this.round == rhs.round)||((this.round!= null)&&this.round.equals(rhs.round))))&&((this.victim == rhs.victim)||((this.victim!= null)&&this.victim.equals(rhs.victim))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.killer == rhs.killer)||((this.killer!= null)&&this.killer.equals(rhs.killer))))&&((this.playerLocations == rhs.playerLocations)||((this.playerLocations!= null)&&this.playerLocations.equals(rhs.playerLocations))))&&((this.timeInRoundInMs == rhs.timeInRoundInMs)||((this.timeInRoundInMs!= null)&&this.timeInRoundInMs.equals(rhs.timeInRoundInMs))))&&((this.secondaryFireMode == rhs.secondaryFireMode)||((this.secondaryFireMode!= null)&&this.secondaryFireMode.equals(rhs.secondaryFireMode))));
    }

}
