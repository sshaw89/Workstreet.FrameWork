package com.myntra.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//input[@placeholder = 'Search']")
	private WebElement searchbox;
	
	@FindBy(xpath ="//img[@class='img-responsive']")
	private WebElement jacket;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getJacket() {
		return jacket;
	}


	

}
