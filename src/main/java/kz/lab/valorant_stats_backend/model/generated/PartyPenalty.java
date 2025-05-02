
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "party_id",
    "penalty"
})
@Generated("jsonschema2pojo")
public class PartyPenalty {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_id")
    private String partyId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalty")
    private Long penalty;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_id")
    public String getPartyId() {
        return partyId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_id")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalty")
    public Long getPenalty() {
        return penalty;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("penalty")
    public void setPenalty(Long penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartyPenalty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?"<null>":this.partyId));
        sb.append(',');
        sb.append("penalty");
        sb.append('=');
        sb.append(((this.penalty == null)?"<null>":this.penalty));
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
        result = ((result* 31)+((this.partyId == null)? 0 :this.partyId.hashCode()));
        result = ((result* 31)+((this.penalty == null)? 0 :this.penalty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartyPenalty) == false) {
            return false;
        }
        PartyPenalty rhs = ((PartyPenalty) other);
        return (((this.partyId == rhs.partyId)||((this.partyId!= null)&&this.partyId.equals(rhs.partyId)))&&((this.penalty == rhs.penalty)||((this.penalty!= null)&&this.penalty.equals(rhs.penalty))));
    }

}
