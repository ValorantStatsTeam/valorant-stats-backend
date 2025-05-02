
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "team_id",
    "rounds",
    "won",
    "premier_roster"
})
@Generated("jsonschema2pojo")
public class Team {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_id")
    private String teamId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds")
    private Rounds rounds;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("won")
    private Boolean won;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("premier_roster")
    private PremierRoster premierRoster;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds")
    public Rounds getRounds() {
        return rounds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds")
    public void setRounds(Rounds rounds) {
        this.rounds = rounds;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("won")
    public Boolean getWon() {
        return won;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("won")
    public void setWon(Boolean won) {
        this.won = won;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("premier_roster")
    public PremierRoster getPremierRoster() {
        return premierRoster;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("premier_roster")
    public void setPremierRoster(PremierRoster premierRoster) {
        this.premierRoster = premierRoster;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Team.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("teamId");
        sb.append('=');
        sb.append(((this.teamId == null)?"<null>":this.teamId));
        sb.append(',');
        sb.append("rounds");
        sb.append('=');
        sb.append(((this.rounds == null)?"<null>":this.rounds));
        sb.append(',');
        sb.append("won");
        sb.append('=');
        sb.append(((this.won == null)?"<null>":this.won));
        sb.append(',');
        sb.append("premierRoster");
        sb.append('=');
        sb.append(((this.premierRoster == null)?"<null>":this.premierRoster));
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
        result = ((result* 31)+((this.premierRoster == null)? 0 :this.premierRoster.hashCode()));
        result = ((result* 31)+((this.rounds == null)? 0 :this.rounds.hashCode()));
        result = ((result* 31)+((this.teamId == null)? 0 :this.teamId.hashCode()));
        result = ((result* 31)+((this.won == null)? 0 :this.won.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team) == false) {
            return false;
        }
        Team rhs = ((Team) other);
        return (((((this.premierRoster == rhs.premierRoster)||((this.premierRoster!= null)&&this.premierRoster.equals(rhs.premierRoster)))&&((this.rounds == rhs.rounds)||((this.rounds!= null)&&this.rounds.equals(rhs.rounds))))&&((this.teamId == rhs.teamId)||((this.teamId!= null)&&this.teamId.equals(rhs.teamId))))&&((this.won == rhs.won)||((this.won!= null)&&this.won.equals(rhs.won))));
    }

}
