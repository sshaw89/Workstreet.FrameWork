package com.guru99.Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase01Test {

	@Test 
	public void testCase01(){
         System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
         WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         //Navigate to the url
         driver.get("http://live.guru99.com");
         //verifying the home page
         String expResult = "THIS IS DEMO SITE";
         WebElement wb = driver.findElement(By.xpath("//h2"));
         String actResult = wb.getText();
         Assert.assertTrue(actResult.contains(expResult)); 
         //click on mobile menu and verify
         String expResult1 = "MOBILE"; 
         driver.findElement(By.xpath("(//a[@class = 'level0 ' ])[1]")).click();
         String actResult1 = driver.getTitle();
         Assert.assertTrue(actResult1.equalsIgnoreCase(expResult1));
         //get the unsorted name
         List<WebElement> wb1 = driver.findElements(By.xpath("//li[@class = 'item last']//div/h2[@class= 'product-name']"));
         List<String> list = new ArrayList<String>();
         for(WebElement w1: wb1) {
        	 list.add(w1.getText());
        	}
         Collections.sort(list);
         //short by name and store in list
         WebElement wb2 = driver.findElement(By.cssSelector("select[title='Sort By']"));
         Select sel = new Select(wb2);
         sel.selectByVisibleText("Name");
         List<WebElement> lst = driver.findElements(By.xpath("//li[@class = 'item last']//div/h2[@class= 'product-name']"));
         List<String> lst1 = new ArrayList<String>();
        
         for(WebElement w: lst)
          {
        	 lst1.add(w.getText());
         }
         //verify the name of mobile
         Assert.assertEquals(list, lst1);
         
         

	}

}
