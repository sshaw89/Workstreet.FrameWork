package com.actitime.objectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement usernameedt;
	
	@FindBy(name = "pwd")
	private WebElement passwordedt;
	
	@FindBy(id = "loginButton")
	private WebElement loginbtn;

	public WebElement getUsernameedt() {
		return usernameedt;
	}

	public WebElement getPasswordedt() {
		return passwordedt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void loginToApp(String username, String password) {
		usernameedt.sendKeys(username);
		passwordedt.sendKeys(password);
		loginbtn.click();
	}

}
