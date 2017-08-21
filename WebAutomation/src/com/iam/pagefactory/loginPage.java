package com.iam.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
	
	@FindBy(how=How.ID, using = "login_username")
	private WebElement User_name;
	
	@FindBy(how=How.ID, using = "password")
	private WebElement PassWord;
	
	@FindBy(how=How.ID, using = "submit")
	private WebElement btn_Submit;
	
	public void Login(String username, String password)
	{
		User_name.clear();
		User_name.sendKeys(username);
		PassWord.click();
		PassWord.sendKeys(password);
		btn_Submit.click();
		
	}

}
