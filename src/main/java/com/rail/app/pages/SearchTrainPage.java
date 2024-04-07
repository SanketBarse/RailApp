package com.rail.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.rail.app.basepages.BasePage;

public class SearchTrainPage extends BasePage{
	
	
	public SearchTrainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[contains(@formcontrolname , 'origin')]/span/input")
	public WebElement origin;
	
	@FindBy(xpath = "//*[contains(@formcontrolname , 'destination')]/span/input")
	public WebElement destination;
	
	public void clickOrigin() {
		origin.sendKeys("gondia");
		driver.findElement(By.xpath("//*[contains(@id,'pr_id_1_list')]/li[2]")).click();
	}
	
	public void clickDestination() {
		destination.sendKeys("amgaon");
		driver.findElement(By.xpath("//*[contains(@id,'pr_id_2_list')]/li[1]")).click();
	}
	
}
