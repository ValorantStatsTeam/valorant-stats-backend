
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
    "team",
    "bodyshots",
    "headshots",
    "legshots",
    "damage"
})
@Generated("jsonschema2pojo")
public class DamageEvent implements Serializable
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
    @JsonProperty("bodyshots")
    @NotNull
    private Long bodyshots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("headshots")
    @NotNull
    private Long headshots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("legshots")
    @NotNull
    private Long legshots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage")
    @NotNull
    private Long damage;
    private final static long serialVersionUID = 5860708905425047771L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DamageEvent() {
    }

    public DamageEvent(String puuid, String name, String tag, String team, Long bodyshots, Long headshots, Long legshots, Long damage) {
        super();
        this.puuid = puuid;
        this.name = name;
        this.tag = tag;
        this.team = team;
        this.bodyshots = bodyshots;
        this.headshots = headshots;
        this.legshots = legshots;
        this.damage = damage;
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

    public DamageEvent withPuuid(String puuid) {
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

    public DamageEvent withName(String name) {
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

    public DamageEvent withTag(String tag) {
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

    public DamageEvent withTeam(String team) {
        this.team = team;
        return this;
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

    public DamageEvent withBodyshots(Long bodyshots) {
        this.bodyshots = bodyshots;
        return this;
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

    public DamageEvent withHeadshots(Long headshots) {
        this.headshots = headshots;
        return this;
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

    public DamageEvent withLegshots(Long legshots) {
        this.legshots = legshots;
        return this;
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

    public DamageEvent withDamage(Long damage) {
        this.damage = damage;
        return this;
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
