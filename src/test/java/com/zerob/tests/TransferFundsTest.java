package com.zerob.tests;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.zerob.pages.TransferFunds;
import com.zerob.testBase.TestBase;
import com.zerob.utilities.Driver;

public class TransferFundsTest extends TestBase{
	
	TransferFunds trsfunds = new TransferFunds();
		
	@Test(priority=1) 
	public void transferMoney() {
		trsfunds.TransferFundsTab.click();
		
		Select select = new Select(Driver.getDriver().findElement(By.id("tf_fromAccountId")));
		select.selectByIndex(2);
		
		Select selectTo = new Select(Driver.getDriver().findElement(By.id("tf_toAccountId")));
		selectTo.selectByIndex(1);
		
	}
	
	@Test(priority=2)
	public void AmountDescription() {
		
		trsfunds.Amount.sendKeys("505");
		trsfunds.Description.sendKeys("Covering the Expences");
		trsfunds.Continue.click();
		trsfunds.Submit.click();
		
	}
	
	
	@Test(priority=3)
	public void verifyText() {
		String actual = trsfunds.verifyText.getText();
		System.out.println(actual);
		
		String expected = "You successfully submitted your transaction.";
		assertEquals(actual, expected); 
	}
	/////2nd Case//////////////////////////	
	
	@Test(priority=4)
	public void transferMoney1() {
		trsfunds.TransferFundsTab.click();
		
		Select select = new Select(Driver.getDriver().findElement(By.id("tf_fromAccountId")));
		select.selectByIndex(3);
		
		Select selectTo = new Select(Driver.getDriver().findElement(By.id("tf_toAccountId")));
		selectTo.selectByIndex(4);
		
	}
	
	@Test(priority=5)
	public void AmountDescription2() {
		
		trsfunds.Amount.sendKeys("202");
		trsfunds.Description.sendKeys("Car Expences");
		trsfunds.Continue.click();
		trsfunds.Submit.click();
		
	}
	
	@Test(priority=6)
	public void verifyText1() {
		String actual = trsfunds.verifyText.getText();
		System.out.println(actual);
		
		String expected = "You successfully submitted your transaction.";
		assertEquals(actual, expected); 
	}
}
