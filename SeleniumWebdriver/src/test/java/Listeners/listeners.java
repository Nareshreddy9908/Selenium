package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listeners  extends TestListenerAdapter {
	
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started..");
		
	}
	

	@Override
	public void onTestFailure(ITestResult tr) {
		
		System.out.println("Test is failure..");
		
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		
		System.out.println("Test is Sucess..");
		
	}


	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test is skipped...");
	}
	

	

}
