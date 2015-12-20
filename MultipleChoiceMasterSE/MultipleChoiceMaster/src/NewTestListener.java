import java.awt.event.ActionEvent;


import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.IOException;

import control.TestControl;
import model.TestModel;
import model.TestModel.Language;


public class NewTestListener implements ActionListener
{
	private JFrame parentFrame;
	private JDialog dialog;
	private JLabel labelTestname;
	private JTextField textFieldTestname;
	private JLabel labelDuration;
	private JSpinner spinnerDuration;
	private JLabel labelLanguage;
	private JComboBox comboBoxLanguage;
	private JLabel labelAutor;
	private JTextField textFieldAuthor;
	private JLabel labelSource;
	private JTextField textFieldSource;
	private JLabel labelCopyright;
	private JRadioButton radioButtonCopyrightYes;
	private JRadioButton radioButtonCopyrightNo;
	private JLabel labelDescription;
	private JEditorPane editorPaneDescription;
	private JButton buttonSave;
	private JButton buttonDismiss;
	private JButton buttonCancel;
		
	public NewTestListener (JFrame parentFrame)
	{
		this.parentFrame=parentFrame;
	}
	
	private void buttonSaveClicked()
	{
		System.out.println("Save");
		TestModel testModel=new TestModel();
		testModel.setTestname(textFieldTestname.getText()); 
		testModel.setAuthor(textFieldAuthor.getText());
		testModel.setSource(textFieldSource.getText());
		testModel.setDescription(editorPaneDescription.getText());
		testModel.setDuration((Integer)spinnerDuration.getValue());
		
		String language=(String)comboBoxLanguage.getSelectedItem();
		
		testModel.setLanguage(Language.DE);
		
		if (language.equals("Englisch"))
		{
			testModel.setLanguage(Language.EN);
		}
		
		
		testModel.setCopyright(true);
		
		if (radioButtonCopyrightNo.isSelected())
		{
			testModel.setCopyright(false);
		}
		
		String filename="./data/"+testModel.getTestname()+".xml";
		
		try
		{
			TestControl testController=new TestControl();
			testController.store(testModel,filename);
		}
		catch (IOException e)
		{
			System.out.println("Konnte die Datei "+filename+
		             " nicht erstellen:\n"+e.getMessage());
		}
		
		
		
	};
		
	private void buttonDismissClicked()
	{
		System.out.println("Dismiss");
	};
	
	private void buttonCancelClicked()
	{
		System.out.println("Cancel");
	};
	
	 public void actionPerformed (ActionEvent ae)
	 {  
		dialog=new JDialog();
		dialog.setModal(true);
		dialog.setSize(600,500);
		dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setTitle("Neue Prüfung eingeben");
		dialog.setLayout(null);	
	
		labelTestname = new JLabel("Testname:");
		labelTestname.setHorizontalAlignment(SwingConstants.RIGHT);
		labelTestname.setBounds(18, 16, 120, 16);
		dialog.getContentPane().add(labelTestname);
	
		textFieldTestname = new JTextField();
		textFieldTestname.setBounds(150, 10, 300, 28);
		dialog.getContentPane().add(textFieldTestname);
		textFieldTestname.setColumns(10);
	
		labelDuration = new JLabel("Dauer in Minuten:");
		labelDuration.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDuration.setBounds(18, 56, 120, 16);
		dialog.getContentPane().add(labelDuration);
	
		spinnerDuration = new JSpinner();
		spinnerDuration.setBounds(150, 50, 72, 28);
		dialog.getContentPane().add(spinnerDuration);
	
		labelLanguage = new JLabel("Sprache:");
		labelLanguage.setHorizontalAlignment(SwingConstants.RIGHT);
		labelLanguage.setBounds(77, 94, 61, 16);
		dialog.getContentPane().add(labelLanguage);
	
		comboBoxLanguage = new JComboBox();
		comboBoxLanguage.setModel(new DefaultComboBoxModel(new String[] {"Deutsch", "Englisch", "Französisch"}));
		comboBoxLanguage.setBounds(148, 90, 131, 27);
		dialog.getContentPane().add(comboBoxLanguage);
	
		labelAutor = new JLabel("Autor:");
		labelAutor.setHorizontalAlignment(SwingConstants.RIGHT);
		labelAutor.setBounds(77, 136, 61, 16);
		dialog.getContentPane().add(labelAutor);
	
		textFieldAuthor = new JTextField();
		textFieldAuthor.setBounds(150, 130, 300, 28);
		dialog.getContentPane().add(textFieldAuthor);
		textFieldAuthor.setColumns(10);
	
		labelSource = new JLabel("Quelle:");
		labelSource.setHorizontalAlignment(SwingConstants.RIGHT);
		labelSource.setBounds(77, 176, 61, 16);
		dialog.getContentPane().add(labelSource);
	
		textFieldSource = new JTextField();
		textFieldSource.setBounds(150, 170, 300, 28);
		dialog.getContentPane().add(textFieldSource);
		textFieldSource.setColumns(10);
	
		labelCopyright = new JLabel("Urheberschutz:");
		labelCopyright.setHorizontalAlignment(SwingConstants.RIGHT);
		labelCopyright.setBounds(18, 214, 120, 16);
		dialog.getContentPane().add(labelCopyright);
	
		radioButtonCopyrightYes = new JRadioButton("Ja");
		radioButtonCopyrightYes.setSelected(true);
		radioButtonCopyrightYes.setBounds(150, 210, 53, 23);
		dialog.getContentPane().add(radioButtonCopyrightYes);
	
		radioButtonCopyrightNo = new JRadioButton("Nein");
		radioButtonCopyrightNo.setBounds(203, 210, 141, 23);
		dialog.getContentPane().add(radioButtonCopyrightNo);
	
		labelDescription = new JLabel("Beschreibung:");
		labelDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		labelDescription.setBounds(18, 250, 120, 16);
		dialog.getContentPane().add(labelDescription);
	
		editorPaneDescription = new JEditorPane();
		editorPaneDescription.setBounds(150, 250, 367, 150);
		dialog.getContentPane().add(editorPaneDescription);
	
		buttonSave = new JButton("Speichern");
		buttonSave.setBounds(150, 420, 117, 29);
		buttonSave.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				 buttonSaveClicked();
			}
		});
		dialog.getContentPane().add(buttonSave);
		
		
			
		
		JButton buttonDismiss = new JButton("Verwerfen");
		buttonDismiss.setBounds(279, 420, 117, 29);
		buttonDismiss.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				 buttonDismissClicked();
			}
		});
		dialog.getContentPane().add(buttonDismiss);
	
		buttonCancel = new JButton("Abbrechen");
		buttonCancel.setBounds(408, 420, 117, 29);
		buttonCancel.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				 buttonCancelClicked();
			}
		});
		dialog.getContentPane().add(buttonCancel);
		
		dialog.setVisible(true);

	 }
}
