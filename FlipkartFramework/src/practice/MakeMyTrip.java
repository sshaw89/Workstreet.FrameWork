package practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Resources/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
		WebElement wbe=driver.findElement(By.id("hp-widget__sfrom"));
		wbe.clear();
		wbe.sendKeys("BLR");
		driver.findElement(By.xpath("//span[text()='Bangalore, India']")).click();
		WebElement wbeto=driver.findElement(By.id("hp-widget__sTo"));
		wbeto.clear();
		wbeto.sendKeys("BBI");
		driver.findElement(By.xpath("//span[text()='Bhubaneswar, India']")).click();
		String nextdate=getCurrentSystemDate();
		String[] datearr=nextdate.split(":");
		String day=Integer.parseInt(datearr[0])+1+"";
		String month=datearr[1];
		String year=datearr[2];
		String x="(//td[@data-year='"+year+"' and @data-month='"+month+"']/a[text()='"+day+"'])[1]";
		driver.findElement(By.xpath(x)).click();
	}
	public static String getCurrentSystemDate() {
		Date date=new Date();
		String[] dateformat=date.toString().split(" ");
		//get current date from the date object
		int day=date.getDate();
		String sday=day+"";
		//get month from the date object
		int mon=date.getMonth();
		String smon=mon+"";
		//get year from date object
		String year=dateformat[5];
		return sday+":"+smon+":"+year;
	}
}
