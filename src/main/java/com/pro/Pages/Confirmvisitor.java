package com.pro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pro.Util.TestBase;

public class Confirmvisitor extends TestBase{
	
	
	public Confirmvisitor() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Manage confirm')]")
	WebElement clickonconfirmvisitor;
	
	@FindBy(xpath="//tr/td[contains(text(),'Engineer')]")
	WebElement verifytheuser;
	
	
	public void clickonConfirmVisitor() {
		clickonconfirmvisitor.click();
	}
	
	public boolean verifytheUser() {
		return verifytheuser.isDisplayed();
		
	}

}
