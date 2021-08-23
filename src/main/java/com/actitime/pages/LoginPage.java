package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.base.DriverScript;

/*Name: LoginPage
 * Developed By: Prathiba
 * Developed Date: 07/14/2021
 * Verified By: Shanthosh
 * Verified Date: 07/15/2021
 * Description: LoginPage contains all the LoginPage elements and the actions-Feel free to add or modify the locator
 */

public class LoginPage extends DriverScript 

//********************Page Elements***********************
{

	@FindBy(id="username") WebElement textUsername;
	@FindBy(name="pwd") WebElement textPassword;
	@FindBy(xpath="//div[text()='Login ']") WebElement buttonLogin;
	@FindBy(id="logoContainer") WebElement imageLogo;
	
//********************Page Initialization***********************
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//********************Page Actions***********************
	
	public void enterUsername(String username)
	{
		textUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		textPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		buttonLogin.click();
	}
	
	public boolean verifyLogo()
	{
		return imageLogo.isDisplayed();
	}

}
