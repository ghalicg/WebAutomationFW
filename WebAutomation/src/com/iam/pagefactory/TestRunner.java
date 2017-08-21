package com.iam.pagefactory;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRunner {
	
	private WebDriver driver;

	  
	  @BeforeClass
	  public void beforeClass() {
	 driver=new FirefoxDriver();
	 driver.navigate().to("http://demo.mahara.org");
	 driver.manage().window().maximize();
	 }

	  @Test
	  public void LoginTest() {
		  //Initialize Login Page
	  loginPage loginPage=PageFactory.initElements(driver, loginPage.class);
	  //Enter user name
	  loginPage.Login("student1", "Testing1");
	  	  }
	  
	  @Test
	  public void DashboardTest() throws InterruptedException
	  {
	Thread.sleep(5000);
	//Initialize Dashboard Page
	DashBoard dashboardPage=PageFactory.initElements(driver, DashBoard.class);
	//Wait for settings link
	dashboardPage.WaitForSettingLinkToDisplay(driver);
	//Click on Settings
	dashboardPage.ClickSettings();
	  }
	  
	  @Test
	  public void UserSettingsTest() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  //Initialize User Settings Page
		Settings settingsPage=PageFactory.initElements(driver, Settings.class);
		//Enter Maximum Tags in Cloud Number
		settingsPage.EnterMaximumTagsInCloud("40");
		//Click Save
		settingsPage.ClickSave();
		//Verify Preference Saved Message
		assertTrue(settingsPage.VerifyPreferenceSavedMessage());
		//Click Logout link
		settingsPage.ClickLogout();
	  }
	  
	  @AfterClass
	  public void afterClass() {
	//Close the browser
	driver.close();
	driver.quit();
	  }

}
