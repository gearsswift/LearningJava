public class Undergraduate extends Student
{
   String minor;
   String major;
   int credits;
   
   public Undergraduate()
   {
    
   }
   
   public void SetMinor(String minor)
   {
       this.minor = minor; 
   }
   
   public void SetMajor(String major)
   {
       this.major = major; 
   }
   
   public void SetCredits(int credits)
   {
       this.credits = credits; 
   }
   
   public int credits()
   {
       return credits; 
   }
   
   public String minor()
   {
       return minor; 
   }
   
   public String major()
   {
       return major; 
   }
   
   public String toString()
   {
        calculateFees();
        String starter = super.toString();   
        return String.format("%s ,Major: %s , Minor: %s , Credits: %d",starter,major,minor,credits);
   }
   
   public void calculateFees()
   {
       double fees =  200 * credits;
       super.setFees(fees);
   }
}
