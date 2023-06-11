package Rahulshetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

//xpath : if you want traverse parent to child using "/"
//Css : if you want traverse parent to child space ( )

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "rahul";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String password =getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		// driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

		/*
		 * String Actual =
		 * driver.findElement(By.xpath("//p[text()='You are successfully logged in.']"))
		 * .getText(); String Expected = "You are successfully logged in.";
		 * Assert.assertEquals(Actual, Expected);
		 */
		
		
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(), "You are successfully logged in.");
		
		
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " +name+ ",");
		
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passwordArray=passwordText.split("'");
		//String[] passwordArray2 =passwordArray[1].split("'");
		//passwordArray2[0];
		String password=passwordArray[1].split("'")[0];
		return password;
		
		//0th index=Please use temporary password
		//1th index = rahulshettyacademy' to Login.
		
		//0th index=rahulshettyacademy
		//1th index = to Login.
	}

}
