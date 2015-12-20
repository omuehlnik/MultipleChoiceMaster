package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExitListener extends JFrame implements ActionListener
{
	 public void actionPerformed (ActionEvent ae)
	 {
		 System.exit(0);
	 }
}
