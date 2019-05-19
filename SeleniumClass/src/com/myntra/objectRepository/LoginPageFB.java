package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFB {
	//login
	@FindBy(name = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(id = "loginbutton")
	private WebElement loginBtn;
	
	//logout
	@FindBy(id = "userNavigationLabel")
	private WebElement logoutMenu;
	@FindBy(xpath = "//div[@class = 'uiScrollableAreaContent']/ul/li[8]")
	private WebElement logOutBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginToFb(String USERNAME, String PASSWORD) {
		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD);
		loginBtn.click();
	}
	
	public void logOutFb() {
		logoutMenu.click();
		logOutBtn.click();
		
		
	}

}
