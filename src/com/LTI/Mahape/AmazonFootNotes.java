package com.LTI.Mahape;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//hello today is monday and it is a sunny day


//i am very hungry today
public class AmazonFootNotes {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Music/CompleteSelenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		
		WebElement colDriver=driver.findElement(By.xpath("(//div[contains(@class,'navFooterLinkCol')])[1]"));
		int colSize=colDriver.findElements(By.tagName("a")).size();
		for(int i=0;i<colSize;i++)
		{
			colDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
			

	}

}
