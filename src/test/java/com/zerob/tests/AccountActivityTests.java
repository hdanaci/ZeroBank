package com.zerob.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerob.pages.AccountActivityPage;

public class AccountActivityTests extends TestBase {

	AccountActivityPage accountActivityPage = new AccountActivityPage();

	@Test(description = "Verify the default Account type", priority = 1)
	public void defaultSavings() {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		assertTrue(accountActivityPage.defaultSavings.isDisplayed());
	}

	@Test(description = "Verify the Checking Account type", priority = 2)
	public void Checking() {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.dropdownBox.click();
		assertTrue(accountActivityPage.checking.isDisplayed());
		accountActivityPage.checking.click();
		assertTrue(accountActivityPage.checking.isDisplayed());

	}

	@Test(description = "Verify the Savings Account type", priority = 3)
	public void Savings() {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.dropdownBox.click();
		assertTrue(accountActivityPage.savings.isDisplayed());
		accountActivityPage.savings.click();
		assertTrue(accountActivityPage.savings.isDisplayed());

	}

	@Test(description = "Verify the Loan Account type", priority = 4)
	public void Loan() throws InterruptedException {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.dropdownBox.click();
		assertTrue(accountActivityPage.loan.isDisplayed());
		accountActivityPage.loan.click();
		assertTrue(accountActivityPage.loan.isDisplayed());

	}

	@Test(description = "Verify the Credit Card Account type", priority = 5)
	public void CreditCard() throws InterruptedException {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.dropdownBox.click();
		assertTrue(accountActivityPage.creditCard.isDisplayed());
		accountActivityPage.creditCard.click();
		assertTrue(accountActivityPage.creditCard.isDisplayed());

	}

	@Test(description = "Verify the Brokerage Account type", priority = 6)
	public void Brokerage() throws InterruptedException {

		accountActivityPage.accountActivityTab.click();
		assertEquals(driver.getTitle(), "Zero - Account Activity");
		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		accountActivityPage.dropdownBox.click();
		assertTrue(accountActivityPage.brokerage.isDisplayed());
		accountActivityPage.brokerage.click();
		assertTrue(accountActivityPage.brokerage.isDisplayed());

	}

}