package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	static {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium jars/selenium translators/chromedriver_win32/chromedriver.exe");
	}

	public static void main(String[] args) {
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.youtube.com/");

	}

}
