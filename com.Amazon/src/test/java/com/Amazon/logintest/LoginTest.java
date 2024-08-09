package com.Amazon.logintest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void login_validDate() {
		Reporter.log("logic_validate for register test",true);
	}
	
	@Test
	public void login_invalidDate() {
		Reporter.log("logic_invalidate for register test",true);
	}

}
