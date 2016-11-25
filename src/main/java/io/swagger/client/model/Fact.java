package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Set of key-value pairs. Advantage of this section is that key and value properties will be \n            rendered with default style information with some delimiter between them. So there is no need for developer to specify style information.
 **/
@ApiModel(description = "Set of key-value pairs. Advantage of this section is that key and value properties will be rendered with default style information with some delimiter between them. So there is no need for developer to specify style information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class Fact   {
  
  private String key = null;
  private String value = null;

  
  /**
   * The key for this Fact
   **/
  @ApiModelProperty(value = "The key for this Fact")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The value for this Fact
   **/
  @ApiModelProperty(value = "The value for this Fact")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fact {\n");
    
    sb.append("    key: ").append(StringUtil.toIndentedString(key)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
