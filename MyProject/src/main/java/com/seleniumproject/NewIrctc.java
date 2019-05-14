package com.seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewIrctc {
	@Test
	public void newIrctc() {
		System.setProperty("webdriver.gecko.driver", "./resource/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
	    driver.findElement(By.xpath("//span[text()='ui-btn']")).click(); 
	    boolean found =false;
	    
	    while(!found)
	    {
	      String Mnth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c14-6 ng-star-inserted']")).getText();
	      System.out.println(Mnth);
	      if(Mnth.equalsIgnoreCase("July"))
	    {
	    	found=true;
	    }
	    else
	    {
	    	driver.findElement(By.xpath("//span[@class='fa fa-angle-right']")).click();
	    }
	    
	    driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c14-6 ng-star-inserted']")).click();
	}
		
		
	}
	

}
