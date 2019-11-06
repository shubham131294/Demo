package com.zurustore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.zurustore.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="//h2[contains(text(),'Best')]")
	private WebElement HomePageFirstCategory;
	
	@FindBy(xpath="//i[@class='sprite sprite-icon-store-upload32']")
	private WebElement UploadBtn;
	
	@FindBy(xpath="//div[@class='columns best-grid-card first-card']//div[@class='col-xs-12 cols padding0']//div[@class='best-grid-block best-1-wrp full-height background-image-stretch']")
    private WebElement ClickOnProject;
	 
	
	@FindBy(xpath=" //i[@class='link-icon sprite sprite-icon-store-project24']")
	private WebElement ProjectCategory;
	
	public HomePage() {
		PageFactory.initElements(driver, this); 
	}
	
	
	public String verifyHomePageTitile() {
		return driver.getTitle();
	}
	
	public boolean verifyFirstCat() {
		wait.until(ExpectedConditions.visibilityOf(HomePageFirstCategory));
		return HomePageFirstCategory.isDisplayed();
	} 
	
	 
	public UploadProjectPage clickOnUploadButton() {
		UploadBtn.click();
		return new UploadProjectPage();
	}

	public ProjectPage projectCategory() {
		ProjectCategory.click();
		return new ProjectPage();
	}
	
	
	
}
