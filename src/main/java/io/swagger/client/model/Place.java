package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Place (entity type: \&quot;https://schema.org/Place\&quot;)
 **/
@ApiModel(description = "Place (entity type: \"https://schema.org/Place\")")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class Place   {
  
  private Object address = null;
  private Object geo = null;
  private Object hasMap = null;
  private String type = null;
  private String name = null;

  
  /**
   * Address of the place (may be `string` or complex object of type `PostalAddress`)
   **/
  @ApiModelProperty(value = "Address of the place (may be `string` or complex object of type `PostalAddress`)")
  @JsonProperty("address")
  public Object getAddress() {
    return address;
  }
  public void setAddress(Object address) {
    this.address = address;
  }

  
  /**
   * Geo coordinates of the place (may be complex object of type `GeoCoordinates` or `GeoShape`)
   **/
  @ApiModelProperty(value = "Geo coordinates of the place (may be complex object of type `GeoCoordinates` or `GeoShape`)")
  @JsonProperty("geo")
  public Object getGeo() {
    return geo;
  }
  public void setGeo(Object geo) {
    this.geo = geo;
  }

  
  /**
   * Map to the place (may be `string` (URL) or complex object of type `Map`)
   **/
  @ApiModelProperty(value = "Map to the place (may be `string` (URL) or complex object of type `Map`)")
  @JsonProperty("hasMap")
  public Object getHasMap() {
    return hasMap;
  }
  public void setHasMap(Object hasMap) {
    this.hasMap = hasMap;
  }

  
  /**
   * The type of the thing
   **/
  @ApiModelProperty(value = "The type of the thing")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * The name of the thing
   **/
  @ApiModelProperty(value = "The name of the thing")
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
    sb.append("class Place {\n");
    
    sb.append("    address: ").append(StringUtil.toIndentedString(address)).append("\n");
    sb.append("    geo: ").append(StringUtil.toIndentedString(geo)).append("\n");
    sb.append("    hasMap: ").append(StringUtil.toIndentedString(hasMap)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
