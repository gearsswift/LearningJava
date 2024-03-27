import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {
    
    private StudentWindow window;
    
    public ClearButtonListener(StudentWindow window)
    {
        this.window = window;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        window.clearData();
    }
}

