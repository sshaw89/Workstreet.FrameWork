package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonDataCapture {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String[] productname= {"Apple iPhone XR (White, 3GB RAM, 64GB Storage, 12 MP Camera, 326 PPI Display)","Apple iPhone XR (Black, 3GB RAM, 128GB Storage, 12 MP Camera, 326 PPI Display)",
				"Apple iPhone X (Silver, 3GB RAM, 256GB Storage, 12 MP Dual Camera, 458 PPI Display)"};
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		for(int i=0;i<productname.length;i++) {
			String x="//h2[text()='"+productname[i]+"']/../../../../div[2]/div[1]/div[1]/a/span[1]";
			String price=driver.findElement(By.xpath(x)).getText();
			System.out.println(productname[i]+"==>"+price);
		}
		driver.close();

	}

}
