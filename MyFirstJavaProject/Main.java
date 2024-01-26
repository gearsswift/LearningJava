import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        //Here we create and instance of our scanner object to receive input
        Scanner scanner = new Scanner(System.in);
        //Display a prompt for the user
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is "+ name);
        //Get user age
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Your are "+ age + " years old");
        //Use this to clear the scanner after receiving a type specific input from user
        //like what we did to get the user age
        scanner.nextLine();
        //Get favourite food
        System.out.println("What is your favourite food?");
        
    }        
}