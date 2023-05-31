package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(2000);

		// //div[@class='o6cuMc Jj6Lae']

		 String actual_error = driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']")).getText();
		//String actual = driver.findElement(By.xpath("//div[@class='o6cuMc Jj6Lae']")).getAttribute("innerHTML");
		String expected_error = "Enter an email or phone number";

		// Type 1
		Assert.assertEquals(actual_error, expected_error);

		// Type 2

		Assert.assertTrue(actual_error.contains("Enter an email or phone number"));

		System.out.println("Test Completed.....");
	}

}
