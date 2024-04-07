package com.rail.app.testclasses;

import org.testng.annotations.Test;

import com.rail.app.basepages.BasePage;
import com.rail.app.pages.LoginPage;
import com.rail.app.pages.SearchTrainPage;

public class DemoTest {
	
	@Test
	public void demo() {
		BasePage basePage = new BasePage();
		basePage.getDriver();
		LoginPage loginPage = basePage.openUrl();
		SearchTrainPage trainPage = loginPage.clickLogin();
		

		
		trainPage.clickOrigin();
		trainPage.clickDestination();
	}
	
}
