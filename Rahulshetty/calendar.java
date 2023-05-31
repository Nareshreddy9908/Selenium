package Rahulshetty;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companion/");

		driver.findElement(By.id("form-field-travel_comp_date")).click();

		// day
		List<WebElement> dates = driver.findElements(By.className(".day"));

		int count = driver.findElements(By.className(".day")).size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.className(".day")).get(i).getText();

			if (text.equalsIgnoreCase("31"))
				driver.findElements(By.className(".day")).get(i).click();
			break;

		}

	}

}
