import java.util.ArrayList;
/*816032626*/
public class ChatBotPlatform
{
    private ArrayList<ChatBot> bots;
    
    public ChatBotPlatform()
    {
        bots = new ArrayList<ChatBot>();
    }
    
    public String getChatBotList()
    {
        String string = "--------------\n Your ChatBots\n";
        for(int i = 0; i < bots.size(); i++)
        {
            string += String.format("Bot Number: %d %s\n", i, bots.get(i).toString());
        }
        string += String.format("Total Messages Used: %d\n",ChatBot.getTotalNumResponsesGenerated());
        string += String.format("Total Messages Remaining: %d\n--------------",ChatBot.getTotalNumMessagesRemaining());
        return string;
    }
    
    public boolean addChatBot(int LLMcode)
    {
        if(ChatBot.limitReached())
        {
            return false;
        }
        ChatBot newChatBot = new ChatBot(LLMcode);
        bots.add(newChatBot);
        return true;
    }
    
    public String interactWithBot(int botNumber, String message)
    {
        if(botNumber >= bots.size() || botNumber < 0)
        {
            return String.format("Incorrect Bot Number (%d) Selected. Try again",botNumber);
        }
        return bots.get(botNumber).prompt(message);
    }
    
}
