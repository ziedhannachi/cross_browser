package com.e2eTests.page_objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.utils.BasePage;

public class LoginPage extends BasePage {

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	/* Locators */
	final static String USERNAME_FIELD = "user-name";
	final static String PASSWORD_FIELD  = "password";
	final static String LOGIN_BUTTON = "login-button";
	
	/* @FindBy */
	@FindBy(how = How.ID, using = USERNAME_FIELD)
	public static WebElement usernameField;
	@FindBy(how = How.ID, using = PASSWORD_FIELD)
	public static WebElement passwordField;
	@FindBy(how = How.ID, using = LOGIN_BUTTON)
	public static WebElement loginBtn;
	
	/* Method */
	public void submit(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginBtn.click();
	}

}
