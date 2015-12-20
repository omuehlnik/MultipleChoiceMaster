import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;



public class SupportListener implements ActionListener
{
	JFrame parentFrame;
	
	public SupportListener (JFrame parentFrame)
	{
		this.parentFrame=parentFrame;
	}
	
	 public void actionPerformed (ActionEvent ae)
	 { 
		 
		 String separator = System.getProperty( "line.separator" );
		 String line1="Für erweiternten Multiple Choice Master Support";
		 StringBuilder lines = new StringBuilder( line1 );
		 lines.append( separator );
		 String line2="wenden Sie sich bitte an";
		 lines.append( line2 );
		 lines.append( separator );
		 String line3="oliver.muehlnikel@gmx.de";
		 lines.append( line3 );
		 lines.append( separator );
		 String message = lines.toString( );
		 
		 ImageIcon icon = new ImageIcon("images/help-2.png");
		
		 JOptionPane.showMessageDialog(parentFrame,
				 						message,
				 						"Über Multiple Choice Master",
				 						JOptionPane.INFORMATION_MESSAGE,
				 						icon);
		 

	 }
}
