package com.iam.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{

	public static WebDriver startBrowser(String browser, String url)
	{ 
	    WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("Firefox"))
		{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				
				
		}
		else if (browser.equalsIgnoreCase("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();
		return driver;
		
	}

}
