package com.techm.xmlfiles;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXMLFile {
	
  @Test
  public void f() throws ParserConfigurationException, SAXException, IOException {
	  
	  DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	  DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
	  
	  Document document = documentBuilder.parse(new File("C:\\Selenium\\gitproject\\GitFirstProject\\xmlDataFile.xml"));
	  
	  //Normalizing the Dom
	  document.getDocumentElement().normalize();
	  
	  System.out.println("Root Element is: "+document.getDocumentElement().getNodeName());
	  
	  NodeList nList = document.getElementsByTagName("Student");
	  
	  System.out.println("---------------------------");
	  
	  for(int i=0;i<nList.getLength();i++){
		  
		  Node nNode = nList.item(i);
		  System.out.println("\nCurrent Element: "+nNode.getNodeName());
		  
		  if(nNode.getNodeType()==Node.ELEMENT_NODE){
			  
		  }
	  }
  }
   
}