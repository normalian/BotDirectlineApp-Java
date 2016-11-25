package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing a media thumbnail
 **/
@ApiModel(description = "Object describing a media thumbnail")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class ThumbnailUrl   {
  
  private String url = null;
  private String alt = null;

  
  /**
   * url pointing to an thumbnail to use for media content
   **/
  @ApiModelProperty(value = "url pointing to an thumbnail to use for media content")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Alt text to display for screen readers on the thumbnail image
   **/
  @ApiModelProperty(value = "Alt text to display for screen readers on the thumbnail image")
  @JsonProperty("alt")
  public String getAlt() {
    return alt;
  }
  public void setAlt(String alt) {
    this.alt = alt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThumbnailUrl {\n");
    
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    alt: ").append(StringUtil.toIndentedString(alt)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
