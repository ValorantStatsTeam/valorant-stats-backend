
package kz.lab.valorant_stats_backend.model.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
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
public class Round {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result")
    private String result;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ceremony")
    private String ceremony;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("winning_team")
    private String winningTeam;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("plant")
    private Plant plant;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("defuse")
    private Defuse defuse;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    private List<RoundStats> stats = new ArrayList<RoundStats>();

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
