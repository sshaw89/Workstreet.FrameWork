package com.seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;

public class Dropdown {

	public static void main(String[] args) {
		

		

				System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/Subrat/Downloads/Selenium%20Test%20Website/Selenium%20Test%20Website/WebPage.html");
	
				String[] arr= {"C++ Lang","HTML Lang"};
				WebElement wbMulti=driver.findElement(By.xpath("//select[@multiple='true']"));
				Select mulSel=new Select(wbMulti);
				
				List <WebElement> mulList=mulSel.getOptions();
				for(int i=0;i<=mulList.size()-1;i++)
				{
					String str1=mulList.get(i).getText();
					//System.out.println(str1);
					for(int j=0;j<=arr.length-1;j++){
					if(str1.equals(arr[j]))
					{
						mulSel.selectByVisibleText(str1);
						System.out.println(str1);
					}
					
					else
					{
						//System.out.println("====Mismatch====");
					}
					}
				}
					
				driver.close();
			}


}
