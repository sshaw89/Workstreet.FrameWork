package com.seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		driver.findElement(By.xpath("//p[@class=' todayPrice']/parent::div/p[text()='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='RETURN']")).click();
		driver.findElement(By.xpath("//p[@class='priceLow todayPrice']/parent::div/p[text()='29']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		


	}

}
