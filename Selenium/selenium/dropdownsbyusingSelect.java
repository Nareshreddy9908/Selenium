package selenium;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdownsbyusingSelect {

	// whether we will check data is ascending or descending order of a dropdown
	// values ,
	// sometimes data is required in some formting orders.

	@org.testng.annotations.Test
	public void selectDDValues() {

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Select tools = new Select(driver.findElement(By.id("tools")));

		// here creating the empty list and once retriving the all dropdown values and
		// add to the "actuallist"
		List actuallist = new ArrayList();

		List<WebElement> myTools = tools.getOptions(); // return all options from dropdown

		for (WebElement ele : myTools) { // iterate the dropdowns 
			String data = ele.getText(); // iterate and retrive the dropdowns and store in value.
			actuallist.add(data); // here adding the all values into "actuallist" array..

		}
		// here we can adding all values into temp list and then we can sort the values.
		List temp = new ArrayList();
		temp.add(actuallist);

		// Ascending order
		Collections.sort(temp);
		Assert.assertTrue(actuallist.equals(temp));

	}
}
