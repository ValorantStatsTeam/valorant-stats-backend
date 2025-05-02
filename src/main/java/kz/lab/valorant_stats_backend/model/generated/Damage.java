
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dealt",
    "received"
})
@Generated("jsonschema2pojo")
public class Damage {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dealt")
    private Long dealt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("received")
    private Long received;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dealt")
    public Long getDealt() {
        return dealt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dealt")
    public void setDealt(Long dealt) {
        this.dealt = dealt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("received")
    public Long getReceived() {
        return received;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("received")
    public void setReceived(Long received) {
        this.received = received;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Damage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dealt");
        sb.append('=');
        sb.append(((this.dealt == null)?"<null>":this.dealt));
        sb.append(',');
        sb.append("received");
        sb.append('=');
        sb.append(((this.received == null)?"<null>":this.received));
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
        result = ((result* 31)+((this.dealt == null)? 0 :this.dealt.hashCode()));
        result = ((result* 31)+((this.received == null)? 0 :this.received.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Damage) == false) {
            return false;
        }
        Damage rhs = ((Damage) other);
        return (((this.dealt == rhs.dealt)||((this.dealt!= null)&&this.dealt.equals(rhs.dealt)))&&((this.received == rhs.received)||((this.received!= null)&&this.received.equals(rhs.received))));
    }

}
