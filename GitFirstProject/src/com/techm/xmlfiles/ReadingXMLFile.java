package com.techm.xmlfiles;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXMLFile {
	
  @Test
  public void f() throws ParserConfigurationException, SAXException, IOException {
	  
	  DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	  DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
	  
	  Document document = documentBuilder.parse(new File("C:\\Selenium\\gitproject\\GitFirstProject\\xmlDataFile.xml"));
	  
	  //System.out.println(document.getParentNode().getNodeName());
	  Element element = document.getDocumentElement();
	  
	  NodeList nodeList = element.getElementsByTagName("Student");
	  
	  System.out.println("The node name is: "+nodeList.item(0).getNodeName());
	  
	  for(int i=0;i<nodeList.getLength();i++){
		  
		 // System.out.println(nodeList.item(i).getn);
	  }
  }
   
}