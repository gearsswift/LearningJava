//816032626

import  java.util.ArrayList;



public class PaymentSystem
{
   private ArrayList<Renter> renters;
   
   
   public PaymentSystem()
   {
       renters = new ArrayList<Renter>(); 
   }
   
   private Renter getRenter(Renter r)
   {
       int l = renters.size();
       for(int i = 0; i < l; i++)
       {
           if(r.equals(renters.get(i)))
           {
               return  renters.get(i);
           }     
       }
       return null;
   }
   
   public String[] getRenterBills(String userName, String password)
   {
       Renter renter = getRenter(new Renter(userName,password));
       Bill[] renterBills = renter.GetBills();
       String[] bills = new String[renterBills.length];
       for(int i = 0; i < renterBills.length; i++)
       {
           bills[i] = renterBills[i].toString(); 
       }
       return bills; 
   }
   
   public String[] getSortedRenterBillsByAmount(String userName, String password)
   {
       Renter renter = getRenter(new Renter(userName,password));
       Bill[] renterBills = renter.SortedBillsByAmount();
       String[] bills = new String[renterBills.length];
       for(int i = 0; i < renterBills.length; i++)
       {
           bills[i] = renterBills[i].toString(); 
       }
       return bills; 
   }
   
   public String[] getSortedRenterBillsByPaid(String userName, String password)
   {
       Renter renter = getRenter(new Renter(userName,password));
       Bill[] renterBills = renter.SortedBillsByPaid();
       String[] bills = new String[renterBills.length];
       for(int i = 0; i < renterBills.length; i++)
       {
           bills[i] = renterBills[i].toString(); 
       }
       return bills;  
   }
   
   public boolean registerRenter(String userName, String password) 
   {
       if(validateRenter(userName,password))
           return false;
       
       Renter r = new Renter(userName,password);
       r.generateBills();
       renters.add(r);
       return true; 
   }
   
   public boolean validateRenter(String userName, String password)
   {
       Renter r = new Renter(userName,password);
       if(getRenter(r) != null)
           return true;
           
       return false;
   }
}
