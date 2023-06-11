package selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyTitle {

	@org.testng.annotations.Test
	public void verifyTitles() {

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// gettitle() method is capture the title of page and return the string fromate.

		 //Actual title 
		String title1= driver.getTitle();
		//String title = driver.getPageSource();
		System.out.println("Title is" +title1);
		
		//url : view-source:https://learn-automation.com/
		// if you want page of title , right click page in any place and then click on the pagesource .
		
		
		
		//String expected_title="Automation - Selenium WebDriver tutorial Step by Step";
		
		//Assert.assertEquals(title, expected_title);
		//Assert.assertTrue(title1.equals("<html><head></head><body></body></html>"));
		Assert.assertTrue(title1.contains("Automation - Selenium WebDriver tutorial"));
		System.out.println("Test completed..");
		
		

	}

}
