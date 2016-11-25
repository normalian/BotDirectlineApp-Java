package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardAction;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A card representing a request to sign in
 **/
@ApiModel(description = "A card representing a request to sign in")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class SigninCard   {
  
  private String text = null;
  private List<CardAction> buttons = new ArrayList<CardAction>();

  
  /**
   * Text for signin request
   **/
  @ApiModelProperty(value = "Text for signin request")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Action to use to perform signin
   **/
  @ApiModelProperty(value = "Action to use to perform signin")
  @JsonProperty("buttons")
  public List<CardAction> getButtons() {
    return buttons;
  }
  public void setButtons(List<CardAction> buttons) {
    this.buttons = buttons;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigninCard {\n");
    
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    buttons: ").append(StringUtil.toIndentedString(buttons)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
