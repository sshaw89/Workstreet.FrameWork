package com.myntra.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JacketsPage {
	@FindBy(xpath = "//div[@class='size-buttons-size-buttons']/div[3]/div")
	private WebElement sizeSelect;

	public WebElement getSizeSelect() {
		return sizeSelect;
	}

}
