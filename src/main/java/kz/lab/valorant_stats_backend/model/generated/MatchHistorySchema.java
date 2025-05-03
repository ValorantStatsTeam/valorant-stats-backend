
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "data",
    "esportsSchedule"
})
@Generated("jsonschema2pojo")
public class MatchHistorySchema implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    @NotNull
    private Long status;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    @Valid
    @NotNull
    private List<Datum> data = new ArrayList<Datum>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("esportsSchedule")
    @Valid
    @NotNull
    private EsportsSchedule esportsSchedule;
    private final static long serialVersionUID = 7890460877098404864L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MatchHistorySchema() {
    }

    public MatchHistorySchema(Long status, List<Datum> data, EsportsSchedule esportsSchedule) {
        super();
        this.status = status;
        this.data = data;
        this.esportsSchedule = esportsSchedule;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public Long getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(Long status) {
        this.status = status;
    }

    public MatchHistorySchema withStatus(Long status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    public MatchHistorySchema withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("esportsSchedule")
    public EsportsSchedule getEsportsSchedule() {
        return esportsSchedule;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("esportsSchedule")
    public void setEsportsSchedule(EsportsSchedule esportsSchedule) {
        this.esportsSchedule = esportsSchedule;
    }

    public MatchHistorySchema withEsportsSchedule(EsportsSchedule esportsSchedule) {
        this.esportsSchedule = esportsSchedule;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MatchHistorySchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("esportsSchedule");
        sb.append('=');
        sb.append(((this.esportsSchedule == null)?"<null>":this.esportsSchedule));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.esportsSchedule == null)? 0 :this.esportsSchedule.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MatchHistorySchema) == false) {
            return false;
        }
        MatchHistorySchema rhs = ((MatchHistorySchema) other);
        return ((((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.esportsSchedule == rhs.esportsSchedule)||((this.esportsSchedule!= null)&&this.esportsSchedule.equals(rhs.esportsSchedule))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
