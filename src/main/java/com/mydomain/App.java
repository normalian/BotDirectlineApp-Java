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
		String apiKey = "j5n4AG6JlPM.cwA.hKg.y4sIS1S8vYlQwqK8Vb2JCp411qsW7MNhGkL0Y_emD2U";
		ConversationsApi conversationsApi = new ConversationsApi();
		ApiClient client = conversationsApi.getApiClient();
		client.addDefaultHeader("Authorization", "Bearer " + apiKey);

		Conversation conv = conversationsApi.conversationsStartConversation();
		conversationsApi.getHeaderParams().put("Authorization", "Bearer " + apiKey);
		System.out.println("@@conversation start");

		Activity activity = new Activity();
		{
			activity.setText("hello");
			ChannelAccount channelAccount = new ChannelAccount();
			channelAccount.setName("user1");
			channelAccount.setId("directline");
			activity.setFrom(channelAccount);
			activity.setRecipient(channelAccount);
			activity.setType("Message");
			activity.setLocale("ja-JP");
			System.out.println("@@post conversation message");
			ResourceResponse response1 = conversationsApi.conversationsPostActivity(conv.getConversationId(), activity);

			ActivitySet activitySet1 = conversationsApi.conversationsGetActivities(conv.getConversationId(), "");
			String watermark1 = activitySet1.getWatermark();
			System.out.println("activitySet1 = " + activitySet1.getActivities());
		}
		{
			System.out.println("@@post conversation message");
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				ActivitySet activitySet1 = conversationsApi.conversationsGetActivities(conv.getConversationId(), "");
				String watermark1 = activitySet1.getWatermark();
				System.out.println("activitySet size = " + activitySet1.getActivities().size());
				for (Activity a : activitySet1.getActivities()) {
					System.out.println("\t" + a.getText());
				}
			}
		}

		System.out.println("end");
	}
}
