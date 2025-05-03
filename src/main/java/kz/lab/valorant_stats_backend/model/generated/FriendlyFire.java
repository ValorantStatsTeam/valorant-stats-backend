
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "incoming",
    "outgoing"
})
@Generated("jsonschema2pojo")
public class FriendlyFire implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("incoming")
    @NotNull
    private Long incoming;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outgoing")
    @NotNull
    private Long outgoing;
    private final static long serialVersionUID = 3761949734814464782L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FriendlyFire() {
    }

    public FriendlyFire(Long incoming, Long outgoing) {
        super();
        this.incoming = incoming;
        this.outgoing = outgoing;
    }

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

    public FriendlyFire withIncoming(Long incoming) {
        this.incoming = incoming;
        return this;
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

    public FriendlyFire withOutgoing(Long outgoing) {
        this.outgoing = outgoing;
        return this;
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
