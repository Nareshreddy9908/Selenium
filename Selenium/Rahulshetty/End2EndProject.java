package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class End2EndProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//parent to child traverse of source 
		//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();

		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("it's Disabled..");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);

		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		Thread.sleep(2000);

		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

	}


