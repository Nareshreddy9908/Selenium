package Rahulshetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// identifing the from to To place booking the flight tickets in site...
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		// select the "From" Destination city in dropdown
		//Here "From" is stored in the 0th- position
		// Here "To" is stored in the 1st -position 
		//while identifing the "To" dropdown we will giving the position of the "To",
		//otherwise we will "Element not visiable Exception"
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//parent to child traverse of source 
		//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		Thread.sleep(2000);
		
		//select the "To" destination city in dropdown
		
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		//parent to child traverse of destination
		// Avoid the indexes , we can using the parent to child relationships
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']
		
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
	}

}
