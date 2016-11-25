package com.mydomain;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.ConversationsApi;
import io.swagger.client.model.Activity;
import io.swagger.client.model.ActivitySet;
import io.swagger.client.model.ChannelAccount;
import io.swagger.client.model.Conversation;
import io.swagger.client.model.ResourceResponse;

public class App {
	public static void main(String[] args) throws ApiException, InterruptedException {
		String apiKey = "<your secret key token from https://dev.botframework.com/>";
		ConversationsApi conversationsApi = new ConversationsApi();
		ApiClient client = conversationsApi.getApiClient();
		client.addDefaultHeader("Authorization", "Bearer " + apiKey);

		// Enable Jersey LoggingFilter and you can check contents of requests
		client.setDebugging(true);

		System.out.println("@@conversation start");
		Conversation conv = conversationsApi.conversationsStartConversation();
		{
			System.out.println("@@post a conversation message");
			Activity activity = new Activity();
			ChannelAccount channelAccount = new ChannelAccount();
			channelAccount.setName("user1");
			channelAccount.setId("directline");
			activity.setFrom(channelAccount);
			activity.setType("Message");
			activity.setText("hello my bot!");
			ResourceResponse response = conversationsApi.conversationsPostActivity(conv.getConversationId(), activity);
		}

		{
			System.out.println("@@get conversation messages");
			String watermark = "";
			do {
				ActivitySet activitySet = //
						conversationsApi.conversationsGetActivities(conv.getConversationId(), watermark);
				System.out.println("activitySet size = " + activitySet.getActivities().size());
				for (Activity activity : activitySet.getActivities()) {
					System.out.println("\t" + activity.getFrom().getName() + " says \"" + activity.getText() + "\"");
				}
				if (activitySet.getWatermark() == null || watermark.equals(activitySet.getWatermark()) == false)
					break;
				watermark = activitySet.getWatermark();
				System.out.println("watermark = " + watermark);
			} while (true);
		}
		System.out.println("end");
	}
}
