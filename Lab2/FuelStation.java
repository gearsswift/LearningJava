public class FuelStation
{
    private String fuelType;
    private double fuelVolume;
    private double fuelRate;
    private double fuelSales;
    
    public FuelStation()
    {
        fuelType = "gasoline";
        fuelVolume = 75000;
        fuelRate = 2;
        fuelSales = 0;
    }
    
    private boolean sellFuel(double volume)
    {
        if(volume <= fuelVolume)
        {
            fuelVolume -= volume;
            double price = volume * 2;
            fuelSales += price;
            return true;
        }
        return false;
    }
    
    public boolean canDispenseFuelType(String fuelType)
    {
        if(this.fuelType == fuelType)
        {
            return true;
        }
        return false;
    }
    
    public boolean dispense(String fuelType, double volume)
    {
        boolean canDispense = canDispenseFuelType(fuelType) && sellFuel(volume);
        return canDispense;
    }
    
    public String fuelType() 
    {
        return fuelType;
    }
    
    public double fuelVolume() 
    {
        return fuelVolume;
    }
    
    public double fuelRate() 
    {
        return fuelRate;
    }
    
    public double fuelSales() 
    {
        return fuelSales;
    }
    
    public String toString()
    {
        //FUEL: gasoline VOL: 75000.0L PRICE PER L: $2.00 SALES: $0.00
        String format = String.format("FUEL: %s VOL:%.1fL PRICE PER L: $%.2f SALES: $%.2f",fuelType,fuelVolume,fuelRate,fuelSales);
        return format;
    }
    
}
