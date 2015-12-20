import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NewTaskListener implements ActionListener
{
	JFrame parentFrame;
	
	public NewTaskListener (JFrame parentFrame)
	{
		this.parentFrame=parentFrame;
	}
	
	 public void actionPerformed (ActionEvent ae)
	 {  
			JDialog dialog=new JDialog();
			dialog.setModal(true);
			dialog.setSize(640,700);
			dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			dialog.setTitle("Neue Aufgabe eingeben");
			dialog.setLayout(null);	
			
			JEditorPane editorPaneQuestion = new JEditorPane();
			editorPaneQuestion.setBounds(150, 10, 450, 100);
			dialog.getContentPane().add(editorPaneQuestion);
			
			JLabel labelQuestion = new JLabel("Frage:");
			labelQuestion.setHorizontalAlignment(SwingConstants.RIGHT);
			labelQuestion.setBounds(75, 10, 61, 16);
		    dialog.getContentPane().add(labelQuestion);
			
			JLabel labelAnswerA = new JLabel("Antwort A:");
			labelAnswerA.setHorizontalAlignment(SwingConstants.RIGHT);
			labelAnswerA.setBounds(59, 120, 77, 16);
			dialog.getContentPane().add(labelAnswerA);
			
			JEditorPane editorPaneAnswerA = new JEditorPane();
			editorPaneAnswerA.setBounds(148, 120, 450, 100);
			dialog.getContentPane().add(editorPaneAnswerA);
			
			JLabel labelAnswerB = new JLabel("Antwort B:");
			labelAnswerB.setHorizontalAlignment(SwingConstants.RIGHT);
			labelAnswerB.setBounds(59, 230, 77, 16);
			dialog.getContentPane().add(labelAnswerB);
			
			JEditorPane editorPaneAnswerB = new JEditorPane();
			editorPaneAnswerB.setBounds(148, 230, 450, 100);
			dialog.getContentPane().add(editorPaneAnswerB);
			
			JEditorPane editorPaneAnswerC = new JEditorPane();
			editorPaneAnswerC.setBounds(148, 340, 450, 100);
			dialog.getContentPane().add(editorPaneAnswerC);
			
			JEditorPane editorPaneAnswerD = new JEditorPane();
			editorPaneAnswerD.setBounds(148, 450, 450, 100);
			dialog.getContentPane().add(editorPaneAnswerD);
			
			JLabel labelAnswerC = new JLabel("Antwort C:");
			labelAnswerC.setHorizontalAlignment(SwingConstants.RIGHT);
			labelAnswerC.setBounds(59, 340, 77, 16);
			dialog.getContentPane().add(labelAnswerC);
			
			JLabel labelAnswerD = new JLabel("Antwort D:");
			labelAnswerD.setHorizontalAlignment(SwingConstants.RIGHT);
			labelAnswerD.setBounds(59, 450, 77, 16);
			dialog.getContentPane().add(labelAnswerD);
			
			JButton btnAbbrechen = new JButton("Abbrechen");
			btnAbbrechen.setBounds(483, 620, 117, 29);
			dialog.getContentPane().add(btnAbbrechen);
			
			JButton buttonDismiss = new JButton("Verwerfen");
			buttonDismiss.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { } 
				});
			buttonDismiss.setBounds(354, 620, 117, 29);
			dialog.getContentPane().add(buttonDismiss);
			
			JButton buttonSave = new JButton("Speichern");
			
			buttonSave.setBounds(225, 620, 117, 29);
			dialog.getContentPane().add(buttonSave);
			
			JLabel labelCorrectAnswer = new JLabel("Richtige Antwort:");
			labelCorrectAnswer.setBounds(32, 567, 124, 16);
			dialog.getContentPane().add(labelCorrectAnswer);

			
			String comboBoxCorrectAnswerList[] = {"Antwort A", "Antwort B", "Antwort C", "Antwort D"};
			DefaultComboBoxModel<String> comboBoxCorrectAnswerModel=new DefaultComboBoxModel<String>(comboBoxCorrectAnswerList);
			
			JComboBox<String> comboBoxCorrectAnswer = new JComboBox<String>();
			comboBoxCorrectAnswer.setModel(comboBoxCorrectAnswerModel);
			comboBoxCorrectAnswer.setBounds(148, 560, 200, 30);
			dialog.getContentPane().add(comboBoxCorrectAnswer);
			
	
			dialog.setVisible(true);
		 
		 
	 }
}
