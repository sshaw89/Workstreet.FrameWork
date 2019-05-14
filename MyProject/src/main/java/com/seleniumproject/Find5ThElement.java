package com.seleniumproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Find5ThElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElement(By.name("q")).sendKeys("webdriver");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@class='sbct']"));
		//Iterator<WebElement> itr=list.iterator();
		Actions act=new Actions(driver);
		System.out.println(list.size());
		for (WebElement option : list) {
			
			System.out.println(option.getText());
			
		}

		Thread.sleep(3000);
		act.moveToElement(list.get(4)).click().perform();
		driver.quit();
			
			
			
		
		
		
		
		/*Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();*/

	}

}
