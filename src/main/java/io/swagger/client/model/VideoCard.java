package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.MediaUrl;
import io.swagger.client.model.ThumbnailUrl;
import io.swagger.client.model.CardAction;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A video card
 **/
@ApiModel(description = "A video card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class VideoCard   {
  
  private String aspect = null;
  private String title = null;
  private String subtitle = null;
  private String text = null;
  private ThumbnailUrl image = null;
  private List<MediaUrl> media = new ArrayList<MediaUrl>();
  private List<CardAction> buttons = new ArrayList<CardAction>();
  private Boolean shareable = null;
  private Boolean autoloop = null;
  private Boolean autostart = null;

  
  /**
   * Aspect ratio (16:9)(4:3)
   **/
  @ApiModelProperty(value = "Aspect ratio (16:9)(4:3)")
  @JsonProperty("aspect")
  public String getAspect() {
    return aspect;
  }
  public void setAspect(String aspect) {
    this.aspect = aspect;
  }

  
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
   * Text of the card
   **/
  @ApiModelProperty(value = "Text of the card")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Thumbnail placeholder
   **/
  @ApiModelProperty(value = "Thumbnail placeholder")
  @JsonProperty("image")
  public ThumbnailUrl getImage() {
    return image;
  }
  public void setImage(ThumbnailUrl image) {
    this.image = image;
  }

  
  /**
   * Array of media Url objects
   **/
  @ApiModelProperty(value = "Array of media Url objects")
  @JsonProperty("media")
  public List<MediaUrl> getMedia() {
    return media;
  }
  public void setMedia(List<MediaUrl> media) {
    this.media = media;
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
   * Is it OK for this content to be shareable with others (default:true)
   **/
  @ApiModelProperty(value = "Is it OK for this content to be shareable with others (default:true)")
  @JsonProperty("shareable")
  public Boolean getShareable() {
    return shareable;
  }
  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }

  
  /**
   * Should the client loop playback at end of content (default:true)
   **/
  @ApiModelProperty(value = "Should the client loop playback at end of content (default:true)")
  @JsonProperty("autoloop")
  public Boolean getAutoloop() {
    return autoloop;
  }
  public void setAutoloop(Boolean autoloop) {
    this.autoloop = autoloop;
  }

  
  /**
   * Should the client automatically start playback of video in this card (default:true)
   **/
  @ApiModelProperty(value = "Should the client automatically start playback of video in this card (default:true)")
  @JsonProperty("autostart")
  public Boolean getAutostart() {
    return autostart;
  }
  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCard {\n");
    
    sb.append("    aspect: ").append(StringUtil.toIndentedString(aspect)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(StringUtil.toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    image: ").append(StringUtil.toIndentedString(image)).append("\n");
    sb.append("    media: ").append(StringUtil.toIndentedString(media)).append("\n");
    sb.append("    buttons: ").append(StringUtil.toIndentedString(buttons)).append("\n");
    sb.append("    shareable: ").append(StringUtil.toIndentedString(shareable)).append("\n");
    sb.append("    autoloop: ").append(StringUtil.toIndentedString(autoloop)).append("\n");
    sb.append("    autostart: ").append(StringUtil.toIndentedString(autostart)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
