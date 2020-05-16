package com.pro.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pro.Util.TestBase;

public class Pendingvisitor extends TestBase {

	public Pendingvisitor() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][contains(text(),'Manage')]")
	WebElement clickonManage;

	@FindBy(xpath = "//a[contains(text(),'Manage Pending Visitor')]")
	WebElement ClickonPendingVisitor;

	@FindBy(xpath = "//tr/td[contains(text(),'Engineer')]/following::td[8]/a")
	WebElement clickonEdit;

	@FindBy(xpath = "//input[@id='checkoutremarks']")
	WebElement enterremark;

	@FindBy(xpath="//button[@id='save']")
	WebElement checkout;

	public void clickonManage() {
		clickonManage.click();
	}

	public void clickonPendingVisitor() {
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ClickonPendingVisitor));
		ClickonPendingVisitor.click();
	}
	
	public void clickonEdit() {
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(clickonEdit));
		clickonEdit.click();
	}
	
	public void enterRemark() {
		enterremark.sendKeys("Checked Out");
		
	}
		
		
	public void clickonCheckoutButton() throws InterruptedException {
		checkout.click();
		Thread.sleep(20);
	}

	

}
