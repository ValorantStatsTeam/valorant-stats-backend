
package kz.lab.valorant_stats_backend.model.generated;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "icon",
    "image",
    "primary_color",
    "secondary_color",
    "tertiary_color"
})
@Generated("jsonschema2pojo")
public class Customization implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("icon")
    @NotNull
    private String icon;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("image")
    @NotNull
    private String image;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primary_color")
    @NotNull
    private String primaryColor;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secondary_color")
    @NotNull
    private String secondaryColor;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tertiary_color")
    @NotNull
    private String tertiaryColor;
    private final static long serialVersionUID = -6268497049162829178L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Customization() {
    }

    public Customization(String icon, String image, String primaryColor, String secondaryColor, String tertiaryColor) {
        super();
        this.icon = icon;
        this.image = image;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.tertiaryColor = tertiaryColor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Customization withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    public Customization withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primary_color")
    public String getPrimaryColor() {
        return primaryColor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primary_color")
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public Customization withPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secondary_color")
    public String getSecondaryColor() {
        return secondaryColor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secondary_color")
    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public Customization withSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tertiary_color")
    public String getTertiaryColor() {
        return tertiaryColor;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tertiary_color")
    public void setTertiaryColor(String tertiaryColor) {
        this.tertiaryColor = tertiaryColor;
    }

    public Customization withTertiaryColor(String tertiaryColor) {
        this.tertiaryColor = tertiaryColor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Customization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("primaryColor");
        sb.append('=');
        sb.append(((this.primaryColor == null)?"<null>":this.primaryColor));
        sb.append(',');
        sb.append("secondaryColor");
        sb.append('=');
        sb.append(((this.secondaryColor == null)?"<null>":this.secondaryColor));
        sb.append(',');
        sb.append("tertiaryColor");
        sb.append('=');
        sb.append(((this.tertiaryColor == null)?"<null>":this.tertiaryColor));
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
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.primaryColor == null)? 0 :this.primaryColor.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.tertiaryColor == null)? 0 :this.tertiaryColor.hashCode()));
        result = ((result* 31)+((this.secondaryColor == null)? 0 :this.secondaryColor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customization) == false) {
            return false;
        }
        Customization rhs = ((Customization) other);
        return ((((((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon)))&&((this.primaryColor == rhs.primaryColor)||((this.primaryColor!= null)&&this.primaryColor.equals(rhs.primaryColor))))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.tertiaryColor == rhs.tertiaryColor)||((this.tertiaryColor!= null)&&this.tertiaryColor.equals(rhs.tertiaryColor))))&&((this.secondaryColor == rhs.secondaryColor)||((this.secondaryColor!= null)&&this.secondaryColor.equals(rhs.secondaryColor))));
    }

}
