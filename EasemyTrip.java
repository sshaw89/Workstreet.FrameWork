package com.Mymaven.Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EasemyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		Actions act=new Actions(driver);
		WebElement we= driver.findElement(By.id("FromSector_show"));
		we.clear();
		we.sendKeys("BLR");
		driver.findElement(By.xpath("//span[text()='Bangalore(BLR)']")).click();
		WebElement wb=driver.findElement(By.id("Editbox13_show"));
		wb.clear();
		wb.sendKeys("BOM");
		driver.findElement(By.xpath("//span[text()='Mumbai(BOM)']")).click();
		driver.findElement(By.xpath("//input[@class='input_cld']")).click();
		String currentdate=getCurrentSystemDate();
		String[] datearr=currentdate.split(":");
		String day=Integer.parseInt(datearr[0])+"";
		//String month=datearr[1];
		//String year=datearr[2];
		String xpath="//div[@class='box']/div/ul/li[text()='"+day+"']";
		driver.findElement(By.xpath(xpath)).click();
		driver.findElement(By.xpath("//a[@onclick='myFunction4()' and @class='dropbtn_n']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown-content-n show']/div[1]/div[1]/div[2]/div/div[3]/input[@class='plus_box1']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown-content-n show']/div[1]/div[2]/div[2]/div/div[3]/input[@class='plus_boxChd']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown-content-n show']/div/label[3]/span[@class='chk_flt']")).click();
		driver.findElement(By.xpath("//a[@onclick='myFunction4()' and text()='Done']")).click();
		driver.findElement(By.xpath("//div[@class='s_col_v4 ripplen']/input")).click();
		Thread.sleep(5000);
		WebElement web=driver.findElement(By.xpath("//div[@class='ft_price vbn4']/div/span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		act.moveToElement(web).clickAndHold(web).moveByOffset(40, 0).perform();
		List<WebElement> webelements=driver.findElements(By.xpath("//div[@class='col-md-8 col-sm-8 col-xs-9 txt-r6-n ng-binding']"));
		for (WebElement wbe : webelements) {
			String prices=wbe.getText();
			System.out.println(prices);
			List <String> arrl=new ArrayList<String>();
			arrl.add(prices);
			Collections.sort(arrl);
			System.out.println(arrl.equals(prices));
			
			}
		}		
	
	public static String getCurrentSystemDate() {
		Date date=new Date();
		String[] dateformte=date.toString().split(" ");
		int day=date.getDate();
		String currentday=day+"";
		int month=date.getMonth()+1;
		String currentmonth=month+"";
		String year=dateformte[5];
		return currentday+":"+currentmonth+":"+year;
		
		
		
	}

}
