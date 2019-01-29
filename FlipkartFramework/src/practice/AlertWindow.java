package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.irctc.com/Emp_Login.jsp");
		driver.findElement(By.name("Login")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

	}

}
