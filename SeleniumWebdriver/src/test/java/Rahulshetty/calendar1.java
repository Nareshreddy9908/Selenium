package Rahulshetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		
		
		WebElement button= driver.findElement(By.id("form-field-travel_from"));
		
		
		
		  // scroll into the out specific element is a visiable 
		JavascriptExecutor js =
		  (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView(true);",button);
		  Thread.sleep(9000);
		//  button.click();
		  
		  driver.findElement(By.id("form-field-travel_from")).click();
		  
		  
		  
		  //flatpickr-days
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("flatpickr-days")));
		  
		  
		  
		  
		  
		  
		  //form-field-travel_comp_date
		  
			/*
			 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			 * WebElement element
			 * =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(
			 * "form-field-travel_from")))); element.click();
			 */
		 
		  
		//  or 
		  
		/*
		 * Actions actions = new Actions(driver); Thread.sleep(3000);
		 * actions.moveToElement(button).click().build().perform();
		 */
		  
		  
		  
		 
		  
		 
		
		
		
		
	}
	
}
