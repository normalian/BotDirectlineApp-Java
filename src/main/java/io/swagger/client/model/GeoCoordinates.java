package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * GeoCoordinates (entity type: \&quot;https://schema.org/GeoCoordinates\&quot;)
 **/
@ApiModel(description = "GeoCoordinates (entity type: \"https://schema.org/GeoCoordinates\")")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class GeoCoordinates   {
  
  private Double elevation = null;
  private Double latitude = null;
  private Double longitude = null;
  private String type = null;
  private String name = null;

  
  /**
   * Elevation of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   **/
  @ApiModelProperty(value = "Elevation of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  @JsonProperty("elevation")
  public Double getElevation() {
    return elevation;
  }
  public void setElevation(Double elevation) {
    this.elevation = elevation;
  }

  
  /**
   * Latitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   **/
  @ApiModelProperty(value = "Latitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)
   **/
  @ApiModelProperty(value = "Longitude of the location [WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
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
    sb.append("class GeoCoordinates {\n");
    
    sb.append("    elevation: ").append(StringUtil.toIndentedString(elevation)).append("\n");
    sb.append("    latitude: ").append(StringUtil.toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(StringUtil.toIndentedString(longitude)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
