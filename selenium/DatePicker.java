package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.redbus.in/");

		String year = "2023";
		String month = "May";
		String date = "26";

		driver.findElement(By.xpath("//text[text()='Date']")).click(); // opens the date picker

		while (true) {

			String monthyear = driver.findElement(By.xpath("//td[text()='May 2023']")).getText();

			String arr[] = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;

			else 

		driver.findElement(By.xpath("//td[@class='next']")).click();

	}
		//Date selection
		
		List<WebElement> allDates  =driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement ele : allDates) {
			String dt=ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
	}

}
meghanath
