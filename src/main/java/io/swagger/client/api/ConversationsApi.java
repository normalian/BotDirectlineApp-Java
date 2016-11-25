package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.Conversation;
import io.swagger.client.model.ActivitySet;
import io.swagger.client.model.ResourceResponse;
import io.swagger.client.model.Activity;
import java.io.File;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-23T14:09:23.830+09:00")
public class ConversationsApi {
	private ApiClient apiClient;
	private Map<String, String> headerParams = new HashMap<String, String>();

	public Map<String, String> getHeaderParams() {
		return headerParams;
	}

	public void setHeaderParams(Map<String, String> headerParams) {
		this.headerParams = headerParams;
	}

	public ConversationsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ConversationsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Start a new conversation
	 * 
	 * @return Conversation
	 */
	public Conversation conversationsStartConversation() throws ApiException {
		Object postBody = "";
		byte[] postBinaryBody = null;

		// create path and map variables
		String path = "/v3/directline/conversations".replaceAll("\\{format\\}", "json");

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json", "text/json", "text/html", "application/xml", "text/xml" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		TypeRef returnType = new TypeRef<Conversation>() {
		};
		return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams,
				accept, contentType, authNames, returnType);

	}

	/**
	 * Get information about an existing conversation
	 * 
	 * @param conversationId
	 * @param watermark
	 * @return Conversation
	 */
	public Conversation conversationsReconnectToConversation(String conversationId, String watermark)
			throws ApiException {
		Object postBody = new Object();
		byte[] postBinaryBody = null;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400,
					"Missing the required parameter 'conversationId' when calling conversationsReconnectToConversation");
		}

		// create path and map variables
		String path = "/v3/directline/conversations/{conversationId}".replaceAll("\\{format\\}", "json")
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "watermark", watermark));

		final String[] accepts = { "application/json", "text/json", "text/html", "application/xml", "text/xml" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {

		};
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		TypeRef returnType = new TypeRef<Conversation>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Get activities in this conversation. This method is paged with the
	 * &#39;watermark&#39; parameter.
	 * 
	 * @param conversationId
	 *            Conversation ID
	 * @param watermark
	 *            (Optional) only returns activities newer than this watermark
	 * @return ActivitySet
	 */
	public ActivitySet conversationsGetActivities(String conversationId, String watermark) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400,
					"Missing the required parameter 'conversationId' when calling conversationsGetActivities");
		}

		// create path and map variables
		String path = "/v3/directline/conversations/{conversationId}/activities".replaceAll("\\{format\\}", "json")
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "watermark", watermark));

		final String[] accepts = { "application/json", "text/json", "text/html", "application/xml", "text/xml" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {

		};
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		TypeRef returnType = new TypeRef<ActivitySet>() {
		};
		return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept,
				contentType, authNames, returnType);

	}

	/**
	 * Send an activity
	 * 
	 * @param conversationId
	 *            Conversation ID
	 * @param activity
	 *            Activity to send
	 * @return ResourceResponse
	 */
	public ResourceResponse conversationsPostActivity(String conversationId, Activity activity) throws ApiException {
		Object postBody = activity;
		byte[] postBinaryBody = null;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400,
					"Missing the required parameter 'conversationId' when calling conversationsPostActivity");
		}

		// verify the required parameter 'activity' is set
		if (activity == null) {
			throw new ApiException(400,
					"Missing the required parameter 'activity' when calling conversationsPostActivity");
		}

		// create path and map variables
		String path = "/v3/directline/conversations/{conversationId}/activities".replaceAll("\\{format\\}", "json")
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		final String[] accepts = { "application/json", "text/json", "text/html" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "application/json", "text/json", "text/html", "application/xml", "text/xml",
				"application/x-www-form-urlencoded" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		TypeRef returnType = new TypeRef<ResourceResponse>() {
		};
		return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams,
				accept, contentType, authNames, returnType);

	}

	/**
	 * Upload file(s) and send as attachment(s)
	 * 
	 * @param conversationId
	 * @param file
	 * @param userId
	 * @return ResourceResponse
	 */
	public ResourceResponse conversationsUpload(String conversationId, File file, String userId) throws ApiException {
		Object postBody = null;
		byte[] postBinaryBody = null;

		// verify the required parameter 'conversationId' is set
		if (conversationId == null) {
			throw new ApiException(400,
					"Missing the required parameter 'conversationId' when calling conversationsUpload");
		}

		// verify the required parameter 'file' is set
		if (file == null) {
			throw new ApiException(400, "Missing the required parameter 'file' when calling conversationsUpload");
		}

		// create path and map variables
		String path = "/v3/directline/conversations/{conversationId}/upload".replaceAll("\\{format\\}", "json")
				.replaceAll("\\{" + "conversationId" + "\\}", apiClient.escapeString(conversationId.toString()));

		// query params
		List<Pair> queryParams = new ArrayList<Pair>();
		Map<String, Object> formParams = new HashMap<String, Object>();

		queryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

		if (file != null)
			formParams.put("file", file);

		final String[] accepts = { "application/json", "text/json", "text/html" };
		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = { "multipart/form-data" };
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		String[] authNames = new String[] {};

		TypeRef returnType = new TypeRef<ResourceResponse>() {
		};
		return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams,
				accept, contentType, authNames, returnType);

	}

}
