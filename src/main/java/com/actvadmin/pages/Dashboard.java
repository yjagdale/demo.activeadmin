package com.actvadmin.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actvadmin.browserfactory.Browser;

public class Dashboard extends Browser{

	WebDriver driver;
	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	By linkText = By.linkText("Active Admin");
	public void validatelink() {
		driver.findElement(linkText).click();
	}
	
	/*public Dashboard validatlink() {
		return new Dashboard();
		
	}*/
}
