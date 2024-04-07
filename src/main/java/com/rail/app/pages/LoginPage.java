package com.rail.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rail.app.basepages.BasePage;

public class LoginPage extends BasePage{
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//a[contains(@class,'loginText')]")
	public WebElement loginBtn;
	
	public SearchTrainPage clickLogin() {
		loginBtn.click();
		return PageFactory.initElements(driver, SearchTrainPage.class);
	}
}
