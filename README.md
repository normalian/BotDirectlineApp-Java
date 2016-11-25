# BotDirectlineApp-Java
This is a sample of Bot Framework Direct Line API with Java. 

## How to use this sample?
You can use this sample after following below steps.

1. Make a bot applicaton with Bot Framework and deploy on Azure App Service.
2. Register your bot application at https://dev.botframework.com/, enable Direct Line API and get secret key of it.
3. Edit BotDirectlineApp-Java/src/main/java/com/mydomain/App.java with your secret key.

## How to make this sample?
You can get swagger.json from https://docs.botframework.com/en-us/restapi/directline3/#navtitle and generate Java codes for Direct Line API.

Run below commands in a folder including swagger.json.
```
wget https://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.1.4/swagger-codegen-cli-2.1.4.jar
java -jar swagger-codegen-cli-2.1.4.jar generate -i swagger.json -l java
```

After generating Java codes, there will be some malformed codes. Revise two classes. 

### io.swagger.client.model.Fact.java class
Generated code is below.
```
@ApiModel(description = "Set of key-value pairs. Advantage of this section is that key and value properties will be 
\n            rendered with default style information with some delimiter between them. So there is no need for developer to specify style information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class Fact   {
```

Revised code is below.
```
@ApiModel(description = "Set of key-value pairs. Advantage of this section is that key and value properties will be rendered with default style information with some delimiter between them. So there is no need for developer to specify style information.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-25T17:39:24.796+09:00")
public class Fact   {
```


###  io.swagger.client.api.ConversationsApi.java class
Generated code is below.
```
  public Conversation conversationsStartConversation () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
```

Revised code is below.
```
  public Conversation conversationsStartConversation () throws ApiException {
    Object postBody = "";
    byte[] postBinaryBody = null;
```

## Reference
- https://docs.botframework.com/en-us/restapi/directline3/#navtitle
- http://qiita.com/Quramy/items/c583f3213f0b77ff1bac
