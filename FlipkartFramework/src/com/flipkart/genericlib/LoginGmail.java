package com.flipkart.genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginGmail {
		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://gmail.com");
			WebElement wb=driver.findElement(By.id("identifierId"));
			wb.sendKeys("subratkumarshaw@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(3000);
			WebElement wb1= driver.findElement(By.name("password"));
			wb1.sendKeys("8908982889somu");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(5000);
			WebElement wbe=driver.findElement(By.xpath("//span[@class='gb_cb gbii']"));
			String str=wbe.getText();
			System.out.println(str);
			wbe.click();
			driver.findElement(By.xpath("//a[text()='Sign out']")).click();
			
			
		}
}
