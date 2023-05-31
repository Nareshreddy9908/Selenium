package selenium;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// clt+shift+/ for comment the multiple lines of code
		//clt+shift+\ for uncomment the multiple lines of code..
		
		
		
		/*
		 * driver.get("https://www.google.com");
		 * 
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("alert('welcome To Java')");
		 */
		 
		driver.get("https://login.yahoo.com/");
		
	
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		//sendkeys 	
		//WebElement element =driver.findElement(By.id("login-username"));
		WebElement ele =driver.findElement(By.name("username"));
		js1.executeScript("arguments[0].value='naresh031995@gmail.com'",ele);
		
		
		  //js1.executeScript("arguments[0].value=arguments[1]",ele,
		//  "naresh031995@gmail.com"); Thread.sleep(3000); // Type -1 : click the
		  //checkbox 
		  
		  WebElement checkbox
		  =driver.findElement(By.xpath("//label[@for='persistent']"));
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click()",checkbox);
		 
		 
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("document.getElementById('persistent').click()");
		 */
		
		//Type-2 : click the checkbox
		
		//click the submit button
		//WebElement checkbox =driver.findElement(By.id("persistent"));
		/*
		 * WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		 * js1.executeScript("arguments[0].click()",submit);
		 */
		
		
		/*
		 * driver.get("https://jqueryui.com/");
		 * 
		 * Thread.sleep(3000); JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 * js.executeScript("scroll(0,400)");
		 */
		
		
		
	}

}
