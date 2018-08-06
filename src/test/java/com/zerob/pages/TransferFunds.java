package com.zerob.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerob.utilities.Driver;

public class TransferFunds {
	
	public TransferFunds() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
		
	@FindBy(xpath="//*[@id=\"transfer_funds_tab\"]/a")
	public WebElement TransferFundsTab;
	
	@FindBy(id="tf_amount")
	public WebElement Amount;
	
	@FindBy(id="tf_description")
	public WebElement Description;
	
	@FindBy(id="btn_submit")
	public WebElement Continue;
	
	@FindBy(id="btn_submit")
	public WebElement Submit;
	
	@FindBy(xpath="//*[@id='transfer_funds_content']/div[1]/div[1]/div[1]")
	public WebElement verifyText;

}
