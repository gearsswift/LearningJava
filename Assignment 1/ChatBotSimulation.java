/*816032626*/
import java.util.Scanner;
import java.util.Random;

public class ChatBotSimulation
{
   public static void main(String[] args)
   {
       System.out.println("Hello World!");
       ChatBotPlatform chatPlatform = new ChatBotPlatform();
       for(int i = 0; i < 6; i++)
       {
           chatPlatform.addChatBot(i);
       }
       System.out.println(chatPlatform.getChatBotList());
       Random rnd = new Random();
       for(int i = 0; i < 15; i++)
       {
           //The assignment did not say i need to take in user input to interact with 
           //the chatbots so this is how i decided to interact with random chatbots
           //up to 15 times
           int chatIndex = rnd.nextInt(6);
           System.out.println(chatPlatform.interactWithBot(chatIndex,"Question"));
       }
       System.out.println(chatPlatform.getChatBotList());

   }
  
    
}
