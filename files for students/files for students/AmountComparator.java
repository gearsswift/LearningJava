//816032626
import java.util.Comparator;


public class AmountComparator implements Comparator<Bill>
{
     public int compare(Bill a, Bill b)
    {
        return a.GetAmount() > b.GetAmount() ? 1 : a.GetAmount() == b.GetAmount() ? 0 : -1 ;
    }
}
