package selenium;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 0)
	public void test1() {

		System.out.println("test1 executed");
	}

	@Test(priority=1)
	public void test2() {
		System.out.println("test2 executed...");
	}

	@Test(priority=-1)
	public void test3() {
		System.out.println("test3 executed");
	}

	@Test(priority = -2)
	public void test4() {
		System.out.println("test4 executed...");
	}
}
