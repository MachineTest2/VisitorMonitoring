package com.pro.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pro.Pages.Search;
import com.pro.Util.TestBase;

public class SearchVisitor extends TestBase{
	Search search;

	@BeforeClass
	public void setUp() throws IOException{
		initialization();
     
	}
	
	@Test(priority=5)
	public void searchVisitor() {
		search = new Search();
		search.clickonSearchbutton();
		search.enterthesearchText();
		search.clickonSubmitbButton();
		boolean flag=search.verifythesearchVisitor();
		Assert.assertTrue(flag);
	}
	
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
