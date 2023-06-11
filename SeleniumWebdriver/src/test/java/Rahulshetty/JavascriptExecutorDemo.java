package Rahulshetty;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll the window to specific place 
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		
		//scroll the table up or down
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		

	}

}
