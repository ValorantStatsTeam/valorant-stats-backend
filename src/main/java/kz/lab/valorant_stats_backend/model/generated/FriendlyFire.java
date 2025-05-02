
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "incoming",
    "outgoing"
})
@Generated("jsonschema2pojo")
public class FriendlyFire {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incoming")
    private Long incoming;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outgoing")
    private Long outgoing;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incoming")
    public Long getIncoming() {
        return incoming;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incoming")
    public void setIncoming(Long incoming) {
        this.incoming = incoming;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outgoing")
    public Long getOutgoing() {
        return outgoing;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outgoing")
    public void setOutgoing(Long outgoing) {
        this.outgoing = outgoing;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FriendlyFire.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("incoming");
        sb.append('=');
        sb.append(((this.incoming == null)?"<null>":this.incoming));
        sb.append(',');
        sb.append("outgoing");
        sb.append('=');
        sb.append(((this.outgoing == null)?"<null>":this.outgoing));
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
        result = ((result* 31)+((this.incoming == null)? 0 :this.incoming.hashCode()));
        result = ((result* 31)+((this.outgoing == null)? 0 :this.outgoing.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FriendlyFire) == false) {
            return false;
        }
        FriendlyFire rhs = ((FriendlyFire) other);
        return (((this.incoming == rhs.incoming)||((this.incoming!= null)&&this.incoming.equals(rhs.incoming)))&&((this.outgoing == rhs.outgoing)||((this.outgoing!= null)&&this.outgoing.equals(rhs.outgoing))));
    }

}
