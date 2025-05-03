
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall",
    "average"
})
@Generated("jsonschema2pojo")
public class EconomyValue implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("overall")
    @NotNull
    private Long overall;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("average")
    @NotNull
    private Long average;
    private final static long serialVersionUID = -1972281006149660435L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EconomyValue() {
    }

    public EconomyValue(Long overall, Long average) {
        super();
        this.overall = overall;
        this.average = average;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("overall")
    public Long getOverall() {
        return overall;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("overall")
    public void setOverall(Long overall) {
        this.overall = overall;
    }

    public EconomyValue withOverall(Long overall) {
        this.overall = overall;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("average")
    public Long getAverage() {
        return average;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("average")
    public void setAverage(Long average) {
        this.average = average;
    }

    public EconomyValue withAverage(Long average) {
        this.average = average;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EconomyValue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("overall");
        sb.append('=');
        sb.append(((this.overall == null)?"<null>":this.overall));
        sb.append(',');
        sb.append("average");
        sb.append('=');
        sb.append(((this.average == null)?"<null>":this.average));
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
        result = ((result* 31)+((this.overall == null)? 0 :this.overall.hashCode()));
        result = ((result* 31)+((this.average == null)? 0 :this.average.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EconomyValue) == false) {
            return false;
        }
        EconomyValue rhs = ((EconomyValue) other);
        return (((this.overall == rhs.overall)||((this.overall!= null)&&this.overall.equals(rhs.overall)))&&((this.average == rhs.average)||((this.average!= null)&&this.average.equals(rhs.average))));
    }

}
