package com.webapplication.tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MyntraCartTest {
	  public static void main(String[] args) {
		  String expected = "L";
		  //setting the browser driver
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  //maximize the browser
		  driver.manage().window().maximize();
		  //wait for page to load
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.myntra.com/");
		  //to handle dropdown 
		  //to do some keyboard actions
		  Actions ac = new Actions(driver);
		  driver.findElement(By.xpath("//input[@placeholder = 'Search']")).sendKeys("levis jackets man");;
		  ac.sendKeys(Keys.ENTER).perform();
		  driver.findElement(By.xpath("//img[@class='img-responsive']")).click();
		  //to handle new tab store the session id
		  Set <String> set = driver.getWindowHandles();
		  Iterator<String> it = set.iterator();
		  String parantWin = it.next();
		  String childWin = it.next();
		  //pass driver control to new tab
		  driver.switchTo().window(childWin);	
		  String act =driver.findElement(By.xpath("//div[@class='size-buttons-size-buttons']/div[3]/div")).getText();
          System.out.println(act);
          if(act.equals(expected)) {
        	  System.out.println("pass");
          }else {
        	  System.out.println("fail");
          }
          //close child window
          driver.close();
          driver.switchTo().window(parantWin);
          driver.close();
		
	  }
	
	   

}
