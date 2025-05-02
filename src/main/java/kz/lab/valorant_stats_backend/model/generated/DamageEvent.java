
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "puuid",
    "name",
    "tag",
    "team",
    "bodyshots",
    "headshots",
    "legshots",
    "damage"
})
@Generated("jsonschema2pojo")
public class DamageEvent {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("puuid")
    private String puuid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tag")
    private String tag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("team")
    private String team;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bodyshots")
    private Long bodyshots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("headshots")
    private Long headshots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("legshots")
    private Long legshots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage")
    private Long damage;

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bodyshots")
    public Long getBodyshots() {
        return bodyshots;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bodyshots")
    public void setBodyshots(Long bodyshots) {
        this.bodyshots = bodyshots;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("headshots")
    public Long getHeadshots() {
        return headshots;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("headshots")
    public void setHeadshots(Long headshots) {
        this.headshots = headshots;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("legshots")
    public Long getLegshots() {
        return legshots;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("legshots")
    public void setLegshots(Long legshots) {
        this.legshots = legshots;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage")
    public Long getDamage() {
        return damage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage")
    public void setDamage(Long damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DamageEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("bodyshots");
        sb.append('=');
        sb.append(((this.bodyshots == null)?"<null>":this.bodyshots));
        sb.append(',');
        sb.append("headshots");
        sb.append('=');
        sb.append(((this.headshots == null)?"<null>":this.headshots));
        sb.append(',');
        sb.append("legshots");
        sb.append('=');
        sb.append(((this.legshots == null)?"<null>":this.legshots));
        sb.append(',');
        sb.append("damage");
        sb.append('=');
        sb.append(((this.damage == null)?"<null>":this.damage));
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
        result = ((result* 31)+((this.damage == null)? 0 :this.damage.hashCode()));
        result = ((result* 31)+((this.bodyshots == null)? 0 :this.bodyshots.hashCode()));
        result = ((result* 31)+((this.headshots == null)? 0 :this.headshots.hashCode()));
        result = ((result* 31)+((this.legshots == null)? 0 :this.legshots.hashCode()));
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
        if ((other instanceof DamageEvent) == false) {
            return false;
        }
        DamageEvent rhs = ((DamageEvent) other);
        return (((((((((this.damage == rhs.damage)||((this.damage!= null)&&this.damage.equals(rhs.damage)))&&((this.bodyshots == rhs.bodyshots)||((this.bodyshots!= null)&&this.bodyshots.equals(rhs.bodyshots))))&&((this.headshots == rhs.headshots)||((this.headshots!= null)&&this.headshots.equals(rhs.headshots))))&&((this.legshots == rhs.legshots)||((this.legshots!= null)&&this.legshots.equals(rhs.legshots))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.puuid == rhs.puuid)||((this.puuid!= null)&&this.puuid.equals(rhs.puuid))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.team == rhs.team)||((this.team!= null)&&this.team.equals(rhs.team))));
    }

}
