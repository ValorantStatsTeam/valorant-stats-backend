
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "puuid",
    "name",
    "tag",
    "team"
})
@Generated("jsonschema2pojo")
public class PlayerInfo implements Serializable
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
    private final static long serialVersionUID = -707725823202163945L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PlayerInfo() {
    }

    public PlayerInfo(String puuid, String name, String tag, String team) {
        super();
        this.puuid = puuid;
        this.name = name;
        this.tag = tag;
        this.team = team;
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

    public PlayerInfo withPuuid(String puuid) {
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

    public PlayerInfo withName(String name) {
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

    public PlayerInfo withTag(String tag) {
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

    public PlayerInfo withTeam(String team) {
        this.team = team;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlayerInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.puuid == null)? 0 :this.puuid.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.team == null)? 0 :this.team.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlayerInfo) == false) {
            return false;
        }
        PlayerInfo rhs = ((PlayerInfo) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.puuid == rhs.puuid)||((this.puuid!= null)&&this.puuid.equals(rhs.puuid))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))));
    }

}
