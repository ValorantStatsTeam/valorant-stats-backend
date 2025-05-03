
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
    "team_id",
    "rounds",
    "won",
    "premier_roster",
    "name",
    "code",
    "icon",
    "has_won",
    "game_wins",
    "record"
})
@Generated("jsonschema2pojo")
public class Team implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_id")
    @NotNull
    private String teamId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rounds")
    @Valid
    @NotNull
    private Rounds rounds;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("won")
    @NotNull
    private Boolean won;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("premier_roster")
    @Valid
    @NotNull
    private PremierRoster premierRoster;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @NotNull
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    @NotNull
    private String code;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("icon")
    @NotNull
    private String icon;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_won")
    @NotNull
    private Boolean hasWon;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_wins")
    @NotNull
    private Long gameWins;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("record")
    @Valid
    @NotNull
    private Record record;
    private final static long serialVersionUID = 4592671632914148851L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Team() {
    }

    public Team(String teamId, Rounds rounds, Boolean won, PremierRoster premierRoster, String name, String code, String icon, Boolean hasWon, Long gameWins, Record record) {
        super();
        this.teamId = teamId;
        this.rounds = rounds;
        this.won = won;
        this.premierRoster = premierRoster;
        this.name = name;
        this.code = code;
        this.icon = icon;
        this.hasWon = hasWon;
        this.gameWins = gameWins;
        this.record = record;
    }

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

    public Team withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
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

    public Team withRounds(Rounds rounds) {
        this.rounds = rounds;
        return this;
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

    public Team withWon(Boolean won) {
        this.won = won;
        return this;
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

    public Team withPremierRoster(PremierRoster premierRoster) {
        this.premierRoster = premierRoster;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Team withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Team withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Team withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_won")
    public Boolean getHasWon() {
        return hasWon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_won")
    public void setHasWon(Boolean hasWon) {
        this.hasWon = hasWon;
    }

    public Team withHasWon(Boolean hasWon) {
        this.hasWon = hasWon;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_wins")
    public Long getGameWins() {
        return gameWins;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_wins")
    public void setGameWins(Long gameWins) {
        this.gameWins = gameWins;
    }

    public Team withGameWins(Long gameWins) {
        this.gameWins = gameWins;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("record")
    public Record getRecord() {
        return record;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("record")
    public void setRecord(Record record) {
        this.record = record;
    }

    public Team withRecord(Record record) {
        this.record = record;
        return this;
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("hasWon");
        sb.append('=');
        sb.append(((this.hasWon == null)?"<null>":this.hasWon));
        sb.append(',');
        sb.append("gameWins");
        sb.append('=');
        sb.append(((this.gameWins == null)?"<null>":this.gameWins));
        sb.append(',');
        sb.append("record");
        sb.append('=');
        sb.append(((this.record == null)?"<null>":this.record));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.teamId == null)? 0 :this.teamId.hashCode()));
        result = ((result* 31)+((this.won == null)? 0 :this.won.hashCode()));
        result = ((result* 31)+((this.gameWins == null)? 0 :this.gameWins.hashCode()));
        result = ((result* 31)+((this.record == null)? 0 :this.record.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.hasWon == null)? 0 :this.hasWon.hashCode()));
        result = ((result* 31)+((this.premierRoster == null)? 0 :this.premierRoster.hashCode()));
        result = ((result* 31)+((this.rounds == null)? 0 :this.rounds.hashCode()));
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
        return (((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.teamId == rhs.teamId)||((this.teamId!= null)&&this.teamId.equals(rhs.teamId))))&&((this.won == rhs.won)||((this.won!= null)&&this.won.equals(rhs.won))))&&((this.gameWins == rhs.gameWins)||((this.gameWins!= null)&&this.gameWins.equals(rhs.gameWins))))&&((this.record == rhs.record)||((this.record!= null)&&this.record.equals(rhs.record))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.hasWon == rhs.hasWon)||((this.hasWon!= null)&&this.hasWon.equals(rhs.hasWon))))&&((this.premierRoster == rhs.premierRoster)||((this.premierRoster!= null)&&this.premierRoster.equals(rhs.premierRoster))))&&((this.rounds == rhs.rounds)||((this.rounds!= null)&&this.rounds.equals(rhs.rounds))));
    }

}
