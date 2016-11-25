package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardImage;
import io.swagger.client.model.CardAction;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An item on a receipt card
 **/
@ApiModel(description = "An item on a receipt card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class ReceiptItem   {
  
  private String title = null;
  private String subtitle = null;
  private String text = null;
  private CardImage image = null;
  private String price = null;
  private String quantity = null;
  private CardAction tap = null;

  
  /**
   * Title of the Card
   **/
  @ApiModelProperty(value = "Title of the Card")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Subtitle appears just below Title field, differs from Title in font styling only
   **/
  @ApiModelProperty(value = "Subtitle appears just below Title field, differs from Title in font styling only")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  
  /**
   * Text field appears just below subtitle, differs from Subtitle in font styling only
   **/
  @ApiModelProperty(value = "Text field appears just below subtitle, differs from Subtitle in font styling only")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Image
   **/
  @ApiModelProperty(value = "Image")
  @JsonProperty("image")
  public CardImage getImage() {
    return image;
  }
  public void setImage(CardImage image) {
    this.image = image;
  }

  
  /**
   * Amount with currency
   **/
  @ApiModelProperty(value = "Amount with currency")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  
  /**
   * Number of items of given kind
   **/
  @ApiModelProperty(value = "Number of items of given kind")
  @JsonProperty("quantity")
  public String getQuantity() {
    return quantity;
  }
  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  
  /**
   * This action will be activated when user taps on the Item bubble.
   **/
  @ApiModelProperty(value = "This action will be activated when user taps on the Item bubble.")
  @JsonProperty("tap")
  public CardAction getTap() {
    return tap;
  }
  public void setTap(CardAction tap) {
    this.tap = tap;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptItem {\n");
    
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(StringUtil.toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    image: ").append(StringUtil.toIndentedString(image)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(StringUtil.toIndentedString(quantity)).append("\n");
    sb.append("    tap: ").append(StringUtil.toIndentedString(tap)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
