
package control;

import model.TestModel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;



public class TestControl {

		public void store(TestModel test,String filename) throws IOException
		{
			test.dump();
			Document document = new Document();
			Element testElement=new Element("Test", Namespace.getNamespace("http://www.multiplechoicemaster.com/test"));
			document.setRootElement(testElement);
			testElement.addContent(new Element("Testname").setText(test.getTestname()));
			testElement.addContent(new Element("Author").setText(test.getAuthor()));		
			testElement.addContent(new Element("Source").setText(test.getSource()));		
			testElement.addContent(new Element("Copyright").setText(test.getCopyright().toString()));
			testElement.addContent(new Element("Duration").setText(new Integer(test.getDuration()).toString()));
			testElement.addContent(new Element("Language").setText(test.getLanguage().toString()));
			testElement.addContent(new Element("Description").setText(test.getDescription()));
			
			XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
	     
	        xmlOutputter.output(document, new FileOutputStream(filename));
	   
	        
		};

}
