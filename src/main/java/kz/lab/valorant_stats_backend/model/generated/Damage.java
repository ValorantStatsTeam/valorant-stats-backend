
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dealt",
    "received"
})
@Generated("jsonschema2pojo")
public class Damage implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dealt")
    @NotNull
    private Long dealt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("received")
    @NotNull
    private Long received;
    private final static long serialVersionUID = -2055479627630961601L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Damage() {
    }

    public Damage(Long dealt, Long received) {
        super();
        this.dealt = dealt;
        this.received = received;
    }

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

    public Damage withDealt(Long dealt) {
        this.dealt = dealt;
        return this;
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

    public Damage withReceived(Long received) {
        this.received = received;
        return this;
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
