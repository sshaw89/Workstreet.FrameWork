package com.webapplication.tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntra.genriclib.BaseClass;
import com.myntra.objectRepository.HomePage;
import com.myntra.objectRepository.JacketsPage;

@Listeners(com.myntra.genriclib.ListnerImpClass.class)
public class MyntraTest extends BaseClass {
	 @Test
	 public void myantraTest() throws InterruptedException {
	  String expected = "L";
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.myntra.com/");
	  //home page
	  HomePage hp = PageFactory.initElements(driver, HomePage.class);
	  hp.getSearchbox().sendKeys("levis jackets man");
	  Actions ac = new Actions(driver);
	  ac.sendKeys(Keys.ENTER).perform();
	  hp.getJacket().click();
	  //handling new tab
	  Set <String> set = driver.getWindowHandles();
	  Iterator<String> it = set.iterator();
	  String childWin = it.next();
	  driver.switchTo().window(childWin);
	  //jackets page
	  JacketsPage jp = PageFactory.initElements(driver, JacketsPage.class);
	  String act = jp.getSizeSelect().getText();
	  Thread.sleep(2000);
	  Assert.assertEquals(act, expected);
	  }
}
