package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicwebtablewithPagination {

	public static void main(String[] args) throws InterruptedException {

		// we can add the webdrivermanager depandency
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/admin/index.php");

		driver.manage().window().maximize();
		
		
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		WebElement signin =driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		signin.click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("header")).click();
		
		//sales -->orders
		
		//driver.findElement(By.xpath("//a[@class='parent']")).click();
	//	driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		
	}

}
