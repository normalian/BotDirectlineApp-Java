package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Channel account information needed to route a message
 **/
@ApiModel(description = "Channel account information needed to route a message")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class ChannelAccount   {
  
  private String id = null;
  private String name = null;

  
  /**
   * Channel id for the user or bot on this channel (Example: joe@smith.com, or @joesmith or 123456)
   **/
  @ApiModelProperty(value = "Channel id for the user or bot on this channel (Example: joe@smith.com, or @joesmith or 123456)")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Display friendly name
   **/
  @ApiModelProperty(value = "Display friendly name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelAccount {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
