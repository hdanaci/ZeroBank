package com.zerob.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.zerob.pages.MyMoneyMap;

public class MyMoneyMapTest extends TestBase {
	
	MyMoneyMap mymoneyMap = new MyMoneyMap();
	
	@Test(priority=1)
	public void verifyInflow() {
		mymoneyMap.MyMoneyTab.click();
		
		String actual = mymoneyMap.inflowTotal.getText();
		System.out.println(actual);
		String expected = "$6,150.00";
		assertEquals(actual, expected);
	}
	
	@Test(priority=2 , groups = {"smoke"})
	public void verifyOutflow() {
		
		String actual = mymoneyMap.outFlow.getText();
		System.out.println(actual);
		String expected ="$2,121.00";
		assertEquals(actual, expected);
		
	}
	
	@Test(priority=3)
	public void verifySummary() {
		
		String actual = mymoneyMap.summary.getText();
		System.out.println(actual);
		String expected ="$4,029.00";
		assertEquals(actual, expected);
		
	}
	
	
	
	
}
