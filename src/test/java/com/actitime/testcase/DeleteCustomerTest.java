package com.actitime.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteCustomerTest extends BaseTest
{
	@Test
    public void testDeleteCustomer() throws InterruptedException
    {
    	logger=report.createTest("Delete customer test");
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
		taskpage.enterSearchText("Ludo Casey");
		logger.info("entered customer name to search");			
		taskpage.clickSearchedResult();
		logger.info("clicked on search box result");		
		taskpage.clickEditButton();
		logger.info("clicked on edit button");	
		Thread.sleep(4000);
		taskpage.clickActionsButton();
		logger.info("clicked on actions button");
		Thread.sleep(4000);
		taskpage.clickDeleteButton();
		logger.info("clicked on delete button");
		taskpage.clickPermanentlyDeleteButton();
		logger.info("clicked on delete permanently button");
		
		String message = taskpage.verifySuccessMessage();
		Assert.assertTrue(message.contains("deleted"));
		System.out.println(message);
		logger.pass("successfully deleted the user name");
		
		entertimepage.clickLogout();
		logger.info("user logged out successfully");
		
    }
	
}
