
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "state",
    "type",
    "vod",
    "league",
    "tournament",
    "match"
})
@Generated("jsonschema2pojo")
public class ScheduleItem implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    @NotNull
    private Date date;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    @NotNull
    private String state;
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
    @JsonProperty("vod")
    @NotNull
    private String vod;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("league")
    @Valid
    @NotNull
    private League league;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tournament")
    @Valid
    @NotNull
    private Tournament tournament;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("match")
    @Valid
    @NotNull
    private EsportsMatch match;
    private final static long serialVersionUID = -9207244857182070852L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ScheduleItem() {
    }

    public ScheduleItem(Date date, String state, String type, String vod, League league, Tournament tournament, EsportsMatch match) {
        super();
        this.date = date;
        this.state = state;
        this.type = type;
        this.vod = vod;
        this.league = league;
        this.tournament = tournament;
        this.match = match;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public ScheduleItem withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public ScheduleItem withState(String state) {
        this.state = state;
        return this;
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

    public ScheduleItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vod")
    public String getVod() {
        return vod;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("vod")
    public void setVod(String vod) {
        this.vod = vod;
    }

    public ScheduleItem withVod(String vod) {
        this.vod = vod;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    public ScheduleItem withLeague(League league) {
        this.league = league;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tournament")
    public Tournament getTournament() {
        return tournament;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tournament")
    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public ScheduleItem withTournament(Tournament tournament) {
        this.tournament = tournament;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("match")
    public EsportsMatch getMatch() {
        return match;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("match")
    public void setMatch(EsportsMatch match) {
        this.match = match;
    }

    public ScheduleItem withMatch(EsportsMatch match) {
        this.match = match;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("vod");
        sb.append('=');
        sb.append(((this.vod == null)?"<null>":this.vod));
        sb.append(',');
        sb.append("league");
        sb.append('=');
        sb.append(((this.league == null)?"<null>":this.league));
        sb.append(',');
        sb.append("tournament");
        sb.append('=');
        sb.append(((this.tournament == null)?"<null>":this.tournament));
        sb.append(',');
        sb.append("match");
        sb.append('=');
        sb.append(((this.match == null)?"<null>":this.match));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.league == null)? 0 :this.league.hashCode()));
        result = ((result* 31)+((this.match == null)? 0 :this.match.hashCode()));
        result = ((result* 31)+((this.vod == null)? 0 :this.vod.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.tournament == null)? 0 :this.tournament.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleItem) == false) {
            return false;
        }
        ScheduleItem rhs = ((ScheduleItem) other);
        return ((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.league == rhs.league)||((this.league!= null)&&this.league.equals(rhs.league))))&&((this.match == rhs.match)||((this.match!= null)&&this.match.equals(rhs.match))))&&((this.vod == rhs.vod)||((this.vod!= null)&&this.vod.equals(rhs.vod))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.tournament == rhs.tournament)||((this.tournament!= null)&&this.tournament.equals(rhs.tournament))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
