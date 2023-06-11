package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		WebElement move =driver.findElement(By.cssSelector("a#nav-link-accountList"));
		
		
		
		// moves to specific element
		org.openqa.selenium.interactions.Actions a = new org.openqa.selenium.interactions.Actions(driver);
		a.moveToElement(move).build().perform();
		
		// enter text data in Caps and double click 
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		// contextclick or rightclick
		a.moveToElement(move).contextClick().build().perform();
	}

}
