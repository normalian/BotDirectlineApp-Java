package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Activity;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A collection of activities
 **/
@ApiModel(description = "A collection of activities")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class ActivitySet   {
  
  private List<Activity> activities = new ArrayList<Activity>();
  private String watermark = null;

  
  /**
   * Activities
   **/
  @ApiModelProperty(value = "Activities")
  @JsonProperty("activities")
  public List<Activity> getActivities() {
    return activities;
  }
  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }

  
  /**
   * Maximum watermark of activities within this set
   **/
  @ApiModelProperty(value = "Maximum watermark of activities within this set")
  @JsonProperty("watermark")
  public String getWatermark() {
    return watermark;
  }
  public void setWatermark(String watermark) {
    this.watermark = watermark;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitySet {\n");
    
    sb.append("    activities: ").append(StringUtil.toIndentedString(activities)).append("\n");
    sb.append("    watermark: ").append(StringUtil.toIndentedString(watermark)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
