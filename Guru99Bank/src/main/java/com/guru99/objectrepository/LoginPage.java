package com.guru99.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	@FindBy(name="uid")
	private WebElement userNameEdt;
	@FindBy(name="password")
	private WebElement passwordEdt;
	@FindBy(name="btnLogin")
	private WebElement loginbutton;
	@FindBy(name="btnReset")
	private WebElement Resetbutton;
	public WebElement getusernameedt() {
		return userNameEdt;
	}
	public WebElement getpasswordEdt() {
		return passwordEdt;
	}
	public WebElement getLoginButton() {
		return loginbutton;
	}
	public void loginToApp(String username, String password) {
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginbutton.click();
		
	}
	

}
