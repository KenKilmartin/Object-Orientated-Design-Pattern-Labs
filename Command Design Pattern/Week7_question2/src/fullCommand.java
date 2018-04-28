import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//In this version, we fully decouple the Commands from
//the men and Button subclasses.
// the Command objects are external classes
//and we pass them copies of the Frame instance
//in their constructor
public class fullCommand extends JxFrame
implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenu mnuFile;
	cmdMenu  mnuOpen, mnuExit,mnuUpdate;
	
	cmdButton btnGreen;
	JPanel p, jp;
	JxFrame fr;	
	upCommand up;
	fileCommand flc;
	ExitCommand extc;
	GreenCommand greenc;
	//-----------------------------------------
	public fullCommand()
	{
		super("Frame with external commands");
		fr = this;     //save frame object
		JPanel jp = new JPanel();
		getContentPane().add(jp);
		JMenuBar mbar = new JMenuBar();
		setJMenuBar(mbar);

		mnuFile = new JMenu("File", true);
		mbar.add(mnuFile);

		mnuOpen = new cmdMenu("Open...", this);
		mnuFile.add(mnuOpen);
		
		// This is the one that needed editing once this is fixed it will work I also added upCommand

		mnuUpdate = new cmdMenu("Update", this);
		mnuUpdate.setCommand(new upCommand(this));		
		mnuFile.add(mnuUpdate);
		
		
		

		mnuOpen.setCommand (new fileCommand(this));
		mnuExit = new cmdMenu("Exit", this);
		mnuExit.setCommand (new ExitCommand());

		mnuFile.add(mnuExit);



		mnuOpen.addActionListener(this);
		mnuExit.addActionListener(this);
		mnuUpdate.addActionListener(this);
		
		btnGreen = new cmdButton("Green", this);
		greenc = new GreenCommand(this, jp);
		btnGreen.setCommand (greenc);

		jp.add(btnGreen);

		btnGreen.addActionListener(this);
		setBounds(100,100,200,100);
		setVisible(true);
	}
	//-----------------------------------------
	public void actionPerformed(ActionEvent e)   {
		CommandHolder obj = (CommandHolder)e.getSource();
		obj.getCommand().Execute();
	}
	//-----------------------------------------
	static public void main(String argv[])
	{
		new fullCommand();
	}
}


