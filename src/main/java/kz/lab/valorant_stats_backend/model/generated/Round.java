
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
    "result",
    "ceremony",
    "winning_team",
    "plant",
    "defuse",
    "stats"
})
@Generated("jsonschema2pojo")
public class Round implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private Long id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result")
    @NotNull
    private String result;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ceremony")
    @NotNull
    private String ceremony;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("winning_team")
    @NotNull
    private String winningTeam;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("plant")
    @Valid
    @NotNull
    private Plant plant;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("defuse")
    @Valid
    @NotNull
    private Defuse defuse;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    @Valid
    @NotNull
    private List<RoundStats> stats = new ArrayList<RoundStats>();
    private final static long serialVersionUID = -7059380060996491551L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Round() {
    }

    public Round(Long id, String result, String ceremony, String winningTeam, Plant plant, Defuse defuse, List<RoundStats> stats) {
        super();
        this.id = id;
        this.result = result;
        this.ceremony = ceremony;
        this.winningTeam = winningTeam;
        this.plant = plant;
        this.defuse = defuse;
        this.stats = stats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Round withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public Round withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ceremony")
    public String getCeremony() {
        return ceremony;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ceremony")
    public void setCeremony(String ceremony) {
        this.ceremony = ceremony;
    }

    public Round withCeremony(String ceremony) {
        this.ceremony = ceremony;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("winning_team")
    public String getWinningTeam() {
        return winningTeam;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("winning_team")
    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }

    public Round withWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("plant")
    public Plant getPlant() {
        return plant;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("plant")
    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public Round withPlant(Plant plant) {
        this.plant = plant;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("defuse")
    public Defuse getDefuse() {
        return defuse;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("defuse")
    public void setDefuse(Defuse defuse) {
        this.defuse = defuse;
    }

    public Round withDefuse(Defuse defuse) {
        this.defuse = defuse;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public List<RoundStats> getStats() {
        return stats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public void setStats(List<RoundStats> stats) {
        this.stats = stats;
    }

    public Round withStats(List<RoundStats> stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Round.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("ceremony");
        sb.append('=');
        sb.append(((this.ceremony == null)?"<null>":this.ceremony));
        sb.append(',');
        sb.append("winningTeam");
        sb.append('=');
        sb.append(((this.winningTeam == null)?"<null>":this.winningTeam));
        sb.append(',');
        sb.append("plant");
        sb.append('=');
        sb.append(((this.plant == null)?"<null>":this.plant));
        sb.append(',');
        sb.append("defuse");
        sb.append('=');
        sb.append(((this.defuse == null)?"<null>":this.defuse));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.winningTeam == null)? 0 :this.winningTeam.hashCode()));
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        result = ((result* 31)+((this.ceremony == null)? 0 :this.ceremony.hashCode()));
        result = ((result* 31)+((this.defuse == null)? 0 :this.defuse.hashCode()));
        result = ((result* 31)+((this.plant == null)? 0 :this.plant.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Round) == false) {
            return false;
        }
        Round rhs = ((Round) other);
        return ((((((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.winningTeam == rhs.winningTeam)||((this.winningTeam!= null)&&this.winningTeam.equals(rhs.winningTeam))))&&((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats))))&&((this.ceremony == rhs.ceremony)||((this.ceremony!= null)&&this.ceremony.equals(rhs.ceremony))))&&((this.defuse == rhs.defuse)||((this.defuse!= null)&&this.defuse.equals(rhs.defuse))))&&((this.plant == rhs.plant)||((this.plant!= null)&&this.plant.equals(rhs.plant))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
