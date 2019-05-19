package com.selenium.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
	@Test
	public void amazonTest()throws Throwable{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		//create object of efiringwebdriver class
		EventFiringWebDriver efd = new EventFiringWebDriver(driver);
		File src = efd.getScreenshotAs(OutputType.FILE);
		//create new file 
		File dst = new File("./screenshot/test.png");
		//copy the existing file to new file
		FileUtils.copyFile(src, dst);
	}
	
	

}
