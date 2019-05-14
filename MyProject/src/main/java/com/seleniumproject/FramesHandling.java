package com.seleniumproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesHandling {
	@Test
	public void dropdpwninsideframe() {
		
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		List<WebElement> frames= driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for (int i = 0; i <=frames.size(); i++) {
			System.out.println(frames.get(i).getAttribute("id"));
		}

		
	}

}
