package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataCaptureMethod {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/i ntl/en-GB/gmail/about/");
		String pagetitle=driver.getTitle();
		if (pagetitle.contains("Gmail")) {
			System.out.println("login page is displayed==pass");
			
		} else {
			System.out.println("login page is not displayed==fail");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close();

	}

}
