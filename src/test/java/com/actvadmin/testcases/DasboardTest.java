package com.actvadmin.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.actvadmin.browserfactory.Browser;
import com.actvadmin.pages.Dashboard;

public class DasboardTest extends Browser {
	
	By linkText = By.linkText("Active Admin");
	
	Dashboard dashboard;
	
	@BeforeMethod
	public void beforetest() {
		try {
		initalization();
		}catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void validatelink() {
		driver.findElement(linkText).click();
	}
	
	@AfterMethod
	public void after() {
		driver.quit();
	}
}
