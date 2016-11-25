package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardImage;
import io.swagger.client.model.CardAction;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A thumbnail card (card with a single, small thumbnail image)
 **/
@ApiModel(description = "A thumbnail card (card with a single, small thumbnail image)")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class ThumbnailCard   {
  
  private String title = null;
  private String subtitle = null;
  private String text = null;
  private List<CardImage> images = new ArrayList<CardImage>();
  private List<CardAction> buttons = new ArrayList<CardAction>();
  private CardAction tap = null;

  
  /**
   * Title of the card
   **/
  @ApiModelProperty(value = "Title of the card")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Subtitle of the card
   **/
  @ApiModelProperty(value = "Subtitle of the card")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  
  /**
   * Text for the card
   **/
  @ApiModelProperty(value = "Text for the card")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Array of images for the card
   **/
  @ApiModelProperty(value = "Array of images for the card")
  @JsonProperty("images")
  public List<CardImage> getImages() {
    return images;
  }
  public void setImages(List<CardImage> images) {
    this.images = images;
  }

  
  /**
   * Set of actions applicable to the current card
   **/
  @ApiModelProperty(value = "Set of actions applicable to the current card")
  @JsonProperty("buttons")
  public List<CardAction> getButtons() {
    return buttons;
  }
  public void setButtons(List<CardAction> buttons) {
    this.buttons = buttons;
  }

  
  /**
   * This action will be activated when user taps on the card itself
   **/
  @ApiModelProperty(value = "This action will be activated when user taps on the card itself")
  @JsonProperty("tap")
  public CardAction getTap() {
    return tap;
  }
  public void setTap(CardAction tap) {
    this.tap = tap;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThumbnailCard {\n");
    
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(StringUtil.toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    images: ").append(StringUtil.toIndentedString(images)).append("\n");
    sb.append("    buttons: ").append(StringUtil.toIndentedString(buttons)).append("\n");
    sb.append("    tap: ").append(StringUtil.toIndentedString(tap)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
