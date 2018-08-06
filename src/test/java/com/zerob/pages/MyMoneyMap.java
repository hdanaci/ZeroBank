package com.zerob.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerob.utilities.Driver;


public class MyMoneyMap  {
	
	public MyMoneyMap() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath= "//*[@id=\"money_map_tab\"]/a")
	public WebElement MyMoneyTab;
	
	@FindBy(xpath = "(//*[contains(text(),'$6,150.00')])[1]")
	public WebElement inflowTotal;
	
	@FindBy(xpath="(//tr[@class='x-grid-row-summary ']/td[2]/div/b)[2]")
	public WebElement outFlow;
	
	@FindBy(xpath="(//tr[@class='x-grid-row-summary ']/td[2]/div/b)[3]")
	public WebElement summary;
	
	
}
