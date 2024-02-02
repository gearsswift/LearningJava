public class Vehicle
{
     private int tankCapacity;
     private String fuelType;
     
     public Vehicle(int length, int width, int breadth)
     {
         tankCapacity = length * width * breadth;
         if(tankCapacity%2 == 0)
         {
             fuelType = "gasoline";
             return;
         }
         fuelType = "diesel";
     }
     
     public int tankCapacity()
     {
         return tankCapacity;
     }
     
     public String fuelType()
     {
        return fuelType;
     }
     
     public String toString()
     {
       String format = String.format("VEHICLE TANK CAPACITY: %d FUEL TYPE %s",tankCapacity,fuelType);
       return format;
     }
}
