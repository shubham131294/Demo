package com.zurustore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zurustore.qa.base.TestBase;
import com.zurustore.qa.pages.HomePage;
import com.zurustore.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage ; 
	HomePage homePage;
	public LoginPageTest() {
		super();
		
	}
  
	@BeforeMethod
	public void setUp() {
		initialization();
	    loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitileTest() {
    Assert.assertEquals(loginPage.validateLoginPageTitile(),"Auth1");

		
	}
	@Test(priority = 2)  
	public void loginTest() {
    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
