package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement dragwb=driver.findElement(By.id("draggable"));
		WebElement dropwe=driver.findElement(By.id("droptarget"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragwb, dropwe).perform();
	}

}
