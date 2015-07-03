package com.techm.javascriptexecutor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleJavaScriptExecutor {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://google.com");
	  
	  WebElement element = driver.findElement(By.id("lst-ib"));
	  driver.findElement(By.id("lst-ib")).sendKeys("hello");
	  
	  Thread.sleep(5000);
	  
	  @SuppressWarnings("unchecked")
	ArrayList<String> parentAttributes = (ArrayList<String>)((JavascriptExecutor)driver).executeScript("var s=[];var attr=arguments[0].attributes;for(i=0;i<attr.length;i++){var a = attr[i];s.push(a.name+'='+a.value);}return s;", element);
	  System.out.println(parentAttributes);
	
	  try{
	  for(String str:parentAttributes){
		  
		  if(str.equalsIgnoreCase("")){
			  
		  }
		  else{
		  String s1 = str.toString();
		  String[] s2 = s1.split("=");
		  System.out.println("The name of the attribute is: "+s2[0]+" and the value is: "+s2[1]);
		  }
	  }
	  }catch(Exception e){
		  for(String str:parentAttributes){
			  
			  if(str.equalsIgnoreCase("")){
				  
			  }
			  else{
			  String s1 = str.toString();
			  String[] s2 = s1.split("=");
			  System.out.println("The name of the attribute is: "+s2[0]+" and the value is: "+s2[1]);
			  }
		  }
		  }
		  
	  }
	  
	  
  }
  
  

