package Listeners;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class extentReports {

	extentReports extent; // specify the location of the path
	ExtentTest test; // what details should be populated in the report

	public extentReports(String string, boolean b) {
		// TODO Auto-generated constructor stub
	}

	@Test
	public ExtentTest startReport(String string) {

		// report = new ExtentReports(System.getProperty("user.dir")
		// +"//test-output//myOwnreport.html" , true);

		extent = new extentReports(System.getProperty("user.dir") + "//test-output//myOwnReports.html", true);
		// ((Object) extent).addSystemInfo("Host Name","Local Host");
		// extent.addSystemInfo("environment","QA");
		// extent.addSystemInfo("user Name","pavan");
		// ((Object) extent).loadConfig(new File(System.getProperty("user.dir")
		// +"\\extent-config.xml"));
		return test;

	}

	@Test
	public void reportStart() {

		// test =extent.startTest("report start");
		Assert.assertTrue(true);
		// test.log(LogStatus.PASS, "Assert pass as condition is True");
	}

	@Test
	public void reportFail() {

		test = extent.startReport("report failed..");
		// Assert.assertFalse(false);
		Assert.assertTrue(false);
		// test.log(LogStatus.Fail, "Assert fail as condition is false.. ")

	}

	public void getResult(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			// test.log(logStatus.Failure, result.getThrowable())

		}
		// extent.endTest(test);
	}

	@AfterTest
	public void endTest() {
		// extent.flush();

	}

}
