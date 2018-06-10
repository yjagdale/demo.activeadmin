package com.actvadmin.testcases;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.actvadmin.browserfactory.Browser;
import com.actvadmin.pages.Dashboard;

public class DasboardTest extends Browser {

	@BeforeMethod
	public void beforetest() {
		try {
			initalization();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validatedashlink() {
		Dashboard dash = new Dashboard(driver);
		//Dashboard dash = PageFactory.initElements(driver, Dashboard.class);
		dash.validatelink();
		driver.navigate().back();
	}

	/*@AfterMethod
	public void after() {
		driver.quit();
	}*/
}
