import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;



public class UpdateListener implements ActionListener
{
	JFrame parentFrame;
	
	public UpdateListener (JFrame parentFrame)
	{
		this.parentFrame=parentFrame;
	}
	
	 public void actionPerformed (ActionEvent ae)
	 { 
		 
		 String separator = System.getProperty( "line.separator" );
		 String line1="Für aktuelle Updates zu  Multiple Choice Master Support";
		 StringBuilder lines = new StringBuilder( line1 );
		 lines.append( separator );
		 String line2="schauen Sie bitte bei GitHub unter folgender URL:";
		 lines.append( line2 );
		 lines.append( separator );
		 String line3="https://github.com/omuehlnik/MultipleChoiceMaster";
		 lines.append( line3 );
		 lines.append( separator );
		 String message = lines.toString( );
		 
		 ImageIcon icon = new ImageIcon("images/system-software-update.png");
		
		 JOptionPane.showMessageDialog(parentFrame,
				 						message,
				 						"Updates zu Multiple Choice Master",
				 						JOptionPane.INFORMATION_MESSAGE,
				 						icon);
		 

	 }
}
