import java.util.ArrayList;

public class StationSimulation
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 
        ArrayList<VehicleDriver> drivers = new ArrayList<VehicleDriver>();
        String[] names = {"Lou","Sue","Drew","Koo","Murphy"};
       
        //Create 10 different types of vehicles
        int[] classifications = {1,3,4};
        for(int i = 0 ; i < 10; i++)
        {
            int classification = classifications[getRandomNumber(0,3)];
            Vehicle vehicle = new Vehicle(getRandomNumber(1,10),
            getRandomNumber(1,10),
            getRandomNumber(1,10),
            classification);
            vehicles.add(vehicle);
        }
        //Create drivers
        for(int i = 0; i < 5; i++)
        {
            VehicleDriver v = new VehicleDriver(names[i]);
            drivers.add(v);
        }
        
        //Add the first vehicle to drivers
        for(int i = 0; i<5; i++)
        {
            int index =  getRandomNumber(0,5);
            Vehicle v = vehicles.get(index);
            drivers.get(i).addVehicle(v);
        }
        //Add a second vehicle to drivers
        for(int i = 0; i<5; i++)
        {
            int index =  getRandomNumber(5,10);
            Vehicle v = vehicles.get(index);
            boolean valid = drivers.get(i).addVehicle(v);
        }  
        //Print out the drivers and their vehicle
        for(int i = 0; i<5; i++)
        {
            VehicleDriver d = drivers.get(i);
            System.out.println(d.toString());
        }        
    }
    
    public static int getRandomNumber(int min, int max)
    {
        return (int) (Math.random() * (max -min) + min);
    }
}
