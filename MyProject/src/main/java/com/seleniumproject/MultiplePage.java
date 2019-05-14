package com.seleniumproject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Subrat\\Downloads\\Selenium Test Website\\Selenium Test Website\\WebPage.html");
		driver.findElement(By.xpath("//a[text()='New WebPage']")).click();
		//driver.findElement(By.xpath("//a[text()=' Link to frame Web Page']")).click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent window ID is= "+parent);
		Set <String> allWindow=driver.getWindowHandles();
		Iterator <String> itr=allWindow.iterator();
		String parentWin=itr.next();
		String childWin=itr.next();
		System.out.println("Child WIndow ID is= "+childWin);
		
		driver.switchTo().window(childWin);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Hello");
		driver.switchTo().window(parent);
		
		//driver.findElement(By.xpath("//a[text()=' Link to frame Web Page']")).click();
		

	}

}
