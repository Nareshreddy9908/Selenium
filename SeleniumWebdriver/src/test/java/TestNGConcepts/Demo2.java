package TestNGConcepts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void pLoan() {

		System.out.println("Loan....");
	}
	
	@Test(groups = {"Smoke"})
	public void p1Loan() {
		System.out.println("p1Loan...");
	}
	
	
	@BeforeTest
	public void prequestie() {
		System.out.println("I will execute first....");
	}

}
