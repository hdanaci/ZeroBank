package com.cbt.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cbt.pages.AccountActivityPage;

public class AccountActivityTests extends TestBase{
	
	@BeforeMethod
	public void LogingIn() {
		driver.findElement(By.xpath("//button[@id='signin_button']")).click();
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");;
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
	}
	
	@Test(description = "Verify the default Account type", priority = 1)
	public void defaultSavings() {
		
		AccountActivityPage accountActivityPage = new AccountActivityPage();

//		driver.findElement(By.xpath("//button[@id='signin_button']")).click();
//		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");;
//		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
//		driver.findElement(By.name("submit")).click();
		
//		driver.findElement(By.cssSelector("#account_activity_tab > a")).click();
		accountActivityPage.accountActivityTab.click();

		assertEquals(driver.getTitle(), "Zero - Account Activity");
		
		assertTrue(driver.findElement(By.xpath("//h2[@class='board-header']")).isDisplayed());
//		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		
		driver.findElement(By.xpath("//option[1]")).click();
//		accountActivityPage.defaultSavings.click();
		
		assertTrue(driver.findElement(By.xpath("//option[1]")).isDisplayed());
//		assertTrue(accountActivityPage.defaultSavings.isDisplayed());
	}
	
	@Test(description = "Verify the Checking Account type", priority = 2)
	public void Checking() throws InterruptedException {
		
		AccountActivityPage accountActivityTab = new AccountActivityPage();
		
		driver.findElement(By.cssSelector("#account_activity_tab > a")).click();
//		accountActivityPage.accountActivityTab.click();

		assertEquals(driver.getTitle(), "Zero - Account Activity");
		
		assertTrue(driver.findElement(By.xpath("//h2[@class='board-header']")).isDisplayed());
//		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[2]")).click();
//		accountActivityPage.chechking.click();
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.xpath("//option[2]")).isDisplayed());
//		assertTrue(accountActivityPage.checking.isDisplayed());
	}
	
	@Test(description = "Verify the Savings Account type", priority = 3)
	public void Savings() throws InterruptedException {
		
		AccountActivityPage accountActivityTab = new AccountActivityPage();
		
		driver.findElement(By.cssSelector("#account_activity_tab > a")).click();
//		accountActivityPage.accountActivityTab.click();

		assertEquals(driver.getTitle(), "Zero - Account Activity");
		
		assertTrue(driver.findElement(By.xpath("//h2[@class='board-header']")).isDisplayed());
//		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[3]")).click();
//		accountActivityPage.savings.click();
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.xpath("//option[3]")).isDisplayed());
//		assertTrue(accountActivityPage.savings.isDisplayed());
	}
	
	@Test(description = "Verify the Loan Account type", priority = 4)
	public void Loan() throws InterruptedException {
		
		AccountActivityPage accountActivityTab = new AccountActivityPage();
		
		driver.findElement(By.cssSelector("#account_activity_tab > a")).click();
//		accountActivityPage.accountActivityTab.click();

		assertEquals(driver.getTitle(), "Zero - Account Activity");
		
		assertTrue(driver.findElement(By.xpath("//h2[@class='board-header']")).isDisplayed());
//		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[4]")).click();
//		accountActivityPage.loan.click();
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.xpath("//option[4]")).isDisplayed());
//		assertTrue(accountActivityPage.loan.isDisplayed());
	}
	
	@Test(description = "Verify the Credit Card Account type", priority = 5)
	public void CreditCard() throws InterruptedException {
		
		AccountActivityPage accountActivityTab = new AccountActivityPage();
		
		driver.findElement(By.cssSelector("#account_activity_tab > a")).click();
//		accountActivityPage.accountActivityTab.click();

		assertEquals(driver.getTitle(), "Zero - Account Activity");
		
		assertTrue(driver.findElement(By.xpath("//h2[@class='board-header']")).isDisplayed());
//		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[5]")).click();
//		accountActivityPage.creditCard.click();
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.xpath("//option[5]")).isDisplayed());
//		assertTrue(accountActivityPage.creditCard.isDisplayed());
	}
	
	@Test(description = "Verify the Brokerage Account type", priority = 6)
	public void Brokerage() throws InterruptedException {
		
		AccountActivityPage accountActivityTab = new AccountActivityPage();
		
		driver.findElement(By.cssSelector("#account_activity_tab > a")).click();
//		accountActivityPage.accountActivityTab.click();

		assertEquals(driver.getTitle(), "Zero - Account Activity");
		
		assertTrue(driver.findElement(By.xpath("//h2[@class='board-header']")).isDisplayed());
//		assertTrue(accountActivityPage.showTransactions.isDisplayed());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[6]")).click();
//		accountActivityPage.brokerage.click();
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.xpath("//option[6]")).isDisplayed());
//		assertTrue(accountActivityPage.brokerage.isDisplayed());
	}
	
}
