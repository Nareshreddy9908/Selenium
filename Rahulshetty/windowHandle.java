package Rahulshetty;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		// click on the top of the right side in a current page and then it will open
		// another window or tab..

		driver.findElement(By.cssSelector("a.blinkingText")).click();

		// it will get the all windows id's opened by selenium by using windowHandles()
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//Thread.sleep(3000);

		// in csselector space is a replaced with the dot(.) while identifing the css
		// elements;

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String emailId =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
       
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
