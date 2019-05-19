package com.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//go to date where we can get single dropdown 
		WebElement wb= driver.findElement(By.id("day"));
		//create the object of select class
		Select s1 = new Select(wb);
		s1.selectByValue("0");
		List <WebElement> lst = s1.getOptions();
		for(WebElement i : lst) {
			System.out.println(i.getText());
		}
		
		driver.close();
		
		
		

	}

}
