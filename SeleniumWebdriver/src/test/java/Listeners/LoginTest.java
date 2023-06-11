package Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class LoginTest {

	// They are two ways we can handle to the skip the test cases while executing test cases in testng
	
	// 1. enabled = false and 2. exclude
	
	// if you dont want execute any test case at that time we can use "enabled=false" default true.
	
	@Test
	public void LoginByEmail() {

		System.out.println("login by Email..");
		AssertJUnit.assertEquals("pavan", "pavan");

	}

	@Test
	public void loginByFacebook() {

		System.out.println("login by amazon..");
		AssertJUnit.assertEquals("pavan", "kumar");
	}


}
