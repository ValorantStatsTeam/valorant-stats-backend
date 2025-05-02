
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "x",
    "y"
})
@Generated("jsonschema2pojo")
public class Location {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("x")
    private Long x;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("y")
    private Long y;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("x")
    public Long getX() {
        return x;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("x")
    public void setX(Long x) {
        this.x = x;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("y")
    public Long getY() {
        return y;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("y")
    public void setY(Long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Location.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("x");
        sb.append('=');
        sb.append(((this.x == null)?"<null>":this.x));
        sb.append(',');
        sb.append("y");
        sb.append('=');
        sb.append(((this.y == null)?"<null>":this.y));
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
        result = ((result* 31)+((this.x == null)? 0 :this.x.hashCode()));
        result = ((result* 31)+((this.y == null)? 0 :this.y.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return (((this.x == rhs.x)||((this.x!= null)&&this.x.equals(rhs.x)))&&((this.y == rhs.y)||((this.y!= null)&&this.y.equals(rhs.y))));
    }

}
