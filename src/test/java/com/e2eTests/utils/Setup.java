package com.e2eTests.utils;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Setup extends BasePage{
	
	public Setup() throws IOException {
		super();
	}
	
	@Parameters({"browserName"})
	@BeforeMethod
	public void setupTest(String browserName) { 
		initialization(browserName);
		driver.get(prop.getProperty("home.url"));
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		System.out.println("Test completed Successfully");
	}

}
