public class VehicleDriver {
    private String name;
    private Vehicle vehicle1;
    private Vehicle vehicle2;
    
    public VehicleDriver(String name){
        this.name = name;
        vehicle1 = null;
        vehicle2 = null;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean addVehicle(Vehicle vehicle)
    {
        if(vehicle != null)
        {
            if(vehicle1 == null)
            {
                if(vehicle2 != null)
                {
                     if(vehicle.equals(vehicle2))
                        return false;
                }
                    vehicle1 = vehicle;            
            }
            else if(vehicle2 == null)
            {
                if(vehicle.equals(vehicle1))
                    return false;
                vehicle2 = vehicle;
            }
            else
            {
                return false;
            }
                
            return true;
        }        
        return false;
    }
    
    public String toString()
    {
        return getName() + 
        "\n 1. " + vehicle1.toString() +
        "\n 2. " + vehicle2.toString();
    }
}
