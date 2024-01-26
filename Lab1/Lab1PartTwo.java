import java.util.Scanner;


public class Lab1PartTwo
{
   public static void main(String[] args)
   {
       //This will be used to read users input
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter name: ");
       String name = scanner.nextLine();
       System.out.println("Nice to meet you "+ name);
   }
}
