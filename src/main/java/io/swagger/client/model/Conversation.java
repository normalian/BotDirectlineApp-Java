package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object representing a conversation or a conversation token
 **/
@ApiModel(description = "An object representing a conversation or a conversation token")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class Conversation   {
  
  private String conversationId = null;
  private String token = null;
  private Integer expiresIn = null;
  private String streamUrl = null;
  private String eTag = null;

  
  /**
   * ID for this conversation
   **/
  @ApiModelProperty(value = "ID for this conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * Token scoped to this conversation
   **/
  @ApiModelProperty(value = "Token scoped to this conversation")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Expiration for token
   **/
  @ApiModelProperty(value = "Expiration for token")
  @JsonProperty("expires_in")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  
  /**
   * URL for this conversation's message stream
   **/
  @ApiModelProperty(value = "URL for this conversation's message stream")
  @JsonProperty("streamUrl")
  public String getStreamUrl() {
    return streamUrl;
  }
  public void setStreamUrl(String streamUrl) {
    this.streamUrl = streamUrl;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("eTag")
  public String getETag() {
    return eTag;
  }
  public void setETag(String eTag) {
    this.eTag = eTag;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    
    sb.append("    conversationId: ").append(StringUtil.toIndentedString(conversationId)).append("\n");
    sb.append("    token: ").append(StringUtil.toIndentedString(token)).append("\n");
    sb.append("    expiresIn: ").append(StringUtil.toIndentedString(expiresIn)).append("\n");
    sb.append("    streamUrl: ").append(StringUtil.toIndentedString(streamUrl)).append("\n");
    sb.append("    eTag: ").append(StringUtil.toIndentedString(eTag)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
