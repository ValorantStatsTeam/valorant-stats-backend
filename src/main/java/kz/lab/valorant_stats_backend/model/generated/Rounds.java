
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "won",
    "lost"
})
@Generated("jsonschema2pojo")
public class Rounds {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("won")
    private Long won;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lost")
    private Long lost;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("won")
    public Long getWon() {
        return won;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("won")
    public void setWon(Long won) {
        this.won = won;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lost")
    public Long getLost() {
        return lost;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lost")
    public void setLost(Long lost) {
        this.lost = lost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rounds.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("won");
        sb.append('=');
        sb.append(((this.won == null)?"<null>":this.won));
        sb.append(',');
        sb.append("lost");
        sb.append('=');
        sb.append(((this.lost == null)?"<null>":this.lost));
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
        result = ((result* 31)+((this.lost == null)? 0 :this.lost.hashCode()));
        result = ((result* 31)+((this.won == null)? 0 :this.won.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rounds) == false) {
            return false;
        }
        Rounds rhs = ((Rounds) other);
        return (((this.lost == rhs.lost)||((this.lost!= null)&&this.lost.equals(rhs.lost)))&&((this.won == rhs.won)||((this.won!= null)&&this.won.equals(rhs.won))));
    }

}
