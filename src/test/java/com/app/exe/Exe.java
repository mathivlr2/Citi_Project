package com.app.exe;

import com.app.pageexe.LoginPageExe;

public class Exe extends LoginPageExe {
	
	public static void main(String[] args) {
		browserLaunch();
		getUrl("https://adactinhotelapp.com/");
		username();
		password();
		loginButton();
	}

}
	