
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
    "id",
    "game_type",
    "teams"
})
@Generated("jsonschema2pojo")
public class EsportsMatch implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_type")
    @Valid
    @NotNull
    private GameType gameType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("teams")
    @Valid
    @NotNull
    private List<Team> teams = new ArrayList<Team>();
    private final static long serialVersionUID = 457942095550179743L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EsportsMatch() {
    }

    public EsportsMatch(String id, GameType gameType, List<Team> teams) {
        super();
        this.id = id;
        this.gameType = gameType;
        this.teams = teams;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EsportsMatch withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_type")
    public GameType getGameType() {
        return gameType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_type")
    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public EsportsMatch withGameType(GameType gameType) {
        this.gameType = gameType;
        return this;
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

    public EsportsMatch withTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EsportsMatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("gameType");
        sb.append('=');
        sb.append(((this.gameType == null)?"<null>":this.gameType));
        sb.append(',');
        sb.append("teams");
        sb.append('=');
        sb.append(((this.teams == null)?"<null>":this.teams));
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
        result = ((result* 31)+((this.teams == null)? 0 :this.teams.hashCode()));
        result = ((result* 31)+((this.gameType == null)? 0 :this.gameType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EsportsMatch) == false) {
            return false;
        }
        EsportsMatch rhs = ((EsportsMatch) other);
        return ((((this.teams == rhs.teams)||((this.teams!= null)&&this.teams.equals(rhs.teams)))&&((this.gameType == rhs.gameType)||((this.gameType!= null)&&this.gameType.equals(rhs.gameType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
