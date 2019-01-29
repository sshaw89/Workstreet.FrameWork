package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		String expo="java";
		boolean flag=false;
		WebElement wbe=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		wbe.sendKeys(expo);
		Select sel=new Select(wbe);
		List<WebElement> lst=sel.getOptions();
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++) {
			String acto=lst.get(i).getText();
			if(expo.equals(acto)) {
				sel.selectByVisibleText(expo);
				flag=true;
				break;
			}
		}
		if(flag=true) {
			System.out.println(expo+" is available");
		}
		else
			System.out.println(expo+" is not available");
	}

}
