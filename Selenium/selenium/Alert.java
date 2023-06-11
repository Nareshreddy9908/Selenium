package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert {

	@Test

	public void handleAlert() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		// options.setCapability("browserName", "chrome");
		// options.setCapability("browserVersion", "113.0.5672.127 ");
		// WebDriver driver1 = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// driver.findElement(By.xpath("//button[@type='button' and
		// @class='navbar-toggler']")).click();

		// //button[normalize-space()='Search for Bus']

		// driver.findElement(By.xpath("//button[normalize-space()='Search for
		// Bus']")).click();

		// driver.findElement(By.xpath("//button[text()='Search for Bus']")).click();

		driver.findElement(By.xpath("//div[@class='col-md-22 mb-1 booking-input']")).click();
		Thread.sleep(3000);
		// org.openqa.selenium.Alert alt = driver.switchTo().alert();
		// alt.accept();

		String actual = driver.switchTo().alert().getText();
		System.out.println("Alert message is:" + actual);
		driver.switchTo().alert().accept();

		String expected = "Please select start place.";
		Assert.assertEquals(actual, expected);
		driver.quit();
	}
123456788
}
