package com.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenANewTab {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.youtube.com/");
 		Robot rb = new Robot();
 		rb.keyPress(KeyEvent.VK_CONTROL);
 		rb.keyPress(KeyEvent.VK_T);
 		rb.keyRelease(KeyEvent.VK_CONTROL);
 		rb.keyRelease(KeyEvent.VK_T);
 		Set<String> st = driver.getWindowHandles();
 		Iterator<String> it = st.iterator();
 		String pId = it.next();
 		String cId = it.next();
 		driver.switchTo().window(cId);
 		driver.get("https://stackoverflow.com");
 		driver.close();
 		driver.switchTo().window(pId);
 		driver.close();
 		
 		
	}

}
