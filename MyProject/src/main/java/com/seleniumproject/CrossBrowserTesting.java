package com.seleniumproject;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	public static WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void test(String browser) throws Throwable {
		
		if(browser.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./resource/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String title="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		String str=driver.getTitle();
		assertEquals(title,str);
		System.out.println(str);
		Thread.sleep(2000);
		//driver.quit();
	}

}
