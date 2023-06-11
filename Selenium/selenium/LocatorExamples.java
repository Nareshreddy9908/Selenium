package selenium;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// url : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// name and class

		
	//	WebElement name = driver
		//		.findElement(By.xpath("//input[@class ='oxd-input oxd-input--active' and @name='username']"));
	//	name.sendKeys("Admin");
		
	//	driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		// name and class
		
				//WebElement password = driver
					//	.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='password']"));
				//password.sendKeys("admin12");
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin12");
		
		
		// xpath

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String expect =driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		System.out.println(expect);
		
		
		
		
		
		WebElement button=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
		button.click();
		
		////input[@placeholder='Username']
		//WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		//pass.sendKeys("Admin");
		
		////button[@type='submit']
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//links - if you want click the links by using "linkText or partial linktext"
	//	WebElement link =driver.findElement(By.linkText("OrangeHRM, Inc"));
	//	link.click();

	}

}
