package com.myntra.genriclib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void configBC() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
	}
	@BeforeMethod
	public void configBM() {
		driver.get("https://www.myntra.com/");
	}
	@AfterClass
	public void configAC() {
		driver.quit();
	}

}
