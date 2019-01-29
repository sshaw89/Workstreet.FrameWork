package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/java/multiselect%20dropdown.html");
		WebElement sub=driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel=new Select(sub);
		Boolean stat=sel.isMultiple();
		if(stat) {
			for(int i=0;i<6;i++) {
				sel.selectByIndex(i);
			}
		}
		else {
			System.out.println("it is not a multiselect dropdown");
		}
		sel.deselectAll();
		//driver.quit();

	}
}

