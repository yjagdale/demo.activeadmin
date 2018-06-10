package com.actvadmin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.actvadmin.browserfactory.Browser;

public class Products extends Browser {

	WebDriver driver;

	public Products(WebDriver driver) {
		this.driver = driver;
	}
	
	By linkText1 = By.linkText("Products");
	By newpro = By.xpath("//a[contains(text(),'New Product')]");
	By titlefilter = By.xpath("//div[@id='q_title_input']/select");
	By name = By.xpath("//input[@id='q_title']");
	By button = By.name("commit");
	By newprotitle = By.xpath("//input[@id='product_title']");
	By newproprice = By.xpath("//input[@id='product_price']");
	By imagefilename = By.xpath("//input[@id='product_image_file_name']");
	By creatprod = By.name("commit");
	By proddetail = By.xpath("//td[@id='product_43713']/a[contains(text(),'Ruby Programming Essentials')]");
	
	
	public void clickOnProductLink() {
		driver.findElement(linkText1).click();
	}

	public void clickOnNewProdLink() {
		driver.findElement(newpro).click();
	}

	public void selectFilterTitle() {
		Select title = new Select(driver.findElement(titlefilter));
		title.selectByVisibleText("Equals");
	}
	
	public void sendkeyTitle() {
		driver.findElement(name).sendKeys("Ruby Programming Essentials");
	}
	
	public void buttonClick() {
		driver.findElement(button).click();
	}
	
	public void productDetails() {
		driver.findElement(proddetail).click();
	}
	
	public void proTitle() {
		driver.findElement(newprotitle).sendKeys("Automamtion");
	}
	
	public void prodPrice() {
		driver.findElement(newproprice).sendKeys("100");
	}
	
	public void imageFilename() {
		driver.findElement(imagefilename).sendKeys("Automation image file");
	}
	
	public void createProdClick() {
		driver.findElement(creatprod).click();
	}
	
}
