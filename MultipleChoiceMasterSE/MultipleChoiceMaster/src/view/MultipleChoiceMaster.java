package view;
// Import-Anweisungen
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
 
public class MultipleChoiceMaster  {
	// main-Methode
    public static void main(String[] args)
    {
	// Create new frame
    JFrame myFrame = new JFrame();
    myFrame.setTitle("Multiple Choice Master");
    myFrame.setSize(1024,800);
    Border bo = new LineBorder(Color.black);
    JMenuBar bar = new JMenuBar();
    bar.setBorder(bo);
    
    // Create menu
    JMenu menuMultipleChoiceMaster = new JMenu("Multiple Choice Master");
    JMenuItem itemAbout = new JMenuItem("Über Multiple Choice Master");
    itemAbout.addActionListener(new AboutListener(myFrame));
    menuMultipleChoiceMaster.add(itemAbout);
    JSeparator sep1 = new JSeparator();        
    menuMultipleChoiceMaster.add(sep1);
    JMenuItem itemConfig = new JMenuItem("Einstellungen");
    menuMultipleChoiceMaster.add(itemConfig);
    JSeparator sep2 = new JSeparator();        
    menuMultipleChoiceMaster.add(sep2);  
    JMenuItem itemExit = new JMenuItem("Beenden");
    itemExit.addActionListener(new ExitListener());
    menuMultipleChoiceMaster.add(itemExit);   
    bar.add(menuMultipleChoiceMaster);
    
    // Create file menu
    JMenu menuFile = new JMenu("Datei");
    JMenu itemNew=new JMenu("Neu");
    JMenuItem itemNewTask=new JMenuItem("Aufgabe");
    itemNewTask.addActionListener(new NewTaskListener(myFrame));
    itemNew.add(itemNewTask);
    JMenuItem itemNewTest=new JMenuItem("Prüfung");
    itemNewTest.addActionListener(new NewTestListener(myFrame));
    itemNew.add(itemNewTest);
    menuFile.add(itemNew);
    JMenuItem itemFile=new JMenuItem("Datei öffnen...");
    menuFile.add(itemFile);
    JSeparator sep3 = new JSeparator();        
    menuFile.add(sep3);
    JMenuItem itemClose=new JMenuItem("Schließen");
    menuFile.add(itemClose);
    JMenuItem itemSave=new JMenuItem("Speichern");
    menuFile.add(itemSave);
    JSeparator sep4 = new JSeparator();        
    menuFile.add(sep4);
    JMenuItem itemExport=new JMenuItem("Export");
    menuFile.add(itemExport);
    JSeparator sep5 = new JSeparator();        
    menuFile.add(sep5);
    JMenuItem itemPrint=new JMenuItem("Drucken...");
    menuFile.add(itemPrint);
    bar.add(menuFile);
    
    // Create test menu
    JMenu menuTest = new JMenu("Prüfung");
    JMenuItem itemTestNewTest = new JMenuItem("Neu");
    itemTestNewTest.addActionListener(new NewTestListener(myFrame));
    menuTest.add(itemTestNewTest);
    JSeparator sep6 = new JSeparator();        
    menuTest.add(sep6);
    JMenuItem itemTestEditTest = new JMenuItem("Bearbeiten");
    menuTest.add(itemTestEditTest);
    JSeparator sep7 = new JSeparator();        
    menuTest.add(sep7);
    JMenuItem itemTestSearchTest = new JMenuItem("Suchen");
    menuTest.add(itemTestSearchTest);
    JSeparator sep8 = new JSeparator();        
    menuTest.add(sep8);
    JMenuItem itemTestRunTest = new JMenuItem("Start");
    menuTest.add(itemTestRunTest);
    bar.add(menuTest);
    
    // Create task menu
    JMenu menuTask = new JMenu("Aufgabe");
    JMenuItem itemTaskNewTask = new JMenuItem("Neu");
    itemTaskNewTask.addActionListener(new NewTaskListener(myFrame));
    menuTask.add(itemTaskNewTask);
    JSeparator sep9 = new JSeparator();        
    menuTask.add(sep9);
    JMenuItem itemTaskEditTask = new JMenuItem("Bearbeiten");
    menuTask.add(itemTaskEditTask);
    JSeparator sep10 = new JSeparator();        
    menuTask.add(sep10);
    JMenuItem itemTaskSearchTask = new JMenuItem("Suchen");
    menuTask.add(itemTaskSearchTask);
    JSeparator sep11 = new JSeparator();        
    menuTask.add(sep11);
    JMenuItem itemTaskRunTask = new JMenuItem("Start");
    menuTask.add(itemTaskRunTask);
    bar.add(menuTask);
    
    // Create start menu
    JMenu menuStart = new JMenu("Start");
    JMenuItem itemStartTest = new JMenuItem("Start Prüfung");
    menuStart.add(itemStartTest);
    bar.add(menuStart);
    
    // Create window menu
    JMenu menuWindow = new JMenu("Fenster");
    JMenuItem itemWindowClose = new JMenuItem("Fenster schließen");
    menuWindow.add(itemWindowClose);
    bar.add(menuWindow);
    
    // Create help menu
    JMenu menuHelp = new JMenu("Hilfe");
    JMenuItem itemHelp = new JMenuItem("MultipleChoiceMaster Hilfe");
    menuHelp.add(itemHelp);
    JSeparator sep12 = new JSeparator();        
    menuHelp.add(sep12);
    JMenuItem itemSupport = new JMenuItem("Support");
    itemSupport.addActionListener(new SupportListener(myFrame));
    menuHelp.add(itemSupport);
    JSeparator sep13 = new JSeparator();        
    menuHelp.add(sep13);
    JMenuItem itemUpdate = new JMenuItem("Update");
    itemUpdate.addActionListener(new UpdateListener(myFrame));
    menuHelp.add(itemUpdate);
    bar.add(menuHelp);
    
   
    // Set menu bar for frame an make it visible
    myFrame.setJMenuBar(bar);
    myFrame.setVisible(true);
    }
}
