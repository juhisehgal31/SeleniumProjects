package com.LTI.Mahape;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.DoubleClickAction;

public class AmazonSearch {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Music/CompleteSelenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<8;i++)
		{
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
			String s="return document.getElementById(\"twotabsearchtextbox\").value;";
			String text=(String)js.executeScript(s);
			if(text.contains("boys"))
			{
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
				break;
			}
		}
		


	}

}
