package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x",Keys.ENTER);
		/*{String x="//span[text()='3 GB']/../preceding-sibling::input";
		driver.findElement(By.xpath(x)).click();
		String result=driver.findElement(By.id("s-result-count")).getText();
		System.out.println(result);
		String[] arr=result.split(" ");
		if (arr[0].equals("17")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		} }*/
		driver.findElement(By.xpath("//h2[text()='Apple iPhone X (Space Grey, 3GB RAM, 64GB Storage, 12 MP Dual Camera, 458 PPI Display)']")).click();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung a7",Keys.ENTER);
	}

}
