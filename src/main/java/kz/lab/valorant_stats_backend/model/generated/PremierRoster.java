
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "tag",
    "members",
    "customization"
})
@Generated("jsonschema2pojo")
public class PremierRoster implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private String id;
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
    @JsonProperty("members")
    @Valid
    @NotNull
    private List<String> members = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customization")
    @Valid
    @NotNull
    private Customization customization;
    private final static long serialVersionUID = 4455671690671174056L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PremierRoster() {
    }

    public PremierRoster(String id, String name, String tag, List<String> members, Customization customization) {
        super();
        this.id = id;
        this.name = name;
        this.tag = tag;
        this.members = members;
        this.customization = customization;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PremierRoster withId(String id) {
        this.id = id;
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

    public PremierRoster withName(String name) {
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

    public PremierRoster withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("members")
    public List<String> getMembers() {
        return members;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("members")
    public void setMembers(List<String> members) {
        this.members = members;
    }

    public PremierRoster withMembers(List<String> members) {
        this.members = members;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customization")
    public Customization getCustomization() {
        return customization;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("customization")
    public void setCustomization(Customization customization) {
        this.customization = customization;
    }

    public PremierRoster withCustomization(Customization customization) {
        this.customization = customization;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PremierRoster.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("tag");
        sb.append('=');
        sb.append(((this.tag == null)?"<null>":this.tag));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
        sb.append(',');
        sb.append("customization");
        sb.append('=');
        sb.append(((this.customization == null)?"<null>":this.customization));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tag == null)? 0 :this.tag.hashCode()));
        result = ((result* 31)+((this.customization == null)? 0 :this.customization.hashCode()));
        result = ((result* 31)+((this.members == null)? 0 :this.members.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PremierRoster) == false) {
            return false;
        }
        PremierRoster rhs = ((PremierRoster) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tag == rhs.tag)||((this.tag!= null)&&this.tag.equals(rhs.tag))))&&((this.customization == rhs.customization)||((this.customization!= null)&&this.customization.equals(rhs.customization))))&&((this.members == rhs.members)||((this.members!= null)&&this.members.equals(rhs.members))));
    }

}
