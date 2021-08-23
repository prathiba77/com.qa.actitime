package com.actitime.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateCustomerTest extends BaseTest
{
	
	
    @Test
	public void testCreateCustomer()
	{   
    	logger=report.createTest("Create New Customer Test");
    	
		loginpage.enterUsername("admin");
		logger.info("entered the username");
		loginpage.enterPassword("manager");
		logger.info("entered the password");
		loginpage.clickLogin();
		logger.info("clicked the loginbutton");		
		
		String actual = entertimepage.getUserLoggedIn();
		Assert.assertTrue(actual.contains("John"));
		System.out.println(actual);
		logger.pass("User loggedin successfully");
		entertimepage.clickTaskMenu();
		logger.info("clicked on taskMenu");	
		
		String title = taskpage.getTitle();
		Assert.assertTrue(title.contains("Task"));
		System.out.println(title);
		logger.pass("Successfully navigated to task page");
		taskpage.clickAddNew();
		logger.info("clicked Add New button");
		taskpage.clickNewCustomer();
		logger.info("clicked New customer option");
		taskpage.enterCustomerName("Ludo Casey");
		logger.info("entered customer name");
		taskpage.enterCustomerDescription("Ludo Casey1");
		logger.info("entered customer Description");
		taskpage.clickCreateCustomer();
		logger.info("clicked on create customer");
		String message = taskpage.verifySuccessMessage();
		Assert.assertTrue(message.contains("created"));	
		System.out.println(message);
		logger.pass("Successfully created the user");		
		
		entertimepage.clickLogout();
		logger.info("user logged out successfully");
				
	}

}
