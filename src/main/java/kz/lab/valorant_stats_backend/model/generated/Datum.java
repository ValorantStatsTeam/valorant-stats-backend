
package kz.lab.valorant_stats_backend.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "players",
    "observers",
    "coaches",
    "teams",
    "rounds",
    "kills"
})
@Generated("jsonschema2pojo")
public class Datum {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    private Metadata metadata;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("players")
    private List<Player> players = new ArrayList<Player>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("observers")
    private List<Observer> observers = new ArrayList<Observer>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("coaches")
    private List<Coach> coaches = new ArrayList<Coach>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams")
    private List<Team> teams = new ArrayList<Team>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds")
    private List<Round> rounds = new ArrayList<Round>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kills")
    private List<Kill> kills = new ArrayList<Kill>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("observers")
    public List<Observer> getObservers() {
        return observers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("observers")
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("coaches")
    public List<Coach> getCoaches() {
        return coaches;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("coaches")
    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds")
    public List<Round> getRounds() {
        return rounds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds")
    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kills")
    public List<Kill> getKills() {
        return kills;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kills")
    public void setKills(List<Kill> kills) {
        this.kills = kills;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("players");
        sb.append('=');
        sb.append(((this.players == null)?"<null>":this.players));
        sb.append(',');
        sb.append("observers");
        sb.append('=');
        sb.append(((this.observers == null)?"<null>":this.observers));
        sb.append(',');
        sb.append("coaches");
        sb.append('=');
        sb.append(((this.coaches == null)?"<null>":this.coaches));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
        sb.append(',');
        sb.append("rounds");
        sb.append('=');
        sb.append(((this.rounds == null)?"<null>":this.rounds));
        sb.append(',');
        sb.append("kills");
        sb.append('=');
        sb.append(((this.kills == null)?"<null>":this.kills));
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
        result = ((result* 31)+((this.coaches == null)? 0 :this.coaches.hashCode()));
        result = ((result* 31)+((this.kills == null)? 0 :this.kills.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.players == null)? 0 :this.players.hashCode()));
        result = ((result* 31)+((this.observers == null)? 0 :this.observers.hashCode()));
        result = ((result* 31)+((this.rounds == null)? 0 :this.rounds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return ((((((((this.coaches == rhs.coaches)||((this.coaches!= null)&&this.coaches.equals(rhs.coaches)))&&((this.kills == rhs.kills)||((this.kills!= null)&&this.kills.equals(rhs.kills))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams))))&&((this.players == rhs.players)||((this.players!= null)&&this.players.equals(rhs.players))))&&((this.observers == rhs.observers)||((this.observers!= null)&&this.observers.equals(rhs.observers))))&&((this.rounds == rhs.rounds)||((this.rounds!= null)&&this.rounds.equals(rhs.rounds))));
    }

}
