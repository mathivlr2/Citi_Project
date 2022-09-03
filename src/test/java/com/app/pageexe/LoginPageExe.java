package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.LoginPageLocators;

public class LoginPageExe extends LoginPageLocators {
	

	public static void username() {
		BaseClass.sendData(BaseClass.findElementId(LoginPageLocators.username),"daisyrubycatharine");
	}
	
	public static void password() {
		BaseClass.sendData(BaseClass.findElemenname(LoginPageLocators.password), "daisyrubycatharine89");
	}
	
	public static void loginButton() {
		BaseClass.clickdata(BaseClass.findElementId(LoginPageLocators.login));
	}
	
	// abstarct method
	public static void usernameab() {
		BaseClass.sendData(BaseClass.findElementAbs(LoginPageLocators.usernameAbs),"daisyrubycatharine");
	}
	
}
