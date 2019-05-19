package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFB {
	@FindBy(id = "userNavigationLabel")
	private WebElement logoutMenu;
	//div[text() = 'Account Settings']
	@FindBy(xpath = "//div[@class = 'uiScrollableAreaContent']/ul/li[8]")
	private WebElement logOutBtn;
	public WebElement getLogoutMenu() {
		return logoutMenu;
	}
	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	public void logOutFb() {
		logoutMenu.click();
		logOutBtn.click();
		
		
	}

}
