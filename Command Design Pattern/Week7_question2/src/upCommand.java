import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class upCommand implements Command {
	   JFrame frame;

	   public upCommand(JFrame fr) {
	      frame = fr;
	   }
	  public void Execute () {
		  JOptionPane.showMessageDialog(frame,
  			    "Update menu selected’."); 
		  }
		}
