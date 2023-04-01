package test;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Auth Zied HANNACHI
 * */
public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is : "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			FirefoxProfile profile = new FirefoxProfile();
		    profile.setPreference("browser.download.folderList", 1);
		    profile.setPreference("browser.download.manager.showWhenStarting", false);
		    profile.setPreference("browser.download.manager.focusWhenStarting", false);
		    profile.setPreference("browser.download.useDownloadDir", true);
		    profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		    profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		    profile.setPreference("browser.download.manager.closeWhenDone", true);
		    profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		    profile.setPreference("browser.download.manager.useWindow", false);
		    FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("platform", Platform.WIN10);
			firefoxOptions.setProfile(profile);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Test completed Successfully");
		
	}

}
