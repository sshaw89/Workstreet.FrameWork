package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		String str="//table[@class='listTable withRoundCorners']/tbody/tr[*]/td[6]/input";
		List<WebElement> list=driver.findElements(By.xpath(str));
		for(WebElement wb:list) {
			if(wb.isSelected()) {
				System.out.println("already selected");
			}
			else {
				wb.click();
			}
		}

	}

}
