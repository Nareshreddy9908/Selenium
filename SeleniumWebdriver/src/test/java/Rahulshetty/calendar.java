package Rahulshetty;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import selenium.javascriptExecutor;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companion/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// grab commn attribute/ put into liat and iterate

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("form-field-travel_comp_date")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1000)");

		Thread.sleep(5000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();

		// here identifing the list of dates and iterate the list of dates
		// in calendar and then we can click the specific date in the calendar...

		// driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("September")
		while (!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("July")) {

			
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
			//driver.navigate().refresh();
			//driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		int count = driver.findElements(By.className("flatpickr-day")).size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();

			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				
				break;

			}
		}

	}

}
