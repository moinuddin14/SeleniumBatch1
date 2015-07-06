package com.techm.javascriptexecutor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorExampleProgram {
	
private WebDriver driver = null;
	
  @Test
  public void samplejavaScriptExecutorMethod() {
	  
	  driver = new FirefoxDriver();
	  driver.get("http://google.com");
	  
	  WebElement element = driver.findElement(By.id("lst-ib"));
	  getAllAttributed(element, driver);
  }
  
  
  public void getAllAttributed(WebElement element, WebDriver driver){
	  
	  
	  @SuppressWarnings("unchecked")
	ArrayList<String> allAttributes = (ArrayList<String>)((JavascriptExecutor)driver).executeScript("var s=[]; var attr=arguments[0].attributes; for(i=0; i<attr.length;i++){var a = attr[i];s.push(a.name+':'+a.value);} return s;", element);
	  System.out.println(allAttributes);
	  
	  for(int j=0;j<allAttributes.size();j++){
		  try{
		  
		  String s1 = allAttributes.get(j).toString();
		  String[] s2 = s1.split(":");
		  System.out.println("The name is:"+s2[0]+" and the value is: "+s2[1]);
		  System.out.println("********************");
		  }catch(ArrayIndexOutOfBoundsException a){
			  System.out.println("Error Occuring Here...."+a.getMessage());
			  continue;
		  }
		  
	  }
  }
  
}
