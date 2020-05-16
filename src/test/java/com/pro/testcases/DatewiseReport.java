package com.pro.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pro.Pages.Datewisereport;
import com.pro.Util.TestBase;

public class DatewiseReport extends TestBase {
	Datewisereport dwr;

	@BeforeClass
	public void setUp() throws IOException {
		initialization();

	}

	@Test(priority=4)
	public void Report() {
		dwr = new Datewisereport();
		dwr.clickonDateWiseReport();
		dwr.selectFromDate();
		dwr.selectToDate();
		dwr.clickOnSubmit();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
