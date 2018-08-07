package com.zerob.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.zerob.pages.OnlineStatementPage;
import com.zerob.testBase.TestBase;

public class LoginTest extends TestBase {
	OnlineStatementPage onlineStatementPage = new OnlineStatementPage();

	@Test
	public void loginTest() {

		String actual = onlineStatementPage.username.getText();
		String expected = "username";
		assertEquals(expected, actual);

	}
}
