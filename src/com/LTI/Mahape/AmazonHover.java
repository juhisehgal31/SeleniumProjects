package com.LTI.Mahape;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHover {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Music/CompleteSelenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
		ArrayList<String> alist=new ArrayList<String>();
		int size=driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a")).size();
		System.out.println("Your List size is "+size);
		for(int i=0;i<size;i++)
		{
			String linkName=driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a")).get(i).getText();
			alist.add(linkName);
		}
		System.out.println(alist);
		//System.out.println("Your Account size is ");
		ArrayList<String> alist1=new ArrayList<String>();
		int size1=driver.findElements(By.xpath("//div[@id='nav-al-your-account']//a")).size();
		System.out.println("Your Account size is "+size1);
		for(int i=0;i<size1;i++)
		{
			String linkName=driver.findElements(By.xpath("//div[@id='nav-al-your-account']//a")).get(i).getText();
			alist1.add(linkName);
		}
		System.out.println(alist1);
		driver.close();
		

	}

}
