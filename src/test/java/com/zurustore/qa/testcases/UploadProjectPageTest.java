package com.zurustore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zurustore.qa.base.TestBase;
import com.zurustore.qa.pages.HomePage;
import com.zurustore.qa.pages.LoginPage;
import com.zurustore.qa.pages.UploadProjectPage;

public class UploadProjectPageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	UploadProjectPage uploadProjectPage;


	public UploadProjectPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		uploadProjectPage = new UploadProjectPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void VerifyUploadProjectTextTest() throws InterruptedException{
		homePage.clickOnUploadButton();
		uploadProjectPage.UploadProjectText();
		Assert.assertTrue(uploadProjectPage.UploadProjectText());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


