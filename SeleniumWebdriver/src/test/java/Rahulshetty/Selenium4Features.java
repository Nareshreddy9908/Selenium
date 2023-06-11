package Rahulshetty;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Features {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// it will opening the empty new tab
		// driver.switchTo().newWindow(WindowType.TAB);

		// it will opening new empty window
		driver.switchTo().newWindow(WindowType.WINDOW);

		// here all window id's are stored by getwindowhandles..
		Set<String> handles = driver.getWindowHandles();
		// here pointing to the first window id
		Iterator<String> it = handles.iterator();
		String parentwindowId = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		Thread.sleep(4000);
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(9000);
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(3).getText();

		driver.switchTo().window(parentwindowId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(course);

		// if you want take screenshot for specific element in selenium 4 using below
		// codes

		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		// get height and width
		
		System.out.println(name.getRect().getDimension().getWidth());
		System.out.println(name.getRect().getDimension().getHeight());

		// driver.quit();

	}

}
