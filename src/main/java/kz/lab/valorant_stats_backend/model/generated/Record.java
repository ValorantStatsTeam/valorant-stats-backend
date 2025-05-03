
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wins",
    "losses"
})
@Generated("jsonschema2pojo")
public class Record implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wins")
    @NotNull
    private Long wins;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("losses")
    @NotNull
    private Long losses;
    private final static long serialVersionUID = 4689802893516236285L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    public Record(Long wins, Long losses) {
        super();
        this.wins = wins;
        this.losses = losses;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wins")
    public Long getWins() {
        return wins;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("wins")
    public void setWins(Long wins) {
        this.wins = wins;
    }

    public Record withWins(Long wins) {
        this.wins = wins;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("losses")
    public Long getLosses() {
        return losses;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("losses")
    public void setLosses(Long losses) {
        this.losses = losses;
    }

    public Record withLosses(Long losses) {
        this.losses = losses;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Record.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("wins");
        sb.append('=');
        sb.append(((this.wins == null)?"<null>":this.wins));
        sb.append(',');
        sb.append("losses");
        sb.append('=');
        sb.append(((this.losses == null)?"<null>":this.losses));
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
        result = ((result* 31)+((this.wins == null)? 0 :this.wins.hashCode()));
        result = ((result* 31)+((this.losses == null)? 0 :this.losses.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Record) == false) {
            return false;
        }
        Record rhs = ((Record) other);
        return (((this.wins == rhs.wins)||((this.wins!= null)&&this.wins.equals(rhs.wins)))&&((this.losses == rhs.losses)||((this.losses!= null)&&this.losses.equals(rhs.losses))));
    }

}
