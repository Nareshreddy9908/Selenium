package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// click the checkboxes
		// check the checkbox is selected or not
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		// click the checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// chrck the checkbox is selected or not
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// we will check after clicking on the roundtrip button and destination date is
		// enabled or disabled.
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("it's enabled..");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}

		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		// count the number of checkboxes

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);

		/*
		 * int i = 1; while (i < 5) {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * i++;
		 * 
		 * }
		 */

		// Add the adualts

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		Thread.sleep(2000);

		driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
