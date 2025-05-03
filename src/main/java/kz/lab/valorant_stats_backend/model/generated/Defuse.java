
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "round_time_in_ms",
    "location",
    "player",
    "player_locations"
})
@Generated("jsonschema2pojo")
public class Defuse implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round_time_in_ms")
    @NotNull
    private Long roundTimeInMs;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    @NotNull
    private String location;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("player")
    @Valid
    @NotNull
    private PlayerInfo player;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("player_locations")
    @Valid
    @NotNull
    private List<PlayerLocation> playerLocations = new ArrayList<PlayerLocation>();
    private final static long serialVersionUID = -3732355386014914724L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Defuse() {
    }

    public Defuse(Long roundTimeInMs, String location, PlayerInfo player, List<PlayerLocation> playerLocations) {
        super();
        this.roundTimeInMs = roundTimeInMs;
        this.location = location;
        this.player = player;
        this.playerLocations = playerLocations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round_time_in_ms")
    public Long getRoundTimeInMs() {
        return roundTimeInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round_time_in_ms")
    public void setRoundTimeInMs(Long roundTimeInMs) {
        this.roundTimeInMs = roundTimeInMs;
    }

    public Defuse withRoundTimeInMs(Long roundTimeInMs) {
        this.roundTimeInMs = roundTimeInMs;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Defuse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("player")
    public PlayerInfo getPlayer() {
        return player;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("player")
    public void setPlayer(PlayerInfo player) {
        this.player = player;
    }

    public Defuse withPlayer(PlayerInfo player) {
        this.player = player;
        return this;
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

    public Defuse withPlayerLocations(List<PlayerLocation> playerLocations) {
        this.playerLocations = playerLocations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Defuse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("roundTimeInMs");
        sb.append('=');
        sb.append(((this.roundTimeInMs == null)?"<null>":this.roundTimeInMs));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("player");
        sb.append('=');
        sb.append(((this.player == null)?"<null>":this.player));
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
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.roundTimeInMs == null)? 0 :this.roundTimeInMs.hashCode()));
        result = ((result* 31)+((this.playerLocations == null)? 0 :this.playerLocations.hashCode()));
        result = ((result* 31)+((this.player == null)? 0 :this.player.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Defuse) == false) {
            return false;
        }
        Defuse rhs = ((Defuse) other);
        return (((((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location)))&&((this.roundTimeInMs == rhs.roundTimeInMs)||((this.roundTimeInMs!= null)&&this.roundTimeInMs.equals(rhs.roundTimeInMs))))&&((this.playerLocations == rhs.playerLocations)||((this.playerLocations!= null)&&this.playerLocations.equals(rhs.playerLocations))))&&((this.player == rhs.player)||((this.player!= null)&&this.player.equals(rhs.player))));
    }

}
