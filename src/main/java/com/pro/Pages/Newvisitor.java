package com.pro.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pro.Util.TestBase;
import com.pro.Util.TestUtil;

public class Newvisitor extends TestBase{
	
	public Newvisitor() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][contains(text(),'Create')]")
	WebElement clickCreate;
	
	@FindBy(xpath="//a[contains(text(),'Create New Visitor')]")
	WebElement newVisitor;
	
	@FindBy(xpath="//input[@id=\"fullname\"]")
	WebElement Fname;
	
	@FindBy(xpath="//input[@id=\"phone\"]")
	WebElement phone;
	
	@FindBy(xpath="//textarea[@id=\"fulladdress\"]")
	WebElement address;
	
	
	@FindBy(xpath="//select[@id=\"selectblock\"]")
	WebElement dropdown;
	
	@FindBy(xpath="//input[@id=\"persontomeet\"]")
	WebElement persontomeet;
	
	@FindBy(xpath="//input[@id=\"reasontomeet\"]")
	WebElement reasontomeet;
	
	@FindBy(xpath="//button[@id=\"save\"]")
	WebElement addvisitor;
	
	@FindBy(xpath="//p[contains(text(),'Visitor Information Added Successfully')]")
	WebElement successmessage;
	
	public void addnewVisitor(String fname,String Phone,String Address, String Personmeet, String ReasonMeet) throws InterruptedException  {
		
		clickCreate.click();
		newVisitor.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//WebDriverWait wait= new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(Fname));
		Fname.sendKeys(fname);
		phone.sendKeys(Phone);
		address.sendKeys(Address);
		selectBlock();
		persontomeet.sendKeys(Personmeet);
		reasontomeet.sendKeys(ReasonMeet);
		addvisitor.click();
		
		
		
	}
	
	public void selectBlock() {
		Select block= new Select(dropdown);
		block.selectByVisibleText("Block-D");
	}
	
	public boolean successMessage() {
		return successmessage.isDisplayed();
		
	}
	
	
	
	
	
	

}
