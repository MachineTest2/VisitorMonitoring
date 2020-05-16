package com.pro.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pro.Pages.Confirmvisitor;
import com.pro.Pages.Pendingvisitor;
import com.pro.Util.TestBase;

public class ManageConfirmvisitor extends TestBase{
	Confirmvisitor cvisitor;
	Pendingvisitor pvisit;
	
	@BeforeClass
	public void setUp() throws IOException{
		initialization();
     
	}
	@Test(priority=3)
	public void manageConfirmVisitor() {
		cvisitor= new Confirmvisitor();
		pvisit= new Pendingvisitor();
		pvisit.clickonManage();
		cvisitor.clickonConfirmVisitor();
		boolean flag=cvisitor.verifytheUser();
		Assert.assertTrue(flag);
		
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
