package com.pro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pro.Util.TestBase;

public class Datewisereport extends TestBase{
	
	public Datewisereport() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Date Wise Report')]")
	WebElement dbr;
	
	@FindBy(xpath="//input[@id=\"fromdate\"]")
	WebElement fromdate;
	
	@FindBy(xpath="//input[@id=\"todate\"]")
	WebElement todate;
	
	@FindBy(xpath="//button[@id=\"submit\"]")
	WebElement submit;
	
	
	public void clickonDateWiseReport() {
		dbr.click();
	}
	
	public  void selectFromDate() {
		fromdate.sendKeys("13052020");
		
	}
	
	public  void selectToDate() {
		todate.sendKeys("15052020");
		
	}
	
	public void clickOnSubmit() {
		submit.click();
	}

}
