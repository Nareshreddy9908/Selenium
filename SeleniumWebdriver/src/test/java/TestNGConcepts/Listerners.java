package TestNGConcepts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerners {
	//ITestListeners is a interface implements from TestNG interface
	
	
	public class Listeners  implements ITestListener  {
		
		
		public void onTestStart(ITestResult result) {
			
			System.out.println("Test is start");
			
		}
		
		

		public void onTestFailure(ITestResult result) {
			
			System.out.println("Test is faile..");
			
		}
		
		

		public void onTestSkipped(ITestResult result) {
			
			System.out.println("Test is skipped");
			
		}
		
		

		public void onTestSuccess(ITestResult result) {
			
			System.out.println("Test is sucess...");
			
		}
		
		
		
	}
}
