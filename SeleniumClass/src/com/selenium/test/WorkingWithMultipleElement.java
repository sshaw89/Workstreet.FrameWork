package com.selenium.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithMultipleElement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/");
		List<WebElement> lst = driver.findElements(By.xpath("//a"));
		System.out.println(lst.size());
		
		for(int i=0;i<lst.size();i++) {
			Thread.sleep(5000);
			lst.get(i).click();
			driver.navigate().back();
		}                                                                    
		driver.quit();
		//try to give the elements with are intractable like there may be some likes that are broken.

	}

}
