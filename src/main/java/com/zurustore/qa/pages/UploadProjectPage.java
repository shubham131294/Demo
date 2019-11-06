package com.zurustore.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.zurustore.qa.base.TestBase;

public class UploadProjectPage extends TestBase {
	
	@FindBy(xpath="//h4[contains(text(),'Upload your project')]")
	private WebElement UploadProjectText;
	
	@FindBy(xpath="//div[@class='card-text']")
	private List<WebElement> allproject;

	public UploadProjectPage() {
		PageFactory.initElements(driver,  this);
	}
	
	public boolean UploadProjectText() {
		
	    wait.until(ExpectedConditions.visibilityOf(UploadProjectText));	
		return UploadProjectText.isDisplayed();
		
		
	}
}
