package com.actvadmin.browserfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actvadmin.utilies.TestUtilies;

public class Browser {

	public static WebDriver driver;
	static Properties prop;

	public Browser() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\selenium\\demo.activeadmin\\src\\main\\java\\com\\actvadmin\\config\\config.properties");

			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initalization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\Setup\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtilies.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilies.IMPL_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
