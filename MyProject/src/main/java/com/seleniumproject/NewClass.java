package com.seleniumproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class NewClass {
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Subrat\\Downloads\\Selenium Test Website\\Selenium Test Website\\WebPage.html");
		
		
		driver.findElement(By.xpath("//a[text()='New WebPage']")).click();
		driver.findElement(By.xpath("//a[text()=' Link to frame Web Page']")).click();
		Set <String> allWindow=driver.getWindowHandles();
		int count=allWindow.size();
		System.out.println(count);
		String parentWin=driver.getWindowHandle();
		/*ArrayList <String> tabs=new ArrayList<String>(allWindow);
		driver.switchTo().window(tabs.get(0));
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(2));
		String str="Text Testing";
		for(int i=0;i<=tabs.size()-1;i++)
		{
			if(str.equals(driver.getTitle()))
			{
				driver.findElement(By.xpath("//input[@list='suggestions']")).sendKeys("Hello");
			}
		}*/
		//driver.switchTo().window(parentWin);
		Iterator <String> itr=allWindow.iterator();
		
		for(int i=0;i<=allWindow.size()-1;i++)
		{
			System.out.println("CHilWindow ID= "+driver.getTitle());
			String actTitle1="Text Testing";
			//String str1=driver.getTitle();
			if(driver.getTitle().equals(actTitle1))
			{
				
				driver.findElement(By.name("txtUsername")).sendKeys("Hello");
				break;
				
			}
			else
			{
				driver.switchTo().window(itr.next());
			}
		}
		
		//driver.switchTo().window(parentWin);
	}
}
