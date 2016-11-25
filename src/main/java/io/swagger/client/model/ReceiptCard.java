package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.ReceiptItem;
import io.swagger.client.model.CardAction;
import java.util.*;
import io.swagger.client.model.Fact;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A receipt card
 **/
@ApiModel(description = "A receipt card")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class ReceiptCard   {
  
  private String title = null;
  private List<ReceiptItem> items = new ArrayList<ReceiptItem>();
  private List<Fact> facts = new ArrayList<Fact>();
  private CardAction tap = null;
  private String total = null;
  private String tax = null;
  private String vat = null;
  private List<CardAction> buttons = new ArrayList<CardAction>();

  
  /**
   * Title of the card
   **/
  @ApiModelProperty(value = "Title of the card")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Array of Receipt Items
   **/
  @ApiModelProperty(value = "Array of Receipt Items")
  @JsonProperty("items")
  public List<ReceiptItem> getItems() {
    return items;
  }
  public void setItems(List<ReceiptItem> items) {
    this.items = items;
  }

  
  /**
   * Array of Fact Objects   Array of key-value pairs.
   **/
  @ApiModelProperty(value = "Array of Fact Objects   Array of key-value pairs.")
  @JsonProperty("facts")
  public List<Fact> getFacts() {
    return facts;
  }
  public void setFacts(List<Fact> facts) {
    this.facts = facts;
  }

  
  /**
   * This action will be activated when user taps on the card
   **/
  @ApiModelProperty(value = "This action will be activated when user taps on the card")
  @JsonProperty("tap")
  public CardAction getTap() {
    return tap;
  }
  public void setTap(CardAction tap) {
    this.tap = tap;
  }

  
  /**
   * Total amount of money paid (or should be paid)
   **/
  @ApiModelProperty(value = "Total amount of money paid (or should be paid)")
  @JsonProperty("total")
  public String getTotal() {
    return total;
  }
  public void setTotal(String total) {
    this.total = total;
  }

  
  /**
   * Total amount of TAX paid(or should be paid)
   **/
  @ApiModelProperty(value = "Total amount of TAX paid(or should be paid)")
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }
  public void setTax(String tax) {
    this.tax = tax;
  }

  
  /**
   * Total amount of VAT paid(or should be paid)
   **/
  @ApiModelProperty(value = "Total amount of VAT paid(or should be paid)")
  @JsonProperty("vat")
  public String getVat() {
    return vat;
  }
  public void setVat(String vat) {
    this.vat = vat;
  }

  
  /**
   * Set of actions applicable to the current card
   **/
  @ApiModelProperty(value = "Set of actions applicable to the current card")
  @JsonProperty("buttons")
  public List<CardAction> getButtons() {
    return buttons;
  }
  public void setButtons(List<CardAction> buttons) {
    this.buttons = buttons;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptCard {\n");
    
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    items: ").append(StringUtil.toIndentedString(items)).append("\n");
    sb.append("    facts: ").append(StringUtil.toIndentedString(facts)).append("\n");
    sb.append("    tap: ").append(StringUtil.toIndentedString(tap)).append("\n");
    sb.append("    total: ").append(StringUtil.toIndentedString(total)).append("\n");
    sb.append("    tax: ").append(StringUtil.toIndentedString(tax)).append("\n");
    sb.append("    vat: ").append(StringUtil.toIndentedString(vat)).append("\n");
    sb.append("    buttons: ").append(StringUtil.toIndentedString(buttons)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
