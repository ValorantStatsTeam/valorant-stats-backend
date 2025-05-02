
package kz.lab.valorant_stats_backend.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "round_time_in_ms",
    "site",
    "location",
    "player",
    "player_locations"
})
@Generated("jsonschema2pojo")
public class Plant {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("round_time_in_ms")
    private Long roundTimeInMs;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("site")
    private String site;
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
    @JsonProperty("player")
    private PlayerInfo player;
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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("site")
    public String getSite() {
        return site;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("site")
    public void setSite(String site) {
        this.site = site;
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
        sb.append(Plant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("roundTimeInMs");
        sb.append('=');
        sb.append(((this.roundTimeInMs == null)?"<null>":this.roundTimeInMs));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
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
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
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
        if ((other instanceof Plant) == false) {
            return false;
        }
        Plant rhs = ((Plant) other);
        return ((((((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.roundTimeInMs == rhs.roundTimeInMs)||((this.roundTimeInMs!= null)&&this.roundTimeInMs.equals(rhs.roundTimeInMs))))&&((this.playerLocations == rhs.playerLocations)||((this.playerLocations!= null)&&this.playerLocations.equals(rhs.playerLocations))))&&((this.player == rhs.player)||((this.player!= null)&&this.player.equals(rhs.player))));
    }

}
