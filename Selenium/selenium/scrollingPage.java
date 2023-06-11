package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		/*
		 * ScroolTo ----------
		 * 
		 * if you want scroll the current page to specific page down by using  "scroolTo".
		 * 
		 * Again , we can scroll down the page at that time "scrollTo" method is not
		 * working. At that time we can use the "scroolBy" method
		 * 
		 * ScrollInView --------------
		 * 
		 * it is used for , iam identifing the element in some specific position like
		 * down , at that time we can use the "ScrollInView".
		 */
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// scrollTo - it will scroll the current position to given position 
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		

		//WebElement element =driver.findElement(By.xpath("//h2[text()='Total Pageviews']"));
		
		WebElement element =driver.findElement(By.xpath("//a[text()='Tutorials']/parent::li[@class='parent']"));
		
		js.executeScript("argumnets[0].scrollIntoView(true);",element);
		
	}

}
