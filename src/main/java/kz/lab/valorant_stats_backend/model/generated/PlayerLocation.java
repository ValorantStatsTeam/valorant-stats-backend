
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "puuid",
    "name",
    "tag",
    "team",
    "view_radians",
    "location"
})
@Generated("jsonschema2pojo")
public class PlayerLocation implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puuid")
    @NotNull
    private String puuid;
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
    @JsonProperty("tag")
    @NotNull
    private String tag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team")
    @NotNull
    private String team;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("view_radians")
    @NotNull
    private Double viewRadians;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    @Valid
    @NotNull
    private Location location;
    private final static long serialVersionUID = 4679022846377679557L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PlayerLocation() {
    }

    public PlayerLocation(String puuid, String name, String tag, String team, Double viewRadians, Location location) {
        super();
        this.puuid = puuid;
        this.name = name;
        this.tag = tag;
        this.team = team;
        this.viewRadians = viewRadians;
        this.location = location;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puuid")
    public String getPuuid() {
        return puuid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puuid")
    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public PlayerLocation withPuuid(String puuid) {
        this.puuid = puuid;
        return this;
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

    public PlayerLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    public PlayerLocation withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team")
    public String getTeam() {
        return team;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team")
    public void setTeam(String team) {
        this.team = team;
    }

    public PlayerLocation withTeam(String team) {
        this.team = team;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("view_radians")
    public Double getViewRadians() {
        return viewRadians;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("view_radians")
    public void setViewRadians(Double viewRadians) {
        this.viewRadians = viewRadians;
    }

    public PlayerLocation withViewRadians(Double viewRadians) {
        this.viewRadians = viewRadians;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public PlayerLocation withLocation(Location location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlayerLocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("puuid");
        sb.append('=');
        sb.append(((this.puuid == null)?"<null>":this.puuid));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("team");
        sb.append('=');
        sb.append(((this.team == null)?"<null>":this.team));
        sb.append(',');
        sb.append("viewRadians");
        sb.append('=');
        sb.append(((this.viewRadians == null)?"<null>":this.viewRadians));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.viewRadians == null)? 0 :this.viewRadians.hashCode()));
        result = ((result* 31)+((this.puuid == null)? 0 :this.puuid.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlayerLocation) == false) {
            return false;
        }
        PlayerLocation rhs = ((PlayerLocation) other);
        return (((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.viewRadians == rhs.viewRadians)||((this.viewRadians!= null)&&this.viewRadians.equals(rhs.viewRadians))))&&((this.puuid == rhs.puuid)||((this.puuid!= null)&&this.puuid.equals(rhs.puuid))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))));
    }

}
