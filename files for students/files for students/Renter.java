//816032626
import java.util.ArrayList;
import java.util.Random;

public class Renter
{
    private ArrayList<Bill> bills;
    private String userName;
    private String password;
    private Random rand;
    PaidComparator paidComparer;
    AmountComparator amountComparer;
    
    public Renter(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
        rand = new Random();
        bills = new ArrayList<Bill>();
        paidComparer = new PaidComparator();
        amountComparer = new AmountComparator();
    }
    
    public Bill[] GetBills()
    {
         int l = bills.size();
        Bill[] array = new Bill[l];
        //Putting Bills in an array
        for(int i = 0; i < l ; i++)
        {
            array[i] = bills.get(i);
        }
        return array;
    }
    
    public Bill[] SortedBillsByAmount()
    {
        
        int l = bills.size();
        Bill[] array = new Bill[l];
        //Putting Bills in an array
        for(int i = 0; i < l ; i++)
        {
            array[i] = bills.get(i);
        }
        
        //Sorting an array
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (amountComparer.compare(array[j], array[j + 1]) == -1) {
                    // Swap arr[j] and arr[j+1]
                    Bill temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    
    
    public Bill[] SortedBillsByPaid()
    {
        
        int l = bills.size();
        Bill[] array = new Bill[l];
        //Putting Bills in an array
        for(int i = 0; i < l ; i++)
        {
            array[i] = bills.get(i);
        }
        
        //Sorting an array
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (paidComparer.compare(array[j], array[j + 1]) == -1) {
                    // Swap arr[j] and arr[j+1]
                    Bill temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    
    
    public void generateBills(){
           String[] types = {"Electric", "Internet", "Water"};
           int typeIndex = rand.nextInt(3);
           double amount = Math.floor((rand.nextDouble()*1000) * 100) / 100;
           int paidIndex = rand.nextInt(2);
           boolean paid = false;
           for(int i = 0; i<40; i++)
           {
             bills.add(new Bill(types[typeIndex], amount, paid));
             paidIndex = rand.nextInt(2);
             if(paidIndex == 0) paid = false;
             else paid = true;
             typeIndex =rand.nextInt(3);
             amount = Math.floor((rand.nextDouble()*1000) * 100) / 100;
           } 
    } 
    
    public boolean equals(Object obj)
    {
        if(! (obj instanceof Renter))
        {
            return false;
        }
        
        Renter r = (Renter)obj;
        return r.userName.equals(this.userName) && r.password.equals(this.password);
    }
}
