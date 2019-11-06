 package com.zurustore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zurustore.qa.base.TestBase;

public class ProjectPage extends TestBase {
	
	@FindBy(xpath="//h2[@class='section-title']")
	private WebElement ProjectPage;
	
}
