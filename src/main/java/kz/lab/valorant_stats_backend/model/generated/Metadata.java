
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "match_id",
    "map",
    "game_version",
    "game_length_in_ms",
    "started_at",
    "is_completed",
    "queue",
    "season",
    "platform",
    "premier",
    "party_rr_penaltys",
    "region",
    "cluster"
})
@Generated("jsonschema2pojo")
public class Metadata implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("match_id")
    @NotNull
    private String matchId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("map")
    @Valid
    @NotNull
    private Map map;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_version")
    @NotNull
    private String gameVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_length_in_ms")
    @NotNull
    private Long gameLengthInMs;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("started_at")
    @NotNull
    private Date startedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_completed")
    @NotNull
    private Boolean isCompleted;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queue")
    @Valid
    @NotNull
    private Queue queue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season")
    @Valid
    @NotNull
    private Season season;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform")
    @NotNull
    private String platform;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("premier")
    @Valid
    @NotNull
    private Premier premier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_rr_penaltys")
    @Valid
    @NotNull
    private List<PartyPenalty> partyRrPenaltys = new ArrayList<PartyPenalty>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("region")
    @NotNull
    private String region;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cluster")
    @NotNull
    private String cluster;
    private final static long serialVersionUID = -1944746326222752374L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    public Metadata(String matchId, Map map, String gameVersion, Long gameLengthInMs, Date startedAt, Boolean isCompleted, Queue queue, Season season, String platform, Premier premier, List<PartyPenalty> partyRrPenaltys, String region, String cluster) {
        super();
        this.matchId = matchId;
        this.map = map;
        this.gameVersion = gameVersion;
        this.gameLengthInMs = gameLengthInMs;
        this.startedAt = startedAt;
        this.isCompleted = isCompleted;
        this.queue = queue;
        this.season = season;
        this.platform = platform;
        this.premier = premier;
        this.partyRrPenaltys = partyRrPenaltys;
        this.region = region;
        this.cluster = cluster;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("match_id")
    public String getMatchId() {
        return matchId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("match_id")
    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public Metadata withMatchId(String matchId) {
        this.matchId = matchId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("map")
    public Map getMap() {
        return map;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("map")
    public void setMap(Map map) {
        this.map = map;
    }

    public Metadata withMap(Map map) {
        this.map = map;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_version")
    public String getGameVersion() {
        return gameVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_version")
    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public Metadata withGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_length_in_ms")
    public Long getGameLengthInMs() {
        return gameLengthInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("game_length_in_ms")
    public void setGameLengthInMs(Long gameLengthInMs) {
        this.gameLengthInMs = gameLengthInMs;
    }

    public Metadata withGameLengthInMs(Long gameLengthInMs) {
        this.gameLengthInMs = gameLengthInMs;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("started_at")
    public Date getStartedAt() {
        return startedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("started_at")
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Metadata withStartedAt(Date startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_completed")
    public Boolean getIsCompleted() {
        return isCompleted;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_completed")
    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Metadata withIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queue")
    public Queue getQueue() {
        return queue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("queue")
    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public Metadata withQueue(Queue queue) {
        this.queue = queue;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season")
    public Season getSeason() {
        return season;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("season")
    public void setSeason(Season season) {
        this.season = season;
    }

    public Metadata withSeason(Season season) {
        this.season = season;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Metadata withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("premier")
    public Premier getPremier() {
        return premier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("premier")
    public void setPremier(Premier premier) {
        this.premier = premier;
    }

    public Metadata withPremier(Premier premier) {
        this.premier = premier;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_rr_penaltys")
    public List<PartyPenalty> getPartyRrPenaltys() {
        return partyRrPenaltys;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_rr_penaltys")
    public void setPartyRrPenaltys(List<PartyPenalty> partyRrPenaltys) {
        this.partyRrPenaltys = partyRrPenaltys;
    }

    public Metadata withPartyRrPenaltys(List<PartyPenalty> partyRrPenaltys) {
        this.partyRrPenaltys = partyRrPenaltys;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public Metadata withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cluster")
    public String getCluster() {
        return cluster;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cluster")
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public Metadata withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matchId");
        sb.append('=');
        sb.append(((this.matchId == null)?"<null>":this.matchId));
        sb.append(',');
        sb.append("map");
        sb.append('=');
        sb.append(((this.map == null)?"<null>":this.map));
        sb.append(',');
        sb.append("gameVersion");
        sb.append('=');
        sb.append(((this.gameVersion == null)?"<null>":this.gameVersion));
        sb.append(',');
        sb.append("gameLengthInMs");
        sb.append('=');
        sb.append(((this.gameLengthInMs == null)?"<null>":this.gameLengthInMs));
        sb.append(',');
        sb.append("startedAt");
        sb.append('=');
        sb.append(((this.startedAt == null)?"<null>":this.startedAt));
        sb.append(',');
        sb.append("isCompleted");
        sb.append('=');
        sb.append(((this.isCompleted == null)?"<null>":this.isCompleted));
        sb.append(',');
        sb.append("queue");
        sb.append('=');
        sb.append(((this.queue == null)?"<null>":this.queue));
        sb.append(',');
        sb.append("season");
        sb.append('=');
        sb.append(((this.season == null)?"<null>":this.season));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
        sb.append(',');
        sb.append("premier");
        sb.append('=');
        sb.append(((this.premier == null)?"<null>":this.premier));
        sb.append(',');
        sb.append("partyRrPenaltys");
        sb.append('=');
        sb.append(((this.partyRrPenaltys == null)?"<null>":this.partyRrPenaltys));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("cluster");
        sb.append('=');
        sb.append(((this.cluster == null)?"<null>":this.cluster));
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
        result = ((result* 31)+((this.cluster == null)? 0 :this.cluster.hashCode()));
        result = ((result* 31)+((this.premier == null)? 0 :this.premier.hashCode()));
        result = ((result* 31)+((this.startedAt == null)? 0 :this.startedAt.hashCode()));
        result = ((result* 31)+((this.platform == null)? 0 :this.platform.hashCode()));
        result = ((result* 31)+((this.gameVersion == null)? 0 :this.gameVersion.hashCode()));
        result = ((result* 31)+((this.season == null)? 0 :this.season.hashCode()));
        result = ((result* 31)+((this.partyRrPenaltys == null)? 0 :this.partyRrPenaltys.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.map == null)? 0 :this.map.hashCode()));
        result = ((result* 31)+((this.gameLengthInMs == null)? 0 :this.gameLengthInMs.hashCode()));
        result = ((result* 31)+((this.matchId == null)? 0 :this.matchId.hashCode()));
        result = ((result* 31)+((this.queue == null)? 0 :this.queue.hashCode()));
        result = ((result* 31)+((this.isCompleted == null)? 0 :this.isCompleted.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return ((((((((((((((this.cluster == rhs.cluster)||((this.cluster!= null)&&this.cluster.equals(rhs.cluster)))&&((this.premier == rhs.premier)||((this.premier!= null)&&this.premier.equals(rhs.premier))))&&((this.startedAt == rhs.startedAt)||((this.startedAt!= null)&&this.startedAt.equals(rhs.startedAt))))&&((this.platform == rhs.platform)||((this.platform!= null)&&this.platform.equals(rhs.platform))))&&((this.gameVersion == rhs.gameVersion)||((this.gameVersion!= null)&&this.gameVersion.equals(rhs.gameVersion))))&&((this.season == rhs.season)||((this.season!= null)&&this.season.equals(rhs.season))))&&((this.partyRrPenaltys == rhs.partyRrPenaltys)||((this.partyRrPenaltys!= null)&&this.partyRrPenaltys.equals(rhs.partyRrPenaltys))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.map == rhs.map)||((this.map!= null)&&this.map.equals(rhs.map))))&&((this.gameLengthInMs == rhs.gameLengthInMs)||((this.gameLengthInMs!= null)&&this.gameLengthInMs.equals(rhs.gameLengthInMs))))&&((this.matchId == rhs.matchId)||((this.matchId!= null)&&this.matchId.equals(rhs.matchId))))&&((this.queue == rhs.queue)||((this.queue!= null)&&this.queue.equals(rhs.queue))))&&((this.isCompleted == rhs.isCompleted)||((this.isCompleted!= null)&&this.isCompleted.equals(rhs.isCompleted))));
    }

}
