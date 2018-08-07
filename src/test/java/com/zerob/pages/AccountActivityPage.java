package com.zerob.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerob.utilities.Driver;

public class AccountActivityPage {
	
	public AccountActivityPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}		
	
//	@FindBy(xpath="//*[@class='active']//*[text()='Account Activity']")
//	public WebElement accountActivityTab;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']/li[2]/a")
	public WebElement accountActivityTab;
	
	@FindBy(xpath="//h2[@class='board-header']")
	public WebElement showTransactions;
	
	
	@FindBy(xpath="//select[@id='aa_accountId']")
	public WebElement selecetAccountType;
	
	public WebElement chooseAccountType(int index) {
		String xpath = "//select[@id='aa_accountId']/option[" + index + "]";
		return Driver.getDriver().findElement(By.xpath(xpath));
	}

	
//	@FindBy(xpath="//li[@id=\"account_activity_tab\"]")
//	public WebElement accountActivityTab;
//	
//	@FindBy(className="board-header")
//	public WebElement showTransactions;
	
}
