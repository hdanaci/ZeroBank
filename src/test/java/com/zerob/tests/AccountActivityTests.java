package com.zerob.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.zerob.pages.AccountActivityPage;
import com.zerob.testBase.TestBase;

public class AccountActivityTests extends TestBase {

	AccountActivityPage accountActivityPage = new AccountActivityPage();

	@Test(description = "Verify the default Account type", priority = 1)
	public void defaultSavings() {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		assertTrue(accountActivityPage.chooseAccountType(1).isDisplayed());
	}
	
	@Test(description = "Verify the Checking Account type", priority = 2)
	public void Checking() {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.selecetAccountType.click();
		assertTrue(accountActivityPage.chooseAccountType(2).isDisplayed());
		accountActivityPage.chooseAccountType(2).click();
		assertTrue(accountActivityPage.chooseAccountType(2).isDisplayed());

	}

	@Test(description = "Verify the Savings Account type", priority = 3)
	public void Savings() {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.selecetAccountType.click();
		assertTrue(accountActivityPage.chooseAccountType(3).isDisplayed());
		accountActivityPage.chooseAccountType(3).click();
		assertTrue(accountActivityPage.chooseAccountType(3).isDisplayed());
	}

	@Test(description = "Verify the Loan Account type", priority = 4)
	public void Loan() {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.selecetAccountType.click();
		assertTrue(accountActivityPage.chooseAccountType(4).isDisplayed());
		accountActivityPage.chooseAccountType(4).click();
		assertTrue(accountActivityPage.chooseAccountType(4).isDisplayed());
	}

	@Test(description = "Verify the Credit Card Account type", priority = 5)
	public void CreditCard() {
		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.selecetAccountType.click();
		assertTrue(accountActivityPage.chooseAccountType(5).isDisplayed());
		accountActivityPage.chooseAccountType(5).click();
		assertTrue(accountActivityPage.chooseAccountType(5).isDisplayed());
	}

	@Test(description = "Verify the Brokerage Account type", priority = 6)
	public void Brokerage() {
		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.selecetAccountType.click();
		assertTrue(accountActivityPage.chooseAccountType(6).isDisplayed());
		accountActivityPage.chooseAccountType(6).click();
		assertTrue(accountActivityPage.chooseAccountType(6).isDisplayed());
	}

}