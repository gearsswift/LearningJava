import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StationSimulation
{
   public static void main(String[] args)
   {
     FuelStation fuelStation = new FuelStation();
     ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
     
     //Reading from a file
     try
     {
         //This will run completely if no error is thrown
         File fileObj =  new File("vehicles.txt");
         Scanner fileReader =  new Scanner(fileObj); 
         while(fileReader.hasNextLine())
         {
             String data = fileReader.nextLine();
             String[] allData = data.split(",");
             if(allData.length == 3)
             {
                 int[] integers = new int[allData.length];
                 for(int i = 0; i < 3; i++)
                 {
                    integers[i] = Integer.valueOf(allData[i]);
                 }
                 //Create car object and add it to vehicles
                 Vehicle vehicle = new Vehicle(integers[0],integers[1],integers[2]);
                 vehicles.add(vehicle);
                 
             }   
         }
     } 
     catch(FileNotFoundException e)
     {
         //This will run if an error was thrown while we tried to run our code in the try block
         System.out.println("Error occured while reading from file");   
     }   
     System.out.println(fuelStation.toString() + "\n");
     for(int i = 0; i < vehicles.size(); i++)
     {
         String filledUp = "false";
         //Check if fuelStation dispenses the same fuel that the car is made for
        if(fuelStation.dispense(vehicles.get(i).fuelType(),vehicles.get(i).tankCapacity()))
        {
            filledUp = "true";
        }            
        System.out.println(fuelStation.toString());
        System.out.println("Filled up: " + filledUp);
        System.out.println(vehicles.get(i).toString());
        System.out.println();
     }
   } 
}
