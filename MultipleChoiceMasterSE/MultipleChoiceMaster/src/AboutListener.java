import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;

import java.lang.String.*;



public class AboutListener implements ActionListener
{
	JFrame parentFrame;
	
	public AboutListener (JFrame parentFrame)
	{
		this.parentFrame=parentFrame;
	}
	
	 public void actionPerformed (ActionEvent ae)
	 { 
		 
		 String separator = System.getProperty( "line.separator" );
		 String line1="Multiple Choice Master";
		 StringBuilder lines = new StringBuilder( line1 );
		 lines.append( separator );
		 String line2="Version: 0.01 Beta";
		 lines.append( line2 );
		 lines.append( separator );
		 String line3="Copyright (c) 2015-2016 Oliver Mühlnikel";
		 lines.append( line3 );
		 lines.append( separator );
		 
		 lines.append( separator );
		 String line4="Hiermit wird unentgeltlich, jeder Person, die eine Kopie der Software";
		 lines.append( line4 );
		 
		 lines.append( separator );
		 String line5="und der zugehörigen Dokumentationen (die \"Software\") erhält, die";
		 lines.append( line5 );
		 
		 lines.append( separator );
		 String line6="Erlaubnis erteilt, uneingeschränkt zu benutzen, inklusive und ohne";
		 lines.append( line6 );
		 
		 lines.append( separator );
		 String line7="Ausnahme, dem Recht, sie zu verwenden, kopieren, ändern, fusionieren,";
		 lines.append( line7 );
		 
		 
		 lines.append( separator );
		 String line8="verlegen, verbreiten, unter-lizenzieren und/oder zu verkaufen, und";
		 lines.append( line8 );
		 
		 lines.append( separator );
		 String line9="Personen, die diese Software erhalten, diese Rechte zu geben, unter";
		 lines.append( line9 );
		 
		 
		 lines.append( separator );
		 String line10="den folgenden Bedingungen:";
		 lines.append( line10 );
		 lines.append( separator );
		 
		 lines.append( separator );
		 String line11="Der obige Urheberrechtsvermerk und dieser Erlaubnisvermerk sind in";
		 lines.append( line11 );
		 
		 lines.append( separator );
		 String line12="alle Kopien oder Teilkopien der Software beizulegen.";
		 lines.append( line12 );
		 lines.append( separator );
		 
		 lines.append( separator );
		 String line13="DIE SOFTWARE WIRD OHNE JEDE AUSDRÜCKLICHE ODER IMPLIZIERTE GARANTIE";
		 lines.append( line13 );
		 
		 lines.append( separator );
		 String line14="BEREITGESTELLT, EINSCHLIESSLICH DER GARANTIE ZUR BENUTZUNG FÜR DEN";
		 lines.append( line14 );
		 
		 lines.append( separator );
		 String line15="VORGESEHENEN ODER EINEM BESTIMMTEN ZWECK SOWIE JEGLICHER";
		 lines.append( line15 );
		 
		 
		 lines.append( separator );
		 String line16="RECHTSVERLETZUNG, JEDOCH NICHT DARAUF BESCHRÄNKT. IN KEINEM FALL SIND";
		 lines.append( line16 );
		 
		 lines.append( separator );
		 String line17="DIE AUTOREN ODER COPYRIGHTINHABER FÜR JEGLICHEN SCHADEN ODER SONSTIGE";
		 lines.append( line17 );
		 
		 lines.append( separator );
		 String line18="ANSPRUCH HAFTBAR ZU MACHEN, OB INFOLGE DER ERFÜLLUNG VON EINEM";
		 lines.append( line18 );
		 
		 lines.append( separator );
		 String line19="VERTRAG, EINEM DELIKT ODER ANDERS IM ZUSAMMENHANG MIT DER BENUTZUNG";
		 lines.append( line19 );
		 
		 lines.append( separator );
		 String line20="ODER SONSTIGE VERWENDUNG DER SOFTWARE ENTSTANDEN.";
		 lines.append( line20 );
		 
		 lines.append( separator );
		 String message = lines.toString( );
		 
		 ImageIcon icon = new ImageIcon("images/dialog-information-3.png");
		
		 JOptionPane.showMessageDialog(parentFrame,
				 						message,
				 						"Über Multiple Choice Master",
				 						JOptionPane.INFORMATION_MESSAGE,
				 						icon);
		 

	 }
}
