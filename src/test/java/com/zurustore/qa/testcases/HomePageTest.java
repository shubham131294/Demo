package com.zurustore.qa.testcases; 

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zurustore.qa.base.TestBase;
import com.zurustore.qa.pages.HomePage;
import com.zurustore.qa.pages.LoginPage;
import com.zurustore.qa.pages.ProjectPage;
import com.zurustore.qa.pages.UploadProjectPage;

public class HomePageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	UploadProjectPage uploadProjectPage;
	ProjectPage projectPage;
 
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		uploadProjectPage = new UploadProjectPage();
		projectPage = new ProjectPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	 

	@Test(priority = 7)
	public void HomePageTitileTest() {
	//wait.until(ExpectedConditions.titleContains("Store"));
    Assert.assertEquals(homePage.verifyHomePageTitile(),"Store");
	}
	
	@ Test(priority = 8)
	public void VerifyFirstcategoryTest() {
    Assert.assertTrue(homePage.verifyFirstCat());
	}
	@Test(priority = 9)
	public void VerifyUploadProjectLinkTest() {
	uploadProjectPage = homePage.clickOnUploadButton(); 
	}
	@Test(priority = 10) 
	public void VerifyProjectPageLinkTest() {
		projectPage = homePage.projectCategory();
	}
   
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
