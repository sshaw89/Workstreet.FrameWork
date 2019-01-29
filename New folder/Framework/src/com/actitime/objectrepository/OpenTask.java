package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
		@FindBy(linkText="Projects & Customers")
		private WebElement projectandcustomerlnk;
		public void navigateToProjectAndCustomerPage() {
			projectandcustomerlnk.click();
		}
}
