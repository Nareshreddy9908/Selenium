package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Firefoxdriver url : https://github.com/mozilla/geckodriver/releases
		
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//url :  https://learn-automation.com/
		
		driver.get("https://learn-automation.com/");
		
		driver.manage().window().maximize();

	}

}
