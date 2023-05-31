package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		// it will wait for sometime for calendar is visiable ,
		// after that we will perform the any actions on the calendar.

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(05));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));

		// capture monthyear value

		String monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyearval);

		String month = monthyearval.split(" ")[0].trim();
		String year = monthyearval.split(" ")[1].trim();

		while (!(month.equals("July") && year.equals("2023"))) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();

			monthyearval = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyearval);

			month = monthyearval.split(" ")[0].trim();
			year = monthyearval.split(" ")[1].trim();

		}
		driver.findElement(By.xpath("//a[text()='28']")).click();
	}

}


