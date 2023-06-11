package Rahulshetty;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// 1. count the links on the page..
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. count the links on footer section in a page/...
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. count the links of the first column in footer section and parent to child traverse
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columndriver.findElements(By.tagName("a")).size());
	
	//4. click on each link on the column and check if the pages are opening..
		// to open the links on separate tab or page...
	
	for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
		
		// The "Keys.chord()" method helps to press multiple keys simultaneously. 
		// It accepts the sequence of keys or strings as a parameter to the method.
		
		String clickonlinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		Thread.sleep(5000L);
		
	} // opens all the tabs
	
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it =abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	
	}


	}

