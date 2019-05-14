package com.seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahul {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Rahul Dravid",Keys.ENTER);
		String xpath="//a[@href='https://en.wikipedia.org/wiki/Rahul_Dravid']//h3[@class='LC20lb'][contains(text(),'Rahul Dravid - Wikipedia')]";
		driver.findElement(By.xpath(xpath)).click();
		WebElement web= driver.findElement(By.xpath("//div[@id='bodyContent']"));
		String str=web.getText();
		String expectedtext="Dravid scored nearly 25000 runs in international cricket";
		if(str.contains(expectedtext)) {
			System.out.println(expectedtext);
		}

	}

}
