package com.selenium.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
/**
 * @author avinesh 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmailLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		
		//click on sign in
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		//enter email id && click on next button
		driver.findElement(By.id("identifierId")).sendKeys("avineshjain1992");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);    // becoz we are giving smart wait in main method.
		//enter passward and click next
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("avinesh@123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//Thread.sleep(3000);
		//now logging out from gmail
		driver.findElement(By.xpath("//span[@class='gb_bb gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		//close the browser
		driver.close();
		
	}

}
