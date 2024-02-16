public class Vehicle{
    private int tankCapacity;
    private String fuelType;
    private String plateID;
    private int vehicleClassification;
    private static int plateNumberCounter = 1;
    
    public Vehicle(int length, int breadth, int width){
        tankCapacity = length * breadth * width;
        if(tankCapacity%2 == 0)
            fuelType = "gasoline";
        else
            fuelType = "diesel";
        setPlateID();
        SetVehicleClassification(3);
    }
    
    public Vehicle(int length, int breadth, int width, int classification){
        tankCapacity = length * breadth * width;
        if(tankCapacity%2 == 0)
            fuelType = "gasoline";
        else
            fuelType = "diesel";
        setPlateID();
        SetVehicleClassification(classification);
    }
    
    public void SetVehicleClassification(int value)
    {
         switch(value)
        {
            case 1:
                vehicleClassification = value;
            break;
            case 3:
                vehicleClassification = value;
            break;
            case 4:
                vehicleClassification = value;
            break;
            default:
                vehicleClassification = 3;
            break;
        }
    }
    
    public int getVehicleClassification()
    {
        return vehicleClassification;
    }
    
    public String getVehicleClassification(int value)
    {
        String classification = "NONE";
        switch(value)
        {
            case 1:
                classification = "Motorcylcle";
            break;
            case 3:
                classification = "Light motor vehicle";
            break;
            case 4:
                classification = "Heavy motor vehicle";
            break;
        }
        return classification;
    }
    
    private void setPlateID()
    {
        if(plateNumberCounter < 10)
         plateID = String.format("TAB0%d",plateNumberCounter);
        else
          plateID = String.format("TAB%d",plateNumberCounter);  
        
        plateNumberCounter++;
    }
    
    private String getPlateID()
    {
        return plateID;
    }
    
    public int getTankCapacity(){
        return tankCapacity;
    }
    public String getFuelType(){
        return fuelType;
    }
    public String toString(){
        return "VEHICLE TANK CAPACITY: "+ getTankCapacity() + " FUEL TYPE: "+ getFuelType() +
        " PLATE ID: " + getPlateID()
        + " VEHICLE CLASSIFICATION: " + getVehicleClassification() + " " + 
        getVehicleClassification(vehicleClassification);
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Vehicle)//Check to see if the object passed in is an instance of another
        {
            Vehicle v = (Vehicle) obj;
            String otherVehiclePlateID = v.getPlateID();
            boolean result = this.plateID.equals(otherVehiclePlateID);
            return result;
        }
        return false;
    }
}