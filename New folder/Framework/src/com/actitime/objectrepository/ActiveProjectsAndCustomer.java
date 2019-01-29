package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectsAndCustomer {
	@FindBy(xpath="//input[@text='Create New Customer']")
	private WebElement createNewCustomerbtn;
	@FindBy(className="successmsg")
	private WebElement succesmsg;
	public WebElement getSuchMsg() {
		return succesmsg;
	}
	public void navigateToCreateCustomerPage() {
		createNewCustomerbtn.click();
	}
	

}
