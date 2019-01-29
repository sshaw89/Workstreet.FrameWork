package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/?p=us");
		List<WebElement> we=driver.findElements(By.xpath("//a"));
		System.out.println(we.size());
		for(WebElement wb:we) {
			String lkname=wb.getText();
			System.out.println(lkname);
		}
	}

}
