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

public class dashboard {

	public browserregisertation abc = new browserregisertation();
	WebDriver browsername = abc.chrome();
	By customeremail = By.xpath("//*[@href=\"/admin/users/123141\"]");
	By editclick = By.xpath("//*[@href=\"/admin/users/123141/edit\"]");
	By usernameedit = By.xpath("//*[@id=\"user_username\"]");
	By passwordedit = By.xpath("//*[@id=\"user_password\"]");
	By emailedit = By.xpath("//*[@id=\"user_email\"]");
	By updatebutton = By.xpath("//*[@id=\"user_submit_action\"]");
	By cancelbutton = By.xpath("//*[@href=\"/admin/users\"]");

	// address
	By addressadd = By.xpath("//*[@href=\"/admin/users/122954/user_addresses/new\"]");
	By addressfulname = By.xpath("//*[@id=\"user_address_fullname\"]");
	By addressone = By.xpath("//*[@id=\"user_address_address_line1\"]");
	By addresstwo = By.xpath("//*[@id=\"user_address_address_line2\"]");
	By addresscity = By.xpath("//*[@id=\"user_address_city\"]");
	By addressstate = By.xpath("//*[@id=\"user_address_state\"]");
	By addresszipcode = By.xpath("//*[@id=\"user_address_zipcode\"]");
	By countryindia = By.xpath("//*[@value=\"IN\"]");
	By submitaddress = By.xpath("//*[@id=\"user_address_submit_action\"]");
	By redirectadmin = By.xpath("//*[@href=\"/admin\"]");

	// *[@class="flash flash_notice"]
	By ccommentbox = By.xpath("//*[@id=\"active_admin_comment_body\"]");
	By submitcomment = By.xpath("//*[@id=\"active_admin_comment_submit_action\"]");

	// label

	By labelfullname = By.xpath("//*[@for=\"user_address_fullname\"]");

	@Test(priority = 1)
	public void dashboardadmin() {

		String checkmessage = browsername.findElement(customeremail).getText();
		// System.out.println(username.findElement(email).getText());
		String emailid = "eveline39@mcglynnkaulke.name";
		if (checkmessage.equals(emailid)) {

			System.out.println("Passed");
		} else {

			System.out.println("failed");

		}

	}

	@Test(priority = 2)
	public void userclickonemail() {

		browsername.findElement(customeremail).click();
		browsername.manage().window();

	}

	@Test(priority = 3)
	public void commentboxdetails() {

		browsername.findElement(ccommentbox).sendKeys("added comment");

		browsername.findElement(submitcomment).click();

		browsername.manage().window();

	}

	@Test(priority = 4)
	public void addressdetailsadd() throws InterruptedException {

		browsername.findElement(addressadd).click();
		browsername.manage().window();
		String addressmsglabel = browsername.findElement(labelfullname).getText();
		System.out.println(addressmsglabel);
		// if(addressmsglabel.equals("adad")) {
		//
		//
		//
		// }
		// else {}

		browsername.findElement(addressfulname).sendKeys("abc");
		browsername.findElement(addressone).sendKeys("abc");

		browsername.findElement(addresstwo).sendKeys("abc");
		browsername.findElement(addresscity).sendKeys("abc");
		browsername.findElement(addressstate).sendKeys("abc");
		browsername.findElement(addresszipcode).sendKeys("abc");
		// browsername.findElement(countryindia).sendKeys("abc");

		browsername.findElement(submitaddress).click();
		Thread.sleep(1000);
		// if()
		browsername.findElement(redirectadmin).click();

		browsername.findElement(customeremail).click();

	}

	@Test(priority = 5)
	public void userclickonedit() {

		browsername.findElement(editclick).click();
		browsername.manage().window();
		browsername.findElement(usernameedit).clear();
		browsername.findElement(usernameedit).sendKeys("letslearn");
		browsername.findElement(passwordedit).clear();
		browsername.findElement(passwordedit).sendKeys("letslearn");
		browsername.findElement(emailedit).clear();
		browsername.findElement(emailedit).sendKeys("letslearn@gmail.com");
		browsername.findElement(updatebutton).click();

	}

	@AfterTest
	public void userclickoncancel() {

		browsername.findElement(editclick).click();
		browsername.manage().window();
		browsername.findElement(cancelbutton).click();
		browsername.manage().window();

	}

	// new user registeration
	public void newuserregisteration() {

	}

}
