
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
    "ability_casts",
    "player",
    "damage_events",
    "stats",
    "economy",
    "was_afk",
    "received_penalty",
    "stayed_in_spawn"
})
@Generated("jsonschema2pojo")
public class RoundStats implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_casts")
    @Valid
    @NotNull
    private AbilityCasts abilityCasts;
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
    @JsonProperty("damage_events")
    @Valid
    @NotNull
    private List<DamageEvent> damageEvents = new ArrayList<DamageEvent>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    @Valid
    @NotNull
    private PlayerStats stats;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("economy")
    @Valid
    @NotNull
    private RoundEconomy economy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("was_afk")
    @NotNull
    private Boolean wasAfk;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("received_penalty")
    @NotNull
    private Boolean receivedPenalty;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stayed_in_spawn")
    @NotNull
    private Boolean stayedInSpawn;
    private final static long serialVersionUID = -7471613967791113358L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RoundStats() {
    }

    public RoundStats(AbilityCasts abilityCasts, PlayerInfo player, List<DamageEvent> damageEvents, PlayerStats stats, RoundEconomy economy, Boolean wasAfk, Boolean receivedPenalty, Boolean stayedInSpawn) {
        super();
        this.abilityCasts = abilityCasts;
        this.player = player;
        this.damageEvents = damageEvents;
        this.stats = stats;
        this.economy = economy;
        this.wasAfk = wasAfk;
        this.receivedPenalty = receivedPenalty;
        this.stayedInSpawn = stayedInSpawn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_casts")
    public AbilityCasts getAbilityCasts() {
        return abilityCasts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_casts")
    public void setAbilityCasts(AbilityCasts abilityCasts) {
        this.abilityCasts = abilityCasts;
    }

    public RoundStats withAbilityCasts(AbilityCasts abilityCasts) {
        this.abilityCasts = abilityCasts;
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

    public RoundStats withPlayer(PlayerInfo player) {
        this.player = player;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage_events")
    public List<DamageEvent> getDamageEvents() {
        return damageEvents;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage_events")
    public void setDamageEvents(List<DamageEvent> damageEvents) {
        this.damageEvents = damageEvents;
    }

    public RoundStats withDamageEvents(List<DamageEvent> damageEvents) {
        this.damageEvents = damageEvents;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public PlayerStats getStats() {
        return stats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }

    public RoundStats withStats(PlayerStats stats) {
        this.stats = stats;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("economy")
    public RoundEconomy getEconomy() {
        return economy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("economy")
    public void setEconomy(RoundEconomy economy) {
        this.economy = economy;
    }

    public RoundStats withEconomy(RoundEconomy economy) {
        this.economy = economy;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("was_afk")
    public Boolean getWasAfk() {
        return wasAfk;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("was_afk")
    public void setWasAfk(Boolean wasAfk) {
        this.wasAfk = wasAfk;
    }

    public RoundStats withWasAfk(Boolean wasAfk) {
        this.wasAfk = wasAfk;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("received_penalty")
    public Boolean getReceivedPenalty() {
        return receivedPenalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("received_penalty")
    public void setReceivedPenalty(Boolean receivedPenalty) {
        this.receivedPenalty = receivedPenalty;
    }

    public RoundStats withReceivedPenalty(Boolean receivedPenalty) {
        this.receivedPenalty = receivedPenalty;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stayed_in_spawn")
    public Boolean getStayedInSpawn() {
        return stayedInSpawn;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stayed_in_spawn")
    public void setStayedInSpawn(Boolean stayedInSpawn) {
        this.stayedInSpawn = stayedInSpawn;
    }

    public RoundStats withStayedInSpawn(Boolean stayedInSpawn) {
        this.stayedInSpawn = stayedInSpawn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoundStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("abilityCasts");
        sb.append('=');
        sb.append(((this.abilityCasts == null)?"<null>":this.abilityCasts));
        sb.append(',');
        sb.append("player");
        sb.append('=');
        sb.append(((this.player == null)?"<null>":this.player));
        sb.append(',');
        sb.append("damageEvents");
        sb.append('=');
        sb.append(((this.damageEvents == null)?"<null>":this.damageEvents));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
        sb.append(',');
        sb.append("economy");
        sb.append('=');
        sb.append(((this.economy == null)?"<null>":this.economy));
        sb.append(',');
        sb.append("wasAfk");
        sb.append('=');
        sb.append(((this.wasAfk == null)?"<null>":this.wasAfk));
        sb.append(',');
        sb.append("receivedPenalty");
        sb.append('=');
        sb.append(((this.receivedPenalty == null)?"<null>":this.receivedPenalty));
        sb.append(',');
        sb.append("stayedInSpawn");
        sb.append('=');
        sb.append(((this.stayedInSpawn == null)?"<null>":this.stayedInSpawn));
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
        result = ((result* 31)+((this.wasAfk == null)? 0 :this.wasAfk.hashCode()));
        result = ((result* 31)+((this.damageEvents == null)? 0 :this.damageEvents.hashCode()));
        result = ((result* 31)+((this.receivedPenalty == null)? 0 :this.receivedPenalty.hashCode()));
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        result = ((result* 31)+((this.abilityCasts == null)? 0 :this.abilityCasts.hashCode()));
        result = ((result* 31)+((this.economy == null)? 0 :this.economy.hashCode()));
        result = ((result* 31)+((this.stayedInSpawn == null)? 0 :this.stayedInSpawn.hashCode()));
        result = ((result* 31)+((this.player == null)? 0 :this.player.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoundStats) == false) {
            return false;
        }
        RoundStats rhs = ((RoundStats) other);
        return (((((((((this.wasAfk == rhs.wasAfk)||((this.wasAfk!= null)&&this.wasAfk.equals(rhs.wasAfk)))&&((this.damageEvents == rhs.damageEvents)||((this.damageEvents!= null)&&this.damageEvents.equals(rhs.damageEvents))))&&((this.receivedPenalty == rhs.receivedPenalty)||((this.receivedPenalty!= null)&&this.receivedPenalty.equals(rhs.receivedPenalty))))&&((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats))))&&((this.abilityCasts == rhs.abilityCasts)||((this.abilityCasts!= null)&&this.abilityCasts.equals(rhs.abilityCasts))))&&((this.economy == rhs.economy)||((this.economy!= null)&&this.economy.equals(rhs.economy))))&&((this.stayedInSpawn == rhs.stayedInSpawn)||((this.stayedInSpawn!= null)&&this.stayedInSpawn.equals(rhs.stayedInSpawn))))&&((this.player == rhs.player)||((this.player!= null)&&this.player.equals(rhs.player))));
    }

}
