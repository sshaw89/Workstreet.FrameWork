package com.seleniumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	@Test
	public void linktest() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/");
		WebElement wb=driver.findElement(By.xpath("//div[@class='wf-container']"));
		System.out.println(wb.findElements(By.tagName("a")).size());
		
		for (int i = 0; i<wb.findElements(By.tagName("a")).size() ; i++) {
			String key=Keys.chord(Keys.CONTROL,Keys.ENTER);
			wb.findElements(By.tagName("a")).get(i).sendKeys(key);
			
		}
	}
	
}
