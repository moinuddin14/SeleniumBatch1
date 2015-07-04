package com.techm.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GoAirCalendar {
	
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.goair.in/");
	  
	  driver.findElement(By.partialLinkText("Book Flights")).click();
	  //driver.findElement(By.name("Return")).click();
	  Thread.sleep(5000);
	  
	  //Selecting From flight
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/select")).click();
	  Thread.sleep(5000);
	  Select select = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/select")));
	  select.selectByVisibleText("Mumbai (Terminal 1A)");
	  
	  Thread.sleep(5000);
	  //Selecting To Flight
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/select")).click();
	  Thread.sleep(5000);
	  select = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]/select")));
	  select.selectByVisibleText("Bengaluru");
	  
	  Thread.sleep(5000);
	  //Clicking and selecting appropriate values from the Calendar widget 
	  driver.findElement(By.xpath("//div[@class='form-controls clearfix']/div[@class='date']/img")).click();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/select[1]")).click();
	  Thread.sleep(5000);
	  
	  select = new Select(driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/select[1]")));
	  select.selectByVisibleText("Aug");
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/select[1]")).sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/select[2]")).click();
	  Thread.sleep(5000);
	  select = new Select(driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/select[2]")));
	  select.selectByVisibleText("2015");
	  driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/select[2]")).sendKeys(Keys.ENTER);
	  
	  WebElement calendarWiget = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
	  calendarWiget.findElement(By.partialLinkText("22")).click();
	  Thread.sleep(5000);
  }
  
}