package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;

public class Login {
	
		@FindBy(name="username")
		private WebElement userNameEdt;
		@FindBy(name="pwd")
		private WebElement passwordEdt;
		@FindBy(id="loginButton")
		private WebElement loginBtn;
		public WebElement getuserNameEdt(){
			return userNameEdt;
		}
		public WebElement getpasswordEdt() {
			return passwordEdt;
		}
		public WebElement getloginBtn() {
			return loginBtn;
		}
		public void loginToApp(String username,String password) {
			userNameEdt.sendKeys(username);
			passwordEdt.sendKeys(password);
			loginBtn.click();
		}
		
}
