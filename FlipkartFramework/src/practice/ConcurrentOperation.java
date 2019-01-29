package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ConcurrentOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement we=driver.findElement(By.id("username"));
		we.sendKeys("admin");
		Actions act=new Actions(driver);
		act.doubleClick(we).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
	}

}
