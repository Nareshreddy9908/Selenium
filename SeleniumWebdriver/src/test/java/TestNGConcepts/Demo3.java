package TestNGConcepts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider; 
import org.testng.annotations.Test;

public class Demo3 {

	@DataProvider(name="getData")
	@Test
	public void webloginCarLoan(String username,String password ) {

		System.out.println("weblogincar.");
		System.out.println(username);
		System.out.println(password);

	}

	@Test
	public void mobileloginCarLoan() {

		System.out.println("mobilelogincar..");
	}

	@Test
	public void mobilesigninCarLoan() {

		System.out.println("mobilesignincar..");

	}

	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am no 1");
	}

	@Test
	public void mobilesignoutCarLoan(String username, String password) {

		System.out.println("mobilesignoutcar..");
		System.out.println(username);
		System.out.println(password);
	}

	@BeforeMethod
	public void bfMethod() {
		System.out.println("I will execute before every test method in Demo3 class..");
	}

	@Test(groups = { "Smoke" })
	public void ApiCarLoan() {
		System.out.println("ApicarLoan...");

	}

	@DataProvider
	public Object[][] getData() {

		// combination of username and password
		// 3-means rows and 2-means columns
		Object[][] data = new Object[3][2];

		// 1st set Data
		data[0][1] = "firstsetUsername";
		data[0][1] = "password";

		// columns in the row nothing but values for that particulat combination(row).

		// 2nd set Data
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd set Data
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetpassword";

		return data;

	}

}
