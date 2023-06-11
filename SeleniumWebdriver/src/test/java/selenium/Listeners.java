package selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


// Add unimplemented methods are not showing in "TestNG-7" , if we want we use below 06 version
// in  after "testng 7.0 " internally using "java-1.8" version.. 
// if you wan unimplemented methods we can use the ..right click on the eclipse select override methods

 public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub


	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Finish the method...");
		
	}

	public void onTestFailedWithTimeout(ITestContext context) {
	 
		System.out.println("ontesttimeout...");
	 
	} 
	 
	 
}
