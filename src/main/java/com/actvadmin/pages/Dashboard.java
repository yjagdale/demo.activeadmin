package com.actvadmin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actvadmin.browserfactory.Browser;

public class Dashboard extends Browser{

	//POM
	@FindBy(linkText="Active Admin")
	WebElement lnktext;
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
	
	public void validatelink() {
		lnktext.click();
	}
}
