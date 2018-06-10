package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import browserfactory.browserregisertation;


public class users {
	
	public browserregisertation abc = new browserregisertation();
	
	WebDriver browsername  =	abc.chrome();
	
	

}
