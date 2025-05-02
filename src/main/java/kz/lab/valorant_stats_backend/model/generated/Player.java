
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
    "team_id",
    "platform",
    "party_id",
    "agent",
    "stats",
    "ability_casts",
    "tier",
    "card_id",
    "title_id",
    "prefered_level_border",
    "account_level",
    "session_playtime_in_ms",
    "behavior",
    "economy"
})
@Generated("jsonschema2pojo")
public class Player {

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
    @JsonProperty("team_id")
    private String teamId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_id")
    private String partyId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("agent")
    private Agent agent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    private PlayerStats stats;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_casts")
    private AbilityCasts abilityCasts;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tier")
    private Tier tier;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("card_id")
    private String cardId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title_id")
    private String titleId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prefered_level_border")
    private String preferedLevelBorder;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("account_level")
    private Long accountLevel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("session_playtime_in_ms")
    private Long sessionPlaytimeInMs;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("behavior")
    private Behavior behavior;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("economy")
    private Economy economy;

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

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_id")
    public String getPartyId() {
        return partyId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_id")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("agent")
    public Agent getAgent() {
        return agent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("agent")
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public PlayerStats getStats() {
        return stats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_casts")
    public AbilityCasts getAbilityCasts() {
        return abilityCasts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ability_casts")
    public void setAbilityCasts(AbilityCasts abilityCasts) {
        this.abilityCasts = abilityCasts;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tier")
    public Tier getTier() {
        return tier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tier")
    public void setTier(Tier tier) {
        this.tier = tier;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("card_id")
    public String getCardId() {
        return cardId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("card_id")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title_id")
    public String getTitleId() {
        return titleId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title_id")
    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prefered_level_border")
    public String getPreferedLevelBorder() {
        return preferedLevelBorder;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("prefered_level_border")
    public void setPreferedLevelBorder(String preferedLevelBorder) {
        this.preferedLevelBorder = preferedLevelBorder;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("account_level")
    public Long getAccountLevel() {
        return accountLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("account_level")
    public void setAccountLevel(Long accountLevel) {
        this.accountLevel = accountLevel;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("session_playtime_in_ms")
    public Long getSessionPlaytimeInMs() {
        return sessionPlaytimeInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("session_playtime_in_ms")
    public void setSessionPlaytimeInMs(Long sessionPlaytimeInMs) {
        this.sessionPlaytimeInMs = sessionPlaytimeInMs;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("behavior")
    public Behavior getBehavior() {
        return behavior;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("behavior")
    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("economy")
    public Economy getEconomy() {
        return economy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("economy")
    public void setEconomy(Economy economy) {
        this.economy = economy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Player.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("teamId");
        sb.append('=');
        sb.append(((this.teamId == null)?"<null>":this.teamId));
        sb.append(',');
        sb.append("platform");
        sb.append('=');
        sb.append(((this.platform == null)?"<null>":this.platform));
        sb.append(',');
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?"<null>":this.partyId));
        sb.append(',');
        sb.append("agent");
        sb.append('=');
        sb.append(((this.agent == null)?"<null>":this.agent));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
        sb.append(',');
        sb.append("abilityCasts");
        sb.append('=');
        sb.append(((this.abilityCasts == null)?"<null>":this.abilityCasts));
        sb.append(',');
        sb.append("tier");
        sb.append('=');
        sb.append(((this.tier == null)?"<null>":this.tier));
        sb.append(',');
        sb.append("cardId");
        sb.append('=');
        sb.append(((this.cardId == null)?"<null>":this.cardId));
        sb.append(',');
        sb.append("titleId");
        sb.append('=');
        sb.append(((this.titleId == null)?"<null>":this.titleId));
        sb.append(',');
        sb.append("preferedLevelBorder");
        sb.append('=');
        sb.append(((this.preferedLevelBorder == null)?"<null>":this.preferedLevelBorder));
        sb.append(',');
        sb.append("accountLevel");
        sb.append('=');
        sb.append(((this.accountLevel == null)?"<null>":this.accountLevel));
        sb.append(',');
        sb.append("sessionPlaytimeInMs");
        sb.append('=');
        sb.append(((this.sessionPlaytimeInMs == null)?"<null>":this.sessionPlaytimeInMs));
        sb.append(',');
        sb.append("behavior");
        sb.append('=');
        sb.append(((this.behavior == null)?"<null>":this.behavior));
        sb.append(',');
        sb.append("economy");
        sb.append('=');
        sb.append(((this.economy == null)?"<null>":this.economy));
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
        result = ((result* 31)+((this.agent == null)? 0 :this.agent.hashCode()));
        result = ((result* 31)+((this.preferedLevelBorder == null)? 0 :this.preferedLevelBorder.hashCode()));
        result = ((result* 31)+((this.titleId == null)? 0 :this.titleId.hashCode()));
        result = ((result* 31)+((this.puuid == null)? 0 :this.puuid.hashCode()));
        result = ((result* 31)+((this.abilityCasts == null)? 0 :this.abilityCasts.hashCode()));
        result = ((result* 31)+((this.economy == null)? 0 :this.economy.hashCode()));
        result = ((result* 31)+((this.accountLevel == null)? 0 :this.accountLevel.hashCode()));
        result = ((result* 31)+((this.platform == null)? 0 :this.platform.hashCode()));
        result = ((result* 31)+((this.tier == null)? 0 :this.tier.hashCode()));
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        result = ((result* 31)+((this.sessionPlaytimeInMs == null)? 0 :this.sessionPlaytimeInMs.hashCode()));
        result = ((result* 31)+((this.teamId == null)? 0 :this.teamId.hashCode()));
        result = ((result* 31)+((this.cardId == null)? 0 :this.cardId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.partyId == null)? 0 :this.partyId.hashCode()));
        result = ((result* 31)+((this.behavior == null)? 0 :this.behavior.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Player) == false) {
            return false;
        }
        Player rhs = ((Player) other);
        return ((((((((((((((((((this.agent == rhs.agent)||((this.agent!= null)&&this.agent.equals(rhs.agent)))&&((this.preferedLevelBorder == rhs.preferedLevelBorder)||((this.preferedLevelBorder!= null)&&this.preferedLevelBorder.equals(rhs.preferedLevelBorder))))&&((this.titleId == rhs.titleId)||((this.titleId!= null)&&this.titleId.equals(rhs.titleId))))&&((this.puuid == rhs.puuid)||((this.puuid!= null)&&this.puuid.equals(rhs.puuid))))&&((this.abilityCasts == rhs.abilityCasts)||((this.abilityCasts!= null)&&this.abilityCasts.equals(rhs.abilityCasts))))&&((this.economy == rhs.economy)||((this.economy!= null)&&this.economy.equals(rhs.economy))))&&((this.accountLevel == rhs.accountLevel)||((this.accountLevel!= null)&&this.accountLevel.equals(rhs.accountLevel))))&&((this.platform == rhs.platform)||((this.platform!= null)&&this.platform.equals(rhs.platform))))&&((this.tier == rhs.tier)||((this.tier!= null)&&this.tier.equals(rhs.tier))))&&((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats))))&&((this.sessionPlaytimeInMs == rhs.sessionPlaytimeInMs)||((this.sessionPlaytimeInMs!= null)&&this.sessionPlaytimeInMs.equals(rhs.sessionPlaytimeInMs))))&&((this.teamId == rhs.teamId)||((this.teamId!= null)&&this.teamId.equals(rhs.teamId))))&&((this.cardId == rhs.cardId)||((this.cardId!= null)&&this.cardId.equals(rhs.cardId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.partyId == rhs.partyId)||((this.partyId!= null)&&this.partyId.equals(rhs.partyId))))&&((this.behavior == rhs.behavior)||((this.behavior!= null)&&this.behavior.equals(rhs.behavior))));
    }

}
