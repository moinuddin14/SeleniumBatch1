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
	  
	  @SuppressWarnings("unchecked")
	  ArrayList<String> parentAttributes = (ArrayList<String>)((JavascriptExecutor)driver).executeScript("var s=[];var attr=arguments[0].attributes;for(i=0;i<attr.length;i++){var a = attr[i];s.push(a.name+'='+a.value);}return s;", element);
	  System.out.println(parentAttributes);
	  System.out.println("The number of elements persent in the array list are: "+parentAttributes.size());
	  
	  //Below was a mistake, when i tried to run the for each inside the try-catch block, but should have run other way.
	 /* try{
	  for(String str:parentAttributes){
		  if(!str.toString().split("=")[1].isEmpty()){
		  if(str.toString().split("=")[1].equalsIgnoreCase(null)){
			  continue;
		  }
		  else{
		  String s1 = str.toString();
		  String[] s2 = s1.split("=");
		  System.out.println("The name of the attribute is: "+s2[0]+" and the value is: "+s2[1]);
		  //}
	  }else{
		  continue;
	  }
	  }
	  }catch(Exception e){}*/
	  
	  passElementToGetAllAttributes(parentAttributes);
	  
  }
  
  public void passElementToGetAllAttributes(ArrayList<String> allAttributes){
	  
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
}