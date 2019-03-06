package com.guru99.genericlibrary;


	
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	public class BaseClass {
		public static WebDriver driver;
		FileUtis flib=new FileUtis();
		Logger log=Logger.getLogger(BaseClass.class);
		
		@BeforeClass
		public void configeBC() throws Throwable {
			
				Properties pobj=flib.getPropertyObject();
				String browsernew=pobj.getProperty("browser");
			if(browsernew.equals("chrome")) {
				log.info("opening chrome browser");
			System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
			driver=new ChromeDriver();
			}
			else if(browsernew.equals("firefox")) {
				log.info("opening firefox browser");
				System.setProperty("webdriver.gecko.driver", "./Resource/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@BeforeMethod
		public void configBM() throws Throwable {
			Properties propertyobj = flib.getPropertyObject();
			driver.get(propertyobj.getProperty("url"));
			log.info("entered the url");
		}
		@AfterMethod
		public void configAM() {
			
		}
		@AfterClass
		public void configAC() {
			log.info("closed the browser");
			driver.close();
		}
	


}
