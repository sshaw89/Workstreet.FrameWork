package com.selenium.test;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivingFromProperties {

	public static void main(String[] args) throws Throwable {
		FileReader fobj = new FileReader("./data/commonData.properties");
		Properties pobj = new Properties();
		pobj.load(fobj);
		
		String URL = pobj.getProperty("url");
//		String USERNAME = pobj.getProperty("username");
//		String PASSWORD = pobj.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		driver.close();
		

	}

}
