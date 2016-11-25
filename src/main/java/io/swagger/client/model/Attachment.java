package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An attachment within an activity
 **/
@ApiModel(description = "An attachment within an activity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class Attachment   {
  
  private String contentType = null;
  private String contentUrl = null;
  private Object content = null;
  private String name = null;
  private String thumbnailUrl = null;

  
  /**
   * mimetype/Contenttype for the file
   **/
  @ApiModelProperty(value = "mimetype/Contenttype for the file")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   * Content Url
   **/
  @ApiModelProperty(value = "Content Url")
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }
  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  
  /**
   * Embedded content
   **/
  @ApiModelProperty(value = "Embedded content")
  @JsonProperty("content")
  public Object getContent() {
    return content;
  }
  public void setContent(Object content) {
    this.content = content;
  }

  
  /**
   * (OPTIONAL) The name of the attachment
   **/
  @ApiModelProperty(value = "(OPTIONAL) The name of the attachment")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * (OPTIONAL) Thumbnail associated with attachment
   **/
  @ApiModelProperty(value = "(OPTIONAL) Thumbnail associated with attachment")
  @JsonProperty("thumbnailUrl")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    contentType: ").append(StringUtil.toIndentedString(contentType)).append("\n");
    sb.append("    contentUrl: ").append(StringUtil.toIndentedString(contentUrl)).append("\n");
    sb.append("    content: ").append(StringUtil.toIndentedString(content)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    thumbnailUrl: ").append(StringUtil.toIndentedString(thumbnailUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
