/*816032626*/
public class ChatBotGenerator
{
     private static String[] chatBotNames = {
    "ChatGPT-3.5",
    "LLaMa",
    "Mistral7B",
    "Bard",
    "Claude",
    "Solar"};
    
    private static String[] getChatBotNames()
    {
        return chatBotNames;
    }
    
    public static String generateChatBotLLM()
    {
        return chatBotNames[0];
    }
    
    public static String generateChatBotLLM(int LLMCodeNumber)
    {
        if(LLMCodeNumber < chatBotNames.length)
        {
            return chatBotNames[LLMCodeNumber];
        }
        return chatBotNames[LLMCodeNumber];
    }
    
    public static String generateChatBotLLM(String botName)
    {
        for(int i = 0; i < chatBotNames.length; i++)
        {
            if(chatBotNames[i].equalsIgnoreCase(botName))
            {
                return botName;
            }
        }
        return chatBotNames[0];
    }
}
