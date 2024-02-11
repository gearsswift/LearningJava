/*816032626*/
public class ChatBot
{
     private String chatBotName;
     private int numResponsesGenerated;
     private static int messageLimit = 10;
     private static int messageNumber = 0;
     
     public ChatBot()
     {
        chatBotName = "ChatGPT-3.5 ";
        numResponsesGenerated = 0;
        
     }
     
     public ChatBot(int LLMCode)
     {
        chatBotName = ChatBotGenerator.generateChatBotLLM(LLMCode);
     }
     
     public String getChatBotName()
     {
          return chatBotName;   
     }
     
     public int getNumResponsesGenerated()
     {
          return numResponsesGenerated;   
     }
     
     public static int getTotalNumResponsesGenerated()
     {
         return messageNumber;
     }
     
     public static int getMessageLimit()
     {
         return messageLimit;
     }
     
     public static int getTotalNumMessagesRemaining()
     {
         return messageLimit - messageNumber;   
     }
     
     public static boolean limitReached()
     {
        return (getTotalNumMessagesRemaining()) < 1;
     }
     
     private String generateResponse()
     {
          numResponsesGenerated += 1;
          messageNumber += 1;
          String output = String.format("(Message# %d) Response from %s >> generatedTextHere\n",numResponsesGenerated,chatBotName);
          return output;
     }
     
     public String prompt(String requestMessage)
     {
        return limitReached()? "Daily Limit Reached. Wait 24 hours to resume chatbot usage\n":generateResponse();   
     }
     
     public String toString() 
     {
         String output = String.format("ChatBot Name: %s Number Messages Used: %d",chatBotName,numResponsesGenerated);
         return output;
     }
}
