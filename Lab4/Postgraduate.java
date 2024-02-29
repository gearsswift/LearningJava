public class Postgraduate extends Student
{
   private String supervisor;
   private String thesisTitle;
   private String status;
   
   public Postgraduate(String name, String supervisor, String thesisTitle)
   {
       super(name);
       this.supervisor = supervisor;
       this.thesisTitle = thesisTitle;
       status = "full-time";
   }
   
   public void SetStatus(String status)
   {
       this.status =  status; 
   }
   
   public String toString()
   {
       calculateFees();
       String starter = super.toString();
       return String.format("%s, SuperVisor: %s, ThesisTitle: %s, Status: %s",starter,supervisor,thesisTitle,status);
   }
   
   public void calculateFees()
   {
       if(status.equals("part-time"))
           super.setFees(1325);
       else
           super.setFees(2650);
   }
}
