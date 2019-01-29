package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileAttachmentPopup {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		
		driver.findElement(By.name("uploadCV")).click();
		StringSelection path=new StringSelection("D:\\excelfile\\FUVCHHSVCUY.docx");
		Toolkit T=Toolkit.getDefaultToolkit();
		Clipboard c=T.getSystemClipboard();
		c.setContents(path, null);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
