package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	@Test(dataProvider = "loginCredentials")
	public void loginTest(String userName, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

	@DataProvider(name = "loginCredentials")
	public Object[][] loginData() {

		Object[][] data = new Object[2][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][1] = "Admin";
		data[1][2] = "admin12";

		return data;

	}

}
