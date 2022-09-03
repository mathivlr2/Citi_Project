package com.app.locators;

import org.openqa.selenium.By;

import com.app.base.BaseClass;

public class LoginPageLocators extends BaseClass {
	// String method 
	public static String username = "username";
	public static String password = "password";
	public static String login = "login";
	
	// Abstract method
	public static By usernameAbs = By.id("username");
	public static By passwordAbs = By.xpath("//input[@name='password']");
	
	
	

}
