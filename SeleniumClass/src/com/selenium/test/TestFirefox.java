package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestFirefox {

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setLegacy(true);
	}
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.quit();
	}

}
