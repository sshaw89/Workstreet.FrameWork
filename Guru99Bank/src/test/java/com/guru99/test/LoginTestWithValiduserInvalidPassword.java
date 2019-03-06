package com.guru99.test;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.genericlibrary.BaseClass;
import com.guru99.genericlibrary.FileUtis;
import com.guru99.objectrepository.LoginPage;

public class LoginTestWithValiduserInvalidPassword extends BaseClass {

	Logger log=Logger.getLogger(LoginTestWithValiduserInvalidPassword.class);
	@Test
	public void invalidLoginTestWithInvalidPassword() throws Throwable {
		FileUtis file=new FileUtis();
		Properties pobj=file.getPropertyObject();
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		log.info("Trying to login with invalid username");
		login.loginToApp(pobj.getProperty("username"), pobj.getProperty("invalidpassword"));
		log.info("switching to alert popup window");
		Alert alt=driver.switchTo().alert();
		log.info("getting the text of popup window");
		String alerttext=alt.getText();
		System.out.println(alerttext);
		log.info("verifying the expected text with actual test using assert");
		Assert.assertEquals(alerttext, "User or Password is not valid");
		log.info("alert text is verified");
		alt.accept();
		driver.close();
	}
	
	
	
}
