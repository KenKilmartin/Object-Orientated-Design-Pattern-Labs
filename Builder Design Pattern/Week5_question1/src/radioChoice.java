
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class radioChoice extends multiChoice {


	int count;          
	JPanel p;            
	//--------------------------------------------
	public radioChoice(Vector choices) {
		super(choices);
		count = 0;
		p = new JPanel();
	}
	//--------------------------------------------
	public JPanel getUI() {
		String s;

		
		p.setLayout(new GridLayout(choices.size(), 1));  
		
		for (int i=0; i< choices.size(); i++) {
			s =(String)choices.elementAt(i);
			p.add(new JRadioButton(s));
			count++;
		}
		
		System.out.print("here");
		return p;
	}
	//--------------------------------------------
	public String[] getSelected() {
		JRadioButton cb;
		Vector clist = new Vector();
		
		for (int i = 0; i < count; i++ ) {
			cb = (JRadioButton)p.getComponent(i);
			if (cb.isSelected ())
				clist.addElement(cb.getText());
		}
		
		String[] slist = new String[clist.size()];

		
		for (int i = 0; i < clist.size(); i++)
			slist[i] = (String)(clist.elementAt(i));
		return(slist);
	}
	//--------------------------------------------
	public void clearAll() {
		//uncheck all boxes
		for (int i=0; i < count; i++) {
			((Checkbox)(p.getComponent(i))).setState(false);



		}
	}
}



