package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Entity;
import io.swagger.client.model.ConversationAccount;
import java.util.*;
import io.swagger.client.model.Attachment;
import java.util.Date;
import io.swagger.client.model.ChannelAccount;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An Activity is the basic communication type for the Bot Framework 3.0 protocol
 **/
@ApiModel(description = "An Activity is the basic communication type for the Bot Framework 3.0 protocol")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class Activity   {
  
  private String type = null;
  private String id = null;
  private Date timestamp = null;
  private Date localTimestamp = null;
  private String serviceUrl = null;
  private String channelId = null;
  private ChannelAccount from = null;
  private ConversationAccount conversation = null;
  private ChannelAccount recipient = null;
  private String textFormat = null;
  private String attachmentLayout = null;
  private List<ChannelAccount> membersAdded = new ArrayList<ChannelAccount>();
  private List<ChannelAccount> membersRemoved = new ArrayList<ChannelAccount>();
  private String topicName = null;
  private Boolean historyDisclosed = null;
  private String locale = null;
  private String text = null;
  private String summary = null;
  private List<Attachment> attachments = new ArrayList<Attachment>();
  private List<Entity> entities = new ArrayList<Entity>();
  private Object channelData = null;
  private String action = null;
  private String replyToId = null;
  private Object value = null;

  
  /**
   * The type of the activity [message|contactRelationUpdate|converationUpdate|typing]
   **/
  @ApiModelProperty(value = "The type of the activity [message|contactRelationUpdate|converationUpdate|typing]")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Id for the activity
   **/
  @ApiModelProperty(value = "Id for the activity")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * UTC Time when message was sent (Set by service)
   **/
  @ApiModelProperty(value = "UTC Time when message was sent (Set by service)")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * Local time when message was sent (set by client Ex: 2016-09-23T13:07:49.4714686-07:00)
   **/
  @ApiModelProperty(value = "Local time when message was sent (set by client Ex: 2016-09-23T13:07:49.4714686-07:00)")
  @JsonProperty("localTimestamp")
  public Date getLocalTimestamp() {
    return localTimestamp;
  }
  public void setLocalTimestamp(Date localTimestamp) {
    this.localTimestamp = localTimestamp;
  }

  
  /**
   * Service endpoint
   **/
  @ApiModelProperty(value = "Service endpoint")
  @JsonProperty("serviceUrl")
  public String getServiceUrl() {
    return serviceUrl;
  }
  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  
  /**
   * ChannelId the activity was on
   **/
  @ApiModelProperty(value = "ChannelId the activity was on")
  @JsonProperty("channelId")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  /**
   * Sender address
   **/
  @ApiModelProperty(value = "Sender address")
  @JsonProperty("from")
  public ChannelAccount getFrom() {
    return from;
  }
  public void setFrom(ChannelAccount from) {
    this.from = from;
  }

  
  /**
   * Conversation
   **/
  @ApiModelProperty(value = "Conversation")
  @JsonProperty("conversation")
  public ConversationAccount getConversation() {
    return conversation;
  }
  public void setConversation(ConversationAccount conversation) {
    this.conversation = conversation;
  }

  
  /**
   * (Outbound to bot only) Bot's address that received the message
   **/
  @ApiModelProperty(value = "(Outbound to bot only) Bot's address that received the message")
  @JsonProperty("recipient")
  public ChannelAccount getRecipient() {
    return recipient;
  }
  public void setRecipient(ChannelAccount recipient) {
    this.recipient = recipient;
  }

  
  /**
   * Format of text fields [plain|markdown] Default:markdown
   **/
  @ApiModelProperty(value = "Format of text fields [plain|markdown] Default:markdown")
  @JsonProperty("textFormat")
  public String getTextFormat() {
    return textFormat;
  }
  public void setTextFormat(String textFormat) {
    this.textFormat = textFormat;
  }

  
  /**
   * AttachmentLayout - hint for how to deal with multiple attachments Values: [list|carousel] Default:list
   **/
  @ApiModelProperty(value = "AttachmentLayout - hint for how to deal with multiple attachments Values: [list|carousel] Default:list")
  @JsonProperty("attachmentLayout")
  public String getAttachmentLayout() {
    return attachmentLayout;
  }
  public void setAttachmentLayout(String attachmentLayout) {
    this.attachmentLayout = attachmentLayout;
  }

  
  /**
   * Array of address added
   **/
  @ApiModelProperty(value = "Array of address added")
  @JsonProperty("membersAdded")
  public List<ChannelAccount> getMembersAdded() {
    return membersAdded;
  }
  public void setMembersAdded(List<ChannelAccount> membersAdded) {
    this.membersAdded = membersAdded;
  }

  
  /**
   * Array of addresses removed
   **/
  @ApiModelProperty(value = "Array of addresses removed")
  @JsonProperty("membersRemoved")
  public List<ChannelAccount> getMembersRemoved() {
    return membersRemoved;
  }
  public void setMembersRemoved(List<ChannelAccount> membersRemoved) {
    this.membersRemoved = membersRemoved;
  }

  
  /**
   * Conversations new topic name
   **/
  @ApiModelProperty(value = "Conversations new topic name")
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  
  /**
   * the previous history of the channel was disclosed
   **/
  @ApiModelProperty(value = "the previous history of the channel was disclosed")
  @JsonProperty("historyDisclosed")
  public Boolean getHistoryDisclosed() {
    return historyDisclosed;
  }
  public void setHistoryDisclosed(Boolean historyDisclosed) {
    this.historyDisclosed = historyDisclosed;
  }

  
  /**
   * The language code of the Text field
   **/
  @ApiModelProperty(value = "The language code of the Text field")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * Content for the message
   **/
  @ApiModelProperty(value = "Content for the message")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Text to display if you can't render cards
   **/
  @ApiModelProperty(value = "Text to display if you can't render cards")
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }
  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  /**
   * Attachments
   **/
  @ApiModelProperty(value = "Attachments")
  @JsonProperty("attachments")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  
  /**
   * Collection of Entity objects, each of which contains metadata about this activity. Each Entity object is typed.
   **/
  @ApiModelProperty(value = "Collection of Entity objects, each of which contains metadata about this activity. Each Entity object is typed.")
  @JsonProperty("entities")
  public List<Entity> getEntities() {
    return entities;
  }
  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }

  
  /**
   * Channel specific payload
   **/
  @ApiModelProperty(value = "Channel specific payload")
  @JsonProperty("channelData")
  public Object getChannelData() {
    return channelData;
  }
  public void setChannelData(Object channelData) {
    this.channelData = channelData;
  }

  
  /**
   * ContactAdded/Removed action
   **/
  @ApiModelProperty(value = "ContactAdded/Removed action")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * the original id this message is a response to
   **/
  @ApiModelProperty(value = "the original id this message is a response to")
  @JsonProperty("replyToId")
  public String getReplyToId() {
    return replyToId;
  }
  public void setReplyToId(String replyToId) {
    this.replyToId = replyToId;
  }

  
  /**
   * Open ended value
   **/
  @ApiModelProperty(value = "Open ended value")
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    localTimestamp: ").append(StringUtil.toIndentedString(localTimestamp)).append("\n");
    sb.append("    serviceUrl: ").append(StringUtil.toIndentedString(serviceUrl)).append("\n");
    sb.append("    channelId: ").append(StringUtil.toIndentedString(channelId)).append("\n");
    sb.append("    from: ").append(StringUtil.toIndentedString(from)).append("\n");
    sb.append("    conversation: ").append(StringUtil.toIndentedString(conversation)).append("\n");
    sb.append("    recipient: ").append(StringUtil.toIndentedString(recipient)).append("\n");
    sb.append("    textFormat: ").append(StringUtil.toIndentedString(textFormat)).append("\n");
    sb.append("    attachmentLayout: ").append(StringUtil.toIndentedString(attachmentLayout)).append("\n");
    sb.append("    membersAdded: ").append(StringUtil.toIndentedString(membersAdded)).append("\n");
    sb.append("    membersRemoved: ").append(StringUtil.toIndentedString(membersRemoved)).append("\n");
    sb.append("    topicName: ").append(StringUtil.toIndentedString(topicName)).append("\n");
    sb.append("    historyDisclosed: ").append(StringUtil.toIndentedString(historyDisclosed)).append("\n");
    sb.append("    locale: ").append(StringUtil.toIndentedString(locale)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    summary: ").append(StringUtil.toIndentedString(summary)).append("\n");
    sb.append("    attachments: ").append(StringUtil.toIndentedString(attachments)).append("\n");
    sb.append("    entities: ").append(StringUtil.toIndentedString(entities)).append("\n");
    sb.append("    channelData: ").append(StringUtil.toIndentedString(channelData)).append("\n");
    sb.append("    action: ").append(StringUtil.toIndentedString(action)).append("\n");
    sb.append("    replyToId: ").append(StringUtil.toIndentedString(replyToId)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
