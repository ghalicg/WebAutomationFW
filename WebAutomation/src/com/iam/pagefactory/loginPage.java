package com.iam.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
	
	@FindBy(how=How.ID, using = "login_login_username")
     WebElement User_name;
	
	@FindBy(how=How.ID, using = "login_login_password")
	 WebElement PassWord;
	
	@FindBy(how=How.ID, using = "login_submit")
     WebElement btn_Submit;
	
	public void Login(String username, String password)
	{
		System.out.println(username);
		User_name.sendKeys(username);
		PassWord.sendKeys(password);
		btn_Submit.click();
		
	}

}
