package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locators.LoginPageLocatorsPageFactory;

public class LoginPagefactoryExe extends LoginPageLocatorsPageFactory {
	
	public static void username() {
		BaseClass.sendData( new LoginPageLocatorsPageFactory().getUsername(), "Yuvaraj");
	}
	
	public static void password() {
		BaseClass.sendData( new LoginPageLocatorsPageFactory().getPassword(), "Yuvaraj");
	}

}
