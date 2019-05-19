package com.webapplication.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraPriceFilterTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//navigate to myntra
		driver.get("https://www.myntra.com/");
		//click on the Casual wear
		driver.findElement(By.xpath("((//div[@class = 'myx-indexContainer'])[9]//a)[2]")).click();
		//short the product by price
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//div[@class = 'sort-sortBy']"));
		act.moveToElement(wb).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class = 'sort-sortBy']/ul/li)[5]")).click();
		List <WebElement> wb1 = driver.findElements(By.xpath("//div[@class = 'product-price']"));
		for(WebElement i : wb1) {
			System.out.println(i.getText());
		}
		
		

	}

}
