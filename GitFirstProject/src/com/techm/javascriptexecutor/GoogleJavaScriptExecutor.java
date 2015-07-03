/**
 * @author Khaja Moinuddin Mohammed
 * @Date 12:51:50 PM
 * @FileName GoogleJavaScriptExecutor.java
 * @PackageName com.techm.javascriptexecutor
 * @ProjectName GitFirstProject
 *
 **/

package com.techm.javascriptexecutor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleJavaScriptExecutor {
	
  @Test
  public void getAllAttributes() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://google.com");
	  
	  WebElement element = driver.findElement(By.id("lst-ib"));
	  
	  Thread.sleep(5000);
	  
	  passWebElementToGetAllAttributes(element, driver);
	  
  }
  
  public void passWebElementToGetAllAttributes(WebElement element, WebDriver driver){
	  
	  @SuppressWarnings("unchecked")
	  ArrayList<String> allAttributes = (ArrayList<String>)((JavascriptExecutor)driver).executeScript("var s=[];var attr=arguments[0].attributes;for(i=0;i<attr.length;i++){var a = attr[i];s.push(a.name+'='+a.value);}return s;", element);
	  System.out.println(allAttributes);
	  System.out.println("The number of elements persent in the array list are: "+allAttributes.size());
	  
	  for(int j=0;j<allAttributes.size();j++){
		  try{
		  String s1 = allAttributes.get(j).toString();
		  String[] s2 = s1.split("=");
		  System.out.print("The name of the attribute is: "+s2[0]+"\t\t\t");
		  System.out.println("The value is: "+s2[1]);
		  System.out.println("*********************************************************************************************");
		  }catch(ArrayIndexOutOfBoundsException a){
			  System.out.println("Error Occuring at The name of the attribute is: "+a.getMessage());
			  continue;
		  }
	  }
  }
  
  public String passWebElementAttributeReturnAttribute(WebElement element, WebDriver driver, String attribute){
	  
	  
	  
	  return null;
  }
}