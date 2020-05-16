package com.pro.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pro.Util.TestBase;

public class Search extends TestBase{
	
	public Search() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Search')]")
	WebElement clicksearchbutton;
	
	@FindBy(xpath="//input[@name=\"search\"]")
	WebElement searchtextfield;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement submitbutton;
	
	@FindBy(xpath="//tr/td[contains(text(),'test15')]")
	WebElement verifyvisitor;
	
	public void clickonSearchbutton() {
		clicksearchbutton.click();
	}

	public void enterthesearchText() {
		searchtextfield.sendKeys("test15");
	}
	
	public void clickonSubmitbButton() {
		submitbutton.click();
	}
	
	public boolean verifythesearchVisitor() {
		return verifyvisitor.isDisplayed();
		
	}
}
