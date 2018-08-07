package com.zerob.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.zerob.pages.AccountSummaryPage;
import com.zerob.testBase.TestBase;
import com.zerob.utilities.Driver;

public class AccountSummaryTests extends TestBase{
AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
	
	@Test(description="TC201: Account Summary Verification", priority=1)
	public void verifyAccountSummary() {
		assertEquals(Driver.getDriver().getTitle(),"Zero - Account Summary");
		assertTrue(accountSummaryPage.accountSummary.isDisplayed());
		assertEquals(accountSummaryPage.accountSummaryTab.getAttribute("class"),"active");
		
	}
	
	@Test(description="TC202: Savings and Checking links verification", priority=2)
	public void verifySavingsChecking() {
		assertTrue(accountSummaryPage.cashAccounts.isDisplayed());
		assertEquals(accountSummaryPage.savings.getText(), "Savings");
		assertEquals(accountSummaryPage.checking.getText(), "Checking");
	}
	
	@Test(description="TC203: Brokerage link verification", priority=3)
	public void verifyBrokerage() {
		assertTrue(accountSummaryPage.investmentAccounts.isDisplayed());
		assertTrue(accountSummaryPage.brokerage.isDisplayed());
	}
	
	@Test(description="TC204: Credit card tab verification", priority=4)
	public void verifyCreditCardLink() {
		assertTrue(accountSummaryPage.creditAccounts.isDisplayed());
		assertTrue(accountSummaryPage.creditCard.isDisplayed());
	}
}
