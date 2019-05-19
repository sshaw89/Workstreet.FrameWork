package com.actitime.genriclib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.objectRepositorylib.HomePage;
import com.actitime.objectRepositorylib.LoginPage;

public class BaseClass {
	//@before test and @before test is use when we have to connect to db and parallel execution
	public static WebDriver driver;
	public static FileUtil flib = new FileUtil();
	
	@BeforeSuite
	public void setPathForExe() {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
	}
	
	@BeforeClass
	public void configBc() throws Throwable {
		System.out.println("=========launch browser========");
		Properties pobj = flib.getPropertiesObject();
		String browserName = pobj.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
	}
	
	@BeforeMethod
	public void configBM() throws Throwable {
		Properties pobj = flib.getPropertiesObject();
		String url = pobj.getProperty("url");
		driver.get(url);
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.loginToApp(username, password);	
	}
	
	@AfterMethod
	public void configAM() {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.logoutToApp();
		
	}
	
	@AfterClass
	public void configAC() {
		driver.close();
	}

}
