package com.zerob.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerob.utilities.Driver;

public class AccountSummaryPage {
public AccountSummaryPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath="//ul[@class='nav nav-tabs']/li[1]/a")
	public WebElement accountSummary;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']/li[1]")
	public WebElement accountSummaryTab;
	
	@FindBy(xpath="(//h2[@class='board-header'])[1]")
	public WebElement cashAccounts;
	
	@FindBy(xpath="(//h2[@class='board-header'])[2]")
	public WebElement investmentAccounts;
	
	@FindBy(xpath="(//h2[@class='board-header'])[3]")
	public WebElement creditAccounts;
	
	@FindBy(xpath="(//h2[@class='board-header'])[4]")
	public WebElement loanAccounts;
	
	@FindBy(xpath="(//table[@class='table'])[1]/tbody/tr[1]/td/a")
	public WebElement savings;
	
	@FindBy(xpath="(//table[@class='table'])[1]/tbody/tr[2]/td/a")
	public WebElement checking;
	
	@FindBy(xpath="(//table[@class='table'])[2]/tbody/tr[1]/td/a")
	public WebElement brokerage;
	
	@FindBy(xpath="(//table[@class='table'])[3]/tbody/tr[2]/td/a")
	public WebElement creditCard;
	
}





