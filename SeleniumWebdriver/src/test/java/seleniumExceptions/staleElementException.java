package seleniumExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElementException {

	// Stale means old ,delayed, no-longer available on the webpage at that we get
	// "StaeleException"
	// handle - try-catch , refresh the page......

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement link = driver.findElement(By.xpath("//a[text()='Online Training']"));
		link.click();

		driver.navigate().back();
		Thread.sleep(3000);
//link.click() // here getiing the staleelement exception that's reson we putting the code in try -catch block
		try {
			link.click();
		} catch (StaleElementReferenceException e) {
			link = driver.findElement(By.xpath("//a[text()='Online Training']"));
			link.click();

		}

	}

}
