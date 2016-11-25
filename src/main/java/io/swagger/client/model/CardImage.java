package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardAction;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An image on a card
 **/
@ApiModel(description = "An image on a card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class CardImage   {
  
  private String url = null;
  private String alt = null;
  private CardAction tap = null;

  
  /**
   * URL Thumbnail image for major content property.
   **/
  @ApiModelProperty(value = "URL Thumbnail image for major content property.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Image description intended for screen readers
   **/
  @ApiModelProperty(value = "Image description intended for screen readers")
  @JsonProperty("alt")
  public String getAlt() {
    return alt;
  }
  public void setAlt(String alt) {
    this.alt = alt;
  }

  
  /**
   * Action assigned to specific Attachment.E.g.navigate to specific URL or play/open media content
   **/
  @ApiModelProperty(value = "Action assigned to specific Attachment.E.g.navigate to specific URL or play/open media content")
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
    sb.append("class CardImage {\n");
    
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    alt: ").append(StringUtil.toIndentedString(alt)).append("\n");
    sb.append("    tap: ").append(StringUtil.toIndentedString(tap)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
