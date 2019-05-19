package com.selenium.test;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestEditBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//web element which we have to click.
		String textToSelect = "youtube video download";
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//navigate to edit box
		WebElement wb = driver.findElement(By.xpath("//input[@name = 'q']"));
		wb.sendKeys("you");
		Thread.sleep(2000);
		List <WebElement> lst = driver.findElements(By.tagName("li"));
		for(WebElement i : lst) {
			System.out.println(i.getText());
			if(i.getText().equals(textToSelect)) {
				i.click();
				break;
			}
		}
		
		
		
		
		
	}

}
