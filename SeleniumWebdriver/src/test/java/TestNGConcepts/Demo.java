package TestNGConcepts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {

	@AfterTest
	public void lastExecution() {

		System.out.println("I will execute last..");
	}

	@Parameters({"URL"})
	@Test(groups = {"smoke"})
	public void firstTest(String urlName) {

		System.out.println("first test...");
		System.out.println("urlName is:"+urlName);
	}
	
	
	@AfterSuite
	public void afSuite() {
		System.out.println("I am no 1 from last...");
	}

	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void secondTest(String url) {
		System.out.println("second.");
		System.out.println("urlName is:" +url);
	}
}
