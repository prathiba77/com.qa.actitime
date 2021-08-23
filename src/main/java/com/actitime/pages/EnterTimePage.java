package com.actitime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.base.DriverScript;

/*Name: EnterTimePage
 * Developed By: Prathiba
 * Developed Date: 07/14/2021
 * Verified By: Shanthosh
 * Verified Date: 07/15/2021
 * Description: EnterTimePage contains all the page elements and the actions-Feel free to add or modify the locator
 */

public class EnterTimePage extends DriverScript

//********************Page Elements***********************
{

	@FindBy(id="container_tasks") WebElement menuTask;
	@FindBy(xpath="//div[@id='container_reports']") WebElement menuReports;
	@FindBy(id="container_users") WebElement menuUsers;
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textLoggedinUser;
	
//********************Page Initialization***********************
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}

//********************Page Actions***********************
	
	public void clickTaskMenu()
	{
		menuTask.click();
	}
	
	public void clickLogout()
	{
		linkLogout.click();
	}
	
	public String getUserLoggedIn()
	{
		return textLoggedinUser.getText();
	}
	

}
