package com.zerob.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.zerob.tests.TestBase;

public class LoginTests extends TestBase  {
	
	@Test()
	public void loginTest() {
		// name of the test
		extentLogger = report.createTest("Positive login test");
		// info ()  --> to print a message
		extentLogger.info("entering user credentials");
		
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).sendKeys("username"); 
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
	}
}
