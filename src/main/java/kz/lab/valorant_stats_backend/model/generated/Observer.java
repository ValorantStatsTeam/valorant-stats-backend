
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
    "account_level",
    "session_playtime_in_ms",
    "card_id",
    "title_id",
    "party_id"
})
@Generated("jsonschema2pojo")
public class Observer implements Serializable
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
    @JsonProperty("account_level")
    @NotNull
    private Long accountLevel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("session_playtime_in_ms")
    @NotNull
    private Long sessionPlaytimeInMs;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("card_id")
    @NotNull
    private String cardId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title_id")
    @NotNull
    private String titleId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("party_id")
    @NotNull
    private String partyId;
    private final static long serialVersionUID = -4247390674913997623L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Observer() {
    }

    public Observer(String puuid, String name, String tag, Long accountLevel, Long sessionPlaytimeInMs, String cardId, String titleId, String partyId) {
        super();
        this.puuid = puuid;
        this.name = name;
        this.tag = tag;
        this.accountLevel = accountLevel;
        this.sessionPlaytimeInMs = sessionPlaytimeInMs;
        this.cardId = cardId;
        this.titleId = titleId;
        this.partyId = partyId;
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

    public Observer withPuuid(String puuid) {
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

    public Observer withName(String name) {
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

    public Observer withTag(String tag) {
        this.tag = tag;
        return this;
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

    public Observer withAccountLevel(Long accountLevel) {
        this.accountLevel = accountLevel;
        return this;
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

    public Observer withSessionPlaytimeInMs(Long sessionPlaytimeInMs) {
        this.sessionPlaytimeInMs = sessionPlaytimeInMs;
        return this;
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

    public Observer withCardId(String cardId) {
        this.cardId = cardId;
        return this;
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

    public Observer withTitleId(String titleId) {
        this.titleId = titleId;
        return this;
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

    public Observer withPartyId(String partyId) {
        this.partyId = partyId;
        return this;
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
