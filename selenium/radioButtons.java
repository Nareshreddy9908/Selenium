package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// url :
		// http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// //input[@name='lang' and @type='radio' ] - here identify the list dropdowns

		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio' ]"));

		for (int i = 0; i < radio.size(); i++) {

			WebElement local_radio = radio.get(i); // retrive the buttons from radio reference variable one by one

			String value = local_radio.getAttribute("value"); // return the particular value from the reference variable

			System.out.println("The values from radio buttons are :" + value);

			if (value.equals("JAVA")) {
				local_radio.click();
			}

		}

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < checkbox.size(); i++) {
			WebElement ele = checkbox.get(i);
			String id = ele.getAttribute("id");

			if (id.equalsIgnoreCase("code")) {
				ele.click();
				break;
			}

		}

	}

}
