package com.e2eTests.step_definitions;

import java.io.IOException;

import org.testng.annotations.Test;

import com.e2eTests.page_objects.LoginPage;
import com.e2eTests.utils.Setup;

public class LoginStepDefinition extends Setup {

	public LoginStepDefinition() throws IOException {
		super();
	}
	
	LoginPage loginPage;
	
	@Test
	public void submitToApp() throws IOException {
		loginPage = new LoginPage();
		loginPage.submit(prop.getProperty("home.login"), prop.getProperty("home.password"));
	}

}
