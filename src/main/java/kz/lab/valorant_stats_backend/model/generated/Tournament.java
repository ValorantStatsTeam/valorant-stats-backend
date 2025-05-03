
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "season"
})
@Generated("jsonschema2pojo")
public class Tournament implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @NotNull
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season")
    @NotNull
    private String season;
    private final static long serialVersionUID = 2666278635645493485L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tournament() {
    }

    public Tournament(String name, String season) {
        super();
        this.name = name;
        this.season = season;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tournament withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
    }

    public Tournament withSeason(String season) {
        this.season = season;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tournament.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("season");
        sb.append('=');
        sb.append(((this.season == null)?"<null>":this.season));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.season == null)? 0 :this.season.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tournament) == false) {
            return false;
        }
        Tournament rhs = ((Tournament) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.season == rhs.season)||((this.season!= null)&&this.season.equals(rhs.season))));
    }

}
