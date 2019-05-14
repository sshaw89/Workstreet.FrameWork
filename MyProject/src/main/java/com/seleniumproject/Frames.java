package com.seleniumproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void frameTest() {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/?p=us");
		List<WebElement> webelements=driver.findElements(By.tagName("iframe"));
		int countframes=webelements.size();
		System.out.println(countframes);
		
	}

}
