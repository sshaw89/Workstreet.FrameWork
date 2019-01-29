package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement logoutlnk;
	/*@FindBy(xpath="//div[text()='TASKS']/..")
	private WebElement taskImg;
	public void navigateToTaskPage() {
		taskImg.click();
	}*/
	public void logout() {
		logoutlnk.click();
	}

}
