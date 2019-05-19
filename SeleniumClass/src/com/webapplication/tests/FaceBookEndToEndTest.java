package com.webapplication.tests;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FaceBookEndToEndTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		//create the java object of file
		FileReader fobj = new FileReader("./data/commonData.properties");
		//object of properties class to load the data
		Properties pobj = new Properties();
		//load the data by load method
		pobj.load(fobj);
		//read the data using getproperty method
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		//changing the chrome setting to not show the notification popup.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 		WebDriver driver = new ChromeDriver(options);
 		//maximize the browser
		driver.manage().window().maximize();
		//wait to load the html page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//navigate to facebook
	    driver.get(URL);
	    //login to application
	    driver.findElement(By.name("email")).sendKeys(USERNAME);
	    driver.findElement(By.id("pass")).sendKeys(PASSWORD);
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginbutton")).click();
	    //doing action on home page
	    Thread.sleep(2000);
	    driver.findElement(By.name("q")).sendKeys("shantanu jain");
	    Actions act = new Actions(driver);
	    WebElement wb = driver.findElement(By.xpath("//button[@type = 'submit' and @aria-label = 'Search']"));
	    act.moveToElement(wb).click().perform();
	    Thread.sleep(2000);
	    
	    //logout from fb
	    driver.findElement(By.id("userNavigationLabel")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class = 'uiScrollableAreaContent']/ul/li[8]")).click();
	   // driver.close();
	    ////div[@id = 'pagelet_loader_initial_browse_result']/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/a

	}
}
