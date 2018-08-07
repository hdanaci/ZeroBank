package com.zerob.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.zerob.pages.OnlineStatementPage;
import com.zerob.testBase.TestBase;
import com.zerob.utilities.BrowserUtils;
import com.zerob.utilities.Driver;

public class OnlineStatementTest_401 extends TestBase {
	OnlineStatementPage onlineStatementPage = new OnlineStatementPage();

	@Test
	public void onlineStatementsTest() {
		/*
		 * TC401 
		 * Step 1 
		 * Verify User Name
		 */
		String actual = onlineStatementPage.username.getText();
		String expected = "username";
		assertEquals(expected, actual);

		/*
		 * TC401 
		 * Step 2 
		 * Verify Online Statement Button isDisplayed
		 */
		assertTrue(onlineStatementPage.onlineStatementsButton.isDisplayed());
	
		/*
		 * TC402 
		 * Step 1 
		 * Click Online Statement Button
		 */
		BrowserUtils.waitFor(2);
		onlineStatementPage.onlineStatementsButton.click();

		/*
		 * TC402 
		 * Step 2 
		 * Verify Online Statement Page Title
		 */
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "Zero - Online Statements";
		assertEquals(expectedTitle, actualTitle);

		/*
		 * TC402 
		 * Step 3 
		 * Verify Online Statement Page Subtitle
		 */
		String actualSubTitle = onlineStatementPage.subTitle.getText();
		String expectedSubTitle = "Statements & Documents";
		assertEquals(expectedSubTitle, actualSubTitle);

		/*
		 * TC402 
		 * Step 4 
		 * Verify Online Statement Page Account Type
		 */
		String actualAccType = onlineStatementPage.savingAccount.getText();
		String expectedAccType = "Savings";
		assertEquals(expectedAccType, actualAccType);

		/*
		 * TC402 
		 * Step 5 
		 * Verify Online Statement Page Statements Year
		 */
		String actualStYear = onlineStatementPage.statementsYear2012.getText();
		String expectecStYear = "2012";
		assertEquals(expectecStYear, actualStYear);

		/*
		 * TC402 
		 * Step 6 
		 * Verify Online Statement Page Statements isDisplayed
		 */
		assertTrue(onlineStatementPage.statements.isDisplayed());

		/*
		 * TC403 
		 * Step 1 
		 * Select Checking Account
		 */
		onlineStatementPage.selectAccount("Checking");

		/*
		 * TC403 
		 * Step 2 
		 * Verify Account Title
		 */
		BrowserUtils.waitFor(2);
		String actualAcTitle = onlineStatementPage.accountTitle.getText();
		String expectedAcTitle = "Account - Checking";
		assertEquals(expectedAcTitle, actualAcTitle);

		/*
		 * TC403 
		 * Step 3 
		 * Click Statement Year 2011
		 */
		BrowserUtils.waitFor(2);
		onlineStatementPage.statementsYear2011.click();

		/*
		 * TC403 
		 * Step 4
		 * Verify Online Statement Page Statements isDisplayed
		 */
		BrowserUtils.waitFor(2);
		assertTrue(onlineStatementPage.statements.isDisplayed());
	}
}
