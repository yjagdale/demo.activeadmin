package com.actvadmin.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.actvadmin.pages.Products;

public class ProductTest extends DasboardTest{
	
	@BeforeMethod
	public void beforetest() {
			initalization();
			//dashboard.validatlink();
	}

	/*@Test(priority=1)
	public void validateprodlink() {
		driver.findElement(linkText1).click();
	}
	
	@Test(priority=2)
	public void validatenewprodlink() {
		validateprodlink();
		driver.findElement(newpro).click();
	}*/
	
	@Test(priority=1)
	public void verifyproductlink() throws InterruptedException {
		Products verifyprod = new Products(driver);
		//Products verifyprod = PageFactory.initElements(driver, Products.class);
		verifyprod.clickOnProductLink();
		verifyprod.selectFilterTitle();
		verifyprod.sendkeyTitle();
		verifyprod.buttonClick();
		verifyprod.productDetails();
		
	}
	
	@Test(priority=2)
	public void addproduct() {
		Products verifyaddprod = new Products(driver);
		//Products verifyaddprod = PageFactory.initElements(driver, Products.class);
		verifyaddprod.clickOnProductLink();
		verifyaddprod.clickOnNewProdLink();
		verifyaddprod.proTitle();
		verifyaddprod.prodPrice();
		verifyaddprod.imageFilename();
		verifyaddprod.createProdClick();
	}
	
	/*@Test(priority=3)
	public void title() {
		Products title = PageFactory.initElements(driver, Products.class);
		verifyenewprodlink();
		title.sendkeyTitle();
	}*/
	
	/*@AfterMethod
	public void after() {
		driver.quit();
	}*/
}
