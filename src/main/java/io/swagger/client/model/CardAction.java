package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An action on a card
 **/
@ApiModel(description = "An action on a card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class CardAction   {
  
  private String type = null;
  private String title = null;
  private String image = null;
  private String value = null;

  
  /**
   * Defines the type of action implemented by this button.
   **/
  @ApiModelProperty(value = "Defines the type of action implemented by this button.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Text description which appear on the button.
   **/
  @ApiModelProperty(value = "Text description which appear on the button.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * URL Picture which will appear on the button, next to text label.
   **/
  @ApiModelProperty(value = "URL Picture which will appear on the button, next to text label.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * Supplementary parameter for action. Content of this property depends on the ActionType
   **/
  @ApiModelProperty(value = "Supplementary parameter for action. Content of this property depends on the ActionType")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAction {\n");
    
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    image: ").append(StringUtil.toIndentedString(image)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
