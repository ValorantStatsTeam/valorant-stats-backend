
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tournament_id",
    "name",
    "season_id",
    "division"
})
@Generated("jsonschema2pojo")
public class Premier implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tournament_id")
    @NotNull
    private String tournamentId;
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
    @JsonProperty("season_id")
    @NotNull
    private String seasonId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("division")
    @NotNull
    private String division;
    private final static long serialVersionUID = 8829078564029234540L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Premier() {
    }

    public Premier(String tournamentId, String name, String seasonId, String division) {
        super();
        this.tournamentId = tournamentId;
        this.name = name;
        this.seasonId = seasonId;
        this.division = division;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tournament_id")
    public String getTournamentId() {
        return tournamentId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tournament_id")
    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Premier withTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
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

    public Premier withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season_id")
    public String getSeasonId() {
        return seasonId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season_id")
    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public Premier withSeasonId(String seasonId) {
        this.seasonId = seasonId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("division")
    public String getDivision() {
        return division;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("division")
    public void setDivision(String division) {
        this.division = division;
    }

    public Premier withDivision(String division) {
        this.division = division;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Premier.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tournamentId");
        sb.append('=');
        sb.append(((this.tournamentId == null)?"<null>":this.tournamentId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("seasonId");
        sb.append('=');
        sb.append(((this.seasonId == null)?"<null>":this.seasonId));
        sb.append(',');
        sb.append("division");
        sb.append('=');
        sb.append(((this.division == null)?"<null>":this.division));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.division == null)? 0 :this.division.hashCode()));
        result = ((result* 31)+((this.seasonId == null)? 0 :this.seasonId.hashCode()));
        result = ((result* 31)+((this.tournamentId == null)? 0 :this.tournamentId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Premier) == false) {
            return false;
        }
        Premier rhs = ((Premier) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.division == rhs.division)||((this.division!= null)&&this.division.equals(rhs.division))))&&((this.seasonId == rhs.seasonId)||((this.seasonId!= null)&&this.seasonId.equals(rhs.seasonId))))&&((this.tournamentId == rhs.tournamentId)||((this.tournamentId!= null)&&this.tournamentId.equals(rhs.tournamentId))));
    }

}
