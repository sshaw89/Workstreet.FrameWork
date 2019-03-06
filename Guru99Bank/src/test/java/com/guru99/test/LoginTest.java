package com.guru99.test;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.guru99.genericlibrary.BaseClass;
import com.guru99.genericlibrary.FileUtis;
import com.guru99.objectrepository.LoginPage;
	@Listeners()
public class LoginTest extends BaseClass {
	Logger log=Logger.getLogger(LoginTest.class);
	@Test
	public void loginTest() throws Throwable {
		log.info("logging in to the application");
		FileUtis flib= new FileUtis();
		Properties pobj=flib.getPropertyObject();
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		log.info("entering username and password");
		login.loginToApp(pobj.getProperty("username"), pobj.getProperty("password"));
		log.info("username and password entered");
		log.info("get the title of homepage");
		String str=driver.getTitle();
		log.info("verifying with assert");
		Assert.assertEquals(str, "Guru99 Bank Manager HomePage");
		log.info("verified successfully");
		System.out.println("test is passed");
	}
	
	
	

}
