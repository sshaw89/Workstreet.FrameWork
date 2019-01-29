package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownmenue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement wbe=driver.findElement(By.xpath("//span[text()='Category']"));
		Actions act=new Actions(driver);
		act.moveToElement(wbe).perform();
		act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-text' and text()='Mobiles, Computers']"))).perform();
		driver.findElement(By.xpath("//span[text()='Power Banks']")).click();

	}

}
