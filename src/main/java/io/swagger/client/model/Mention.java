package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.ChannelAccount;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Mention information (entity type: \&quot;mention\&quot;)
 **/
@ApiModel(description = "Mention information (entity type: \"mention\")")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class Mention   {
  
  private ChannelAccount mentioned = null;
  private String text = null;
  private String type = null;

  
  /**
   * The mentioned user
   **/
  @ApiModelProperty(value = "The mentioned user")
  @JsonProperty("mentioned")
  public ChannelAccount getMentioned() {
    return mentioned;
  }
  public void setMentioned(ChannelAccount mentioned) {
    this.mentioned = mentioned;
  }

  
  /**
   * Sub Text which represents the mention (can be null or empty)
   **/
  @ApiModelProperty(value = "Sub Text which represents the mention (can be null or empty)")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Entity Type (typically from schema.org types)
   **/
  @ApiModelProperty(value = "Entity Type (typically from schema.org types)")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mention {\n");
    
    sb.append("    mentioned: ").append(StringUtil.toIndentedString(mentioned)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
