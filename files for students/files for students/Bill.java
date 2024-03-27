//816032626
public class Bill
{
  private String billNumber;
  private double amount;
  private String type;
  private boolean paid;
  public static int billCount  = 1000;
  
  
  public Bill(String type, double amount, boolean isPaid)
  {
     billCount++;
     billNumber = Integer.toString(billCount);
     this.type = type;
     this.amount = amount;
     this.paid = isPaid;
  }
  
  public String GetBillNumber()
  {
      return billNumber;
  }
  
  public double GetAmount()
  {
      return amount;
  }
  
  public String type()
  {
      return type;
  }
  
  public boolean paid()
  {
      return paid;  
  }
  
  public String toString()
  {
      String format = String.format("%s %s $%.2f %s",billNumber, type, amount,paid? "PAID": "UNPAID")  ;
      return format;
  }
}
