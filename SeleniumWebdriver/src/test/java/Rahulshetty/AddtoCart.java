package Rahulshetty;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart {

	int j = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// this wait is used for globally and used for every element wait for sometime to every elemtnt.
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String[] ItemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

		//Thread.sleep(2000);

		/*
		 * //identifying the list of products and then identify the specific product and
		 * adding to the Cart... //convert the array into arraylist for easy process
		 * //check weather name is extracted is present in arraylist or not..
		 * 
		 * //formate it to get the actual variable name...
		 */
		// List<WebElement>
		// products=driver.findElements(By.xpath("//h4[@class='product-name']"));

		addItems(driver, ItemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//explicit wait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] ItemsNeeded) {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// Brocolli - 1 Kg
			// Brocolli, 1 Kg
			String[] name = products.get(i).getText().split("-");
			// name[0] - Brocolli
			// name[1] - 1 Kg
			// trim is used for remove the specaes between the before and after of the
			// String
			String formateedName = name[0].trim();
			List ItemsNeededList = Arrays.asList(ItemsNeeded);

			if (ItemsNeededList.contains(formateedName)) {

				j++;
				// driver.findElement(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == ItemsNeeded.length) {
					break;
				}

			}
		}
	}
}
