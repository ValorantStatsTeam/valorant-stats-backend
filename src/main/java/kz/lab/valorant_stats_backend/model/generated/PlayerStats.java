
package kz.lab.valorant_stats_backend.model.generated;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "score",
    "kills",
    "deaths",
    "assists",
    "headshots",
    "legshots",
    "bodyshots",
    "damage"
})
@Generated("jsonschema2pojo")
public class PlayerStats {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("score")
    private Long score;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kills")
    private Long kills;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deaths")
    private Long deaths;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assists")
    private Long assists;
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
    @JsonProperty("bodyshots")
    private Long bodyshots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage")
    private Damage damage;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("score")
    public Long getScore() {
        return score;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("score")
    public void setScore(Long score) {
        this.score = score;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kills")
    public Long getKills() {
        return kills;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kills")
    public void setKills(Long kills) {
        this.kills = kills;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deaths")
    public Long getDeaths() {
        return deaths;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("deaths")
    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assists")
    public Long getAssists() {
        return assists;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assists")
    public void setAssists(Long assists) {
        this.assists = assists;
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
    @JsonProperty("damage")
    public Damage getDamage() {
        return damage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("damage")
    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlayerStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("kills");
        sb.append('=');
        sb.append(((this.kills == null)?"<null>":this.kills));
        sb.append(',');
        sb.append("deaths");
        sb.append('=');
        sb.append(((this.deaths == null)?"<null>":this.deaths));
        sb.append(',');
        sb.append("assists");
        sb.append('=');
        sb.append(((this.assists == null)?"<null>":this.assists));
        sb.append(',');
        sb.append("headshots");
        sb.append('=');
        sb.append(((this.headshots == null)?"<null>":this.headshots));
        sb.append(',');
        sb.append("legshots");
        sb.append('=');
        sb.append(((this.legshots == null)?"<null>":this.legshots));
        sb.append(',');
        sb.append("bodyshots");
        sb.append('=');
        sb.append(((this.bodyshots == null)?"<null>":this.bodyshots));
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
        result = ((result* 31)+((this.kills == null)? 0 :this.kills.hashCode()));
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.damage == null)? 0 :this.damage.hashCode()));
        result = ((result* 31)+((this.headshots == null)? 0 :this.headshots.hashCode()));
        result = ((result* 31)+((this.bodyshots == null)? 0 :this.bodyshots.hashCode()));
        result = ((result* 31)+((this.assists == null)? 0 :this.assists.hashCode()));
        result = ((result* 31)+((this.legshots == null)? 0 :this.legshots.hashCode()));
        result = ((result* 31)+((this.deaths == null)? 0 :this.deaths.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlayerStats) == false) {
            return false;
        }
        PlayerStats rhs = ((PlayerStats) other);
        return (((((((((this.kills == rhs.kills)||((this.kills!= null)&&this.kills.equals(rhs.kills)))&&((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score))))&&((this.damage == rhs.damage)||((this.damage!= null)&&this.damage.equals(rhs.damage))))&&((this.headshots == rhs.headshots)||((this.headshots!= null)&&this.headshots.equals(rhs.headshots))))&&((this.bodyshots == rhs.bodyshots)||((this.bodyshots!= null)&&this.bodyshots.equals(rhs.bodyshots))))&&((this.assists == rhs.assists)||((this.assists!= null)&&this.assists.equals(rhs.assists))))&&((this.legshots == rhs.legshots)||((this.legshots!= null)&&this.legshots.equals(rhs.legshots))))&&((this.deaths == rhs.deaths)||((this.deaths!= null)&&this.deaths.equals(rhs.deaths))));
    }

}
