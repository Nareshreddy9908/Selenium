package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.findElement(By.id("name")).sendKeys("Hello");

		// there are 3 - ways we can identify the frames like id,index and name

		driver.switchTo().frame((WebElement) By.id("frm1"));

		//WebElement course=driver.findElement(By.id("course"));
		WebElement dropdown=driver.findElement(By.name("selectnav"));
		Select sel = new Select(dropdown);

		sel.selectByVisibleText("Telugu");
		
		Thread.sleep(3000);
		//back to mainpage..
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).sendKeys("world");
		
		
		

	}

}
