//816032626
import java.util.Comparator;


public class PaidComparator implements Comparator<Bill>
{
    public int compare(Bill a, Bill b)
    {
        return a.paid() && b.paid()? a.GetAmount() > b.GetAmount()? 1 : -1 : a.paid()? 1 : -1;
    }
}
