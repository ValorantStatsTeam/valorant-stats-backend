
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
    "status",
    "data"
})
@Generated("jsonschema2pojo")
public class EsportsSchedule implements Serializable
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
    private List<ScheduleItem> data = new ArrayList<ScheduleItem>();
    private final static long serialVersionUID = -1350659886142760035L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EsportsSchedule() {
    }

    public EsportsSchedule(Long status, List<ScheduleItem> data) {
        super();
        this.status = status;
        this.data = data;
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

    public EsportsSchedule withStatus(Long status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public List<ScheduleItem> getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    public void setData(List<ScheduleItem> data) {
        this.data = data;
    }

    public EsportsSchedule withData(List<ScheduleItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EsportsSchedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EsportsSchedule) == false) {
            return false;
        }
        EsportsSchedule rhs = ((EsportsSchedule) other);
        return (((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
