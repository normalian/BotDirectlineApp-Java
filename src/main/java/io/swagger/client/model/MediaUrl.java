package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * MediaUrl data
 **/
@ApiModel(description = "MediaUrl data")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class MediaUrl   {
  
  private String url = null;
  private String profile = null;

  
  /**
   * Url for the media
   **/
  @ApiModelProperty(value = "Url for the media")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Optional profile hint to the client to differentiate multiple MediaUrl objects from each other
   **/
  @ApiModelProperty(value = "Optional profile hint to the client to differentiate multiple MediaUrl objects from each other")
  @JsonProperty("profile")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUrl {\n");
    
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    profile: ").append(StringUtil.toIndentedString(profile)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
