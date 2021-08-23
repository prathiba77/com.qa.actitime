package com.actitime.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.base.DriverScript;

/*Name: TaskPage
 * Developed By: Prathiba
 * Developed Date: 07/14/2021
 * Verified By: Shanthosh
 * Verified Date: 07/15/2021
 * Description: TaskPage contains all the TaskPage elements and the actions-Feel free to add or modify the locator
 */

public class TaskPage extends DriverScript
{
	
//********************Page Initialization***********************
	
	public TaskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//********************Page Elements***********************

	@FindBy(xpath="//div[@class='title ellipsis']") WebElement buttonAddNew;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement optionNewCustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement textCustomerName;
    @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']") WebElement textCustomerDescription;
    @FindBy(xpath="//div[contains(text(),'Create Customer')]") WebElement buttonCreateCustomer;
    @FindBy(xpath="//span[@class='innerHtml']") WebElement textSuccussMessage;
    
    @FindBy(xpath="//input[@type='text' and @placeholder='Start typing name ...']") WebElement textSearch;
    @FindBy(xpath="//span[@class='highlightToken']") WebElement buttonSearchResult;
    @FindBy(xpath="//div[contains(@class,'titleEditButtonContainer')]//div[contains(@class,'editButton')]") WebElement buttonEdit;

    @FindBy(xpath="(//div[@class='action'])[1]") WebElement buttonActions; 

    @FindBy(xpath="//div[text()='Copy']/following::div[text()='Delete']") WebElement buttonDelete;
    @FindBy(xpath="//span[text()='Delete permanently']") WebElement buttonDeletePermanently;
    


    
 //********************Page Actions***********************
    
    public String verifySuccessMessage()
    {
    	return textSuccussMessage.getText();
    }
    
    public String getTitle()
    {
    	return driver.getTitle();
    }
    
    public void clickAddNew()
    {
    	buttonAddNew.click();
    }
    
    public void clickNewCustomer()
    {
    	optionNewCustomer.click();
    }
    
    public void enterCustomerName(String customername)
    {
    	textCustomerName.sendKeys(customername);
    }
    
    public void enterCustomerDescription(String customerdescription)
    {
    	textCustomerDescription.sendKeys(customerdescription);
    }
    
    public void clickCreateCustomer()
    {
    	buttonCreateCustomer.click();
    }
    
    public void enterSearchText(String customername)
    {
    	textSearch.sendKeys(customername);
    }
    
    public void clickSearchedResult()
    {
    	buttonSearchResult.click();
    }
       
    public void clickEditButton()
    {
    	buttonEdit.click();
    }
	
    public void clickActionsButton()
    {
    	buttonActions.click();
    }
    
    public void clickDeleteButton()
    {
    	buttonDelete.click();
    }
    
    public void clickPermanentlyDeleteButton()
    {
    	buttonDeletePermanently.click();
    }

	

}
