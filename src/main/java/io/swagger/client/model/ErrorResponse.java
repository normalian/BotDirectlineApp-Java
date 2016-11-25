package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Error;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An HTTP API response
 **/
@ApiModel(description = "An HTTP API response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class ErrorResponse   {
  
  private Error error = null;

  
  /**
   * Error message
   **/
  @ApiModelProperty(value = "Error message")
  @JsonProperty("error")
  public Error getError() {
    return error;
  }
  public void setError(Error error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    error: ").append(StringUtil.toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
