
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
    "account_level",
    "session_playtime_in_ms",
    "card_id",
    "title_id",
    "party_id"
})
@Generated("jsonschema2pojo")
public class Observer {

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
    @JsonProperty("party_id")
    private String partyId;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Observer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("accountLevel");
        sb.append('=');
        sb.append(((this.accountLevel == null)?"<null>":this.accountLevel));
        sb.append(',');
        sb.append("sessionPlaytimeInMs");
        sb.append('=');
        sb.append(((this.sessionPlaytimeInMs == null)?"<null>":this.sessionPlaytimeInMs));
        sb.append(',');
        sb.append("cardId");
        sb.append('=');
        sb.append(((this.cardId == null)?"<null>":this.cardId));
        sb.append(',');
        sb.append("titleId");
        sb.append('=');
        sb.append(((this.titleId == null)?"<null>":this.titleId));
        sb.append(',');
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?"<null>":this.partyId));
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
        result = ((result* 31)+((this.sessionPlaytimeInMs == null)? 0 :this.sessionPlaytimeInMs.hashCode()));
        result = ((result* 31)+((this.cardId == null)? 0 :this.cardId.hashCode()));
        result = ((result* 31)+((this.titleId == null)? 0 :this.titleId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.puuid == null)? 0 :this.puuid.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.accountLevel == null)? 0 :this.accountLevel.hashCode()));
        result = ((result* 31)+((this.partyId == null)? 0 :this.partyId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Observer) == false) {
            return false;
        }
        Observer rhs = ((Observer) other);
        return (((((((((this.sessionPlaytimeInMs == rhs.sessionPlaytimeInMs)||((this.sessionPlaytimeInMs!= null)&&this.sessionPlaytimeInMs.equals(rhs.sessionPlaytimeInMs)))&&((this.cardId == rhs.cardId)||((this.cardId!= null)&&this.cardId.equals(rhs.cardId))))&&((this.titleId == rhs.titleId)||((this.titleId!= null)&&this.titleId.equals(rhs.titleId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.puuid == rhs.puuid)||((this.puuid!= null)&&this.puuid.equals(rhs.puuid))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.accountLevel == rhs.accountLevel)||((this.accountLevel!= null)&&this.accountLevel.equals(rhs.accountLevel))))&&((this.partyId == rhs.partyId)||((this.partyId!= null)&&this.partyId.equals(rhs.partyId))));
    }

}
