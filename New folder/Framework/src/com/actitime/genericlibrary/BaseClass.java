package com.actitime.genericlibrary;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.Login;

public class BaseClass {
		public static WebDriver driver;
		public static FileUtil flib=new FileUtil();

		@BeforeClass
		public void configBC() throws Throwable, Throwable {
		System.out.println("-------launch browser-------");
		Properties pobj=flib.getPropertyFileObject();
		String browsername=pobj.getProperty("browser");
		if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Resource/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@BeforeMethod
		public void configBM() throws Throwable {
			System.out.println("-------login-------");
			Properties pobj=flib.getPropertyFileObject();
			driver.get(pobj.getProperty("url"));
			Login loginpage=PageFactory.initElements(driver, Login.class);
			loginpage.loginToApp(pobj.getProperty("username"), pobj.getProperty("password"));	
		}
		@AfterMethod
		public void configAM() {
			System.out.println("------logout-------");
			HomePage lout=PageFactory.initElements(driver, HomePage.class);
			lout.logout();
		}
		@AfterClass
		public void configAC() {
			Reporter.log("-----close browser-----",true);
			driver.close();
		}
}
