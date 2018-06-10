package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browserregisertation {

	public WebDriver firefox() {

		System.setProperty("webdriver.gecko.driver", "/home/anish/Downloads/geckodriver");

		WebDriver firefoxbrowser = new FirefoxDriver();
		firefoxbrowser.manage().window();
		firefoxbrowser.get("http://demo.activeadmin.info/admin/dashboard");
		return firefoxbrowser;
	}

	@Test
	public WebDriver chrome() {

		System.setProperty("webdriver.chrome.driver", "/home/anish/Downloads/chromedriver");
		WebDriver chromebrowser = new ChromeDriver();
		chromebrowser.get("http://demo.activeadmin.info/admin/dashboard");
		return chromebrowser;
	}
}
