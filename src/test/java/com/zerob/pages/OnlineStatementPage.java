package com.zerob.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerob.utilities.Driver;

public class OnlineStatementPage {
	public OnlineStatementPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='settingsBox']/ul/li[3]/a")
	public WebElement username;

	@FindBy(linkText = "Online Statements")
	public WebElement onlineStatementsButton;

	@FindBy(xpath = "html/head/title")
	public WebElement pageTitle;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/h2")
	public WebElement subTitle;

	@FindBy(xpath = "//select[@id='os_accountId']/option[1]")
	public WebElement savingAccount;

	@FindBy(id = "os_accountId")
	public WebElement select;

	@FindBy(linkText = "2012")
	public WebElement statementsYear2012;

	@FindBy(partialLinkText = "Statement")
	public WebElement statements;

	@FindBy(xpath = "//div[@id=\"online_statements_for_account\"]/h2")
	public WebElement accountTitle;

	@FindBy(linkText = "2011")
	public WebElement statementsYear2011;

	public void selectAccount(String accountType) {
		Select dropdown = new Select(select);
		switch (accountType) {
		case "Savings":
			dropdown.selectByValue("1");
			;
			break;
		case "Checking":
			dropdown.selectByValue("2");
			break;
		case "Loan":
			dropdown.selectByValue("4");
			break;
		case "Credit":
			dropdown.selectByValue("5");
			break;
		case "Brokerage":
			dropdown.selectByValue("6");
			break;

		}
	}

}
