
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "count"
})
@Generated("jsonschema2pojo")
public class GameType implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @NotNull
    private String type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    @NotNull
    private Long count;
    private final static long serialVersionUID = -5125029597468868184L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GameType() {
    }

    public GameType(String type, Long count) {
        super();
        this.type = type;
        this.count = count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public GameType withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Long count) {
        this.count = count;
    }

    public GameType withCount(Long count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GameType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameType) == false) {
            return false;
        }
        GameType rhs = ((GameType) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))));
    }

}
