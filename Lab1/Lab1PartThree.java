import java.util.Scanner;
import java.util.Random;

public class Lab1PartThree
{
    public static void exercise1()
    {
        //Used to get user input
        float area = 0F;
        float radius = 0F;
        Scanner scanner = new Scanner(System.in);          
        System.out.println("Enter the radius of a circle: ");
        radius = scanner.nextFloat();
        //Calculate area
        area = (float)Math.pow(radius,2) * (float)Math.PI;
        //Here we format a string that displays our area with not more than 3 decimal places
        String outputMessage = String.format("The area is %.3f",area);
        System.out.println(outputMessage);
    }
    
    public static void exercise2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        //Now we loop through all the numbers from 1 to n but only print the ones that are even
        for(int i = 1; i < n; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }
    
    public static void exercise3()
    {
        //This will be used to help us generate random numbers
        Random rnd = new Random();
        //Here we generate 2 random numbers between 0 and 9
        int n = rnd.nextInt(10);
        int n1 = rnd.nextInt(10);
        //Next we multiply the 2 numbers and store the result in a variable
        int product  = n * n1;
        String output  = String.format("%d multiplied by %d equals %d",n,n1,product);
        System.out.println(output);
        
    }
    
    public static void exercise4()
    {
        Random rnd = new Random();
        String[] responses = {"You probably black", "Stop Talking to me","Heyoo","You seem Cool", "Your mad bro"};
        boolean isPlaying  = true;
        Scanner scanner  =  new Scanner(System.in);
        while(isPlaying)
        {
            System.out.println("User: ");
            String str = scanner.nextLine();
            if(str.equalsIgnoreCase("exit"))
            {
                isPlaying = false;
                return;
            }
            int rndIndex = rnd.nextInt(5);
            System.out.println("System: " + responses[rndIndex]);
        }
    }
    
    public static void main(String[] args)
    {
        exercise1();//invokes excercise 1 method
        exercise2(); //invokes excercise 2 method
        exercise3();
        exercise4();
    }
}
