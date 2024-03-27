import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterButtonListener implements ActionListener
{
  StudentWindow window;
  
  public RegisterButtonListener(StudentWindow window)
  {
    this.window = window;
  }
    
    
   public void actionPerformed(ActionEvent e) {
       String info = String.format("Name %s %s \n Programme: %s\n Status: %s",
       window.getFirstName(), window.getLastName(), window.getProgramme(), window.getStatus());
       window.setOutputText(info); 
  }
}
