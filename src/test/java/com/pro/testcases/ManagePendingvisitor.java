package com.pro.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pro.Pages.Pendingvisitor;
import com.pro.Util.TestBase;

public class ManagePendingvisitor extends TestBase{
	
	Pendingvisitor pvisitor;
	
	@BeforeClass
	public void setUp() throws IOException{
		initialization();
     
	}
	
	@Test(priority=2)
	public void clickmanagePendingVisitor() throws InterruptedException {
		pvisitor =new Pendingvisitor();
		pvisitor.clickonManage();
		pvisitor.clickonPendingVisitor();
		pvisitor.clickonEdit();
		pvisitor.enterRemark();
		pvisitor.clickonCheckoutButton();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	

}
