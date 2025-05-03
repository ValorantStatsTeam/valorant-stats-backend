
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
    "team_id"
})
@Generated("jsonschema2pojo")
public class Coach implements Serializable
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
    @JsonProperty("team_id")
    @NotNull
    private String teamId;
    private final static long serialVersionUID = -22137761191639827L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coach() {
    }

    public Coach(String puuid, String teamId) {
        super();
        this.puuid = puuid;
        this.teamId = teamId;
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

    public Coach withPuuid(String puuid) {
        this.puuid = puuid;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Coach withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Coach.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("puuid");
        sb.append('=');
        sb.append(((this.puuid == null)?"<null>":this.puuid));
        sb.append(',');
        sb.append("teamId");
        sb.append('=');
        sb.append(((this.teamId == null)?"<null>":this.teamId));
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
        result = ((result* 31)+((this.puuid == null)? 0 :this.puuid.hashCode()));
        result = ((result* 31)+((this.teamId == null)? 0 :this.teamId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coach) == false) {
            return false;
        }
        Coach rhs = ((Coach) other);
        return (((this.puuid == rhs.puuid)||((this.puuid!= null)&&this.puuid.equals(rhs.puuid)))&&((this.teamId == rhs.teamId)||((this.teamId!= null)&&this.teamId.equals(rhs.teamId))));
    }

}
