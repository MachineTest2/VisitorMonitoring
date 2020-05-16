package com.pro.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pro.Pages.Newvisitor;
import com.pro.Util.TestBase;

public class AddNewvisitor extends TestBase{
	Newvisitor visitor;
	
	@BeforeClass
	public void setUp() throws IOException{
		initialization();
     
	}
	
	@Test(priority=1)
	public void addVisitor() throws InterruptedException {
		visitor=new Newvisitor();
		visitor.addnewVisitor(pro.getProperty("fname"), pro.getProperty("Phone"),pro.getProperty("Address"),pro.getProperty("Personmeet"),pro.getProperty("ReasonMeet"));
		boolean flag=visitor.successMessage();
		Assert.assertTrue(flag);
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
	

}
