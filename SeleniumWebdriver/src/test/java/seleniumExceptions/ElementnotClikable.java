package seleniumExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementnotClikable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Element is loaded in DOM , but it is overlapped by other element

		// Element is not visiable because of another element

		driver.get("https://classic.freecrm.com/");

		driver.findElement(By.name("username")).sendKeys("naresh031995@gmail.com");
		
		Thread.sleep(3000);

		
		
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement loginButton =
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		  "//input[@type='submit']"))); loginButton.click();
		 
		
		 
			/*
			 * 
			 * boolean invisiable =
			 * Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")
			 * ); if(invisiable) {
			 * 
			 * 
			 * //WebElement loginButton =
			 * driver.findElement(By.xpath("//input[@type='submit']")); //element.click();
			 * 
			 * }
			 */
		
	}

}
