package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTrendingPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/?p=us");
		String path="//li[@class='trending-list selected']/ul/li";
		List<WebElement> lst=driver.findElements(By.xpath(path));
		for(WebElement wb:lst) {
			System.out.println(wb.getText());
		}

	}

}
