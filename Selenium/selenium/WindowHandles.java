package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		// it will store the only parentwindow id
		String parentwindow = driver.getWindowHandle();
		System.out.println("The parentwindow is:" + parentwindow + driver.getTitle());

		driver.findElement(By.id("newWindowBtn")).click();

		// it will store all parent and child window id's

		// here set using , set will store only constant ids and not allowed the
		// duplicates ,
		// here window id's are not duplicating...

		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowhandle : windowHandles)

		{
			if (!windowhandle.contentEquals(parentwindow)) {
				driver.switchTo().window(windowhandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Naresh");
				Thread.sleep(3000);
				driver.close();
			}

			//System.out.println("The windowhandle:" + windowhandle + driver.getTitle());
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("Reddy");
		Thread.sleep(2000);
		// driver.close();

		driver.quit();

	}

}
