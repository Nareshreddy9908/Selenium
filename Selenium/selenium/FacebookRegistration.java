package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg");
		driver.manage().window().maximize();
		
		WebElement name =driver.findElement(By.name("firstname"));
		name.sendKeys("naresh");
		
		WebElement lastname =driver.findElement(By.name("lastname"));
		lastname.sendKeys("Reddy");
		
		WebElement email =driver.findElement(By.name("reg_email__"));
		email.sendKeys("naresh031995@gmail.com");
		
		//click - it is used for many ways like 
		//Links, radio buttons, checkboxs
		
		//parent to child traversing
		
		WebElement checkbox =driver.findElement(By.xpath("//td[@class='q']/label/child::span[text()='Male']"));
		checkbox.click();
		
		// select class is used for handle the dropdowns
		
		WebElement day=driver.findElement(By.id("day"));
		Select sel1 = new Select(day);
		sel1.selectByValue("8");
		
		WebElement month=driver.findElement(By.id("month"));
		Select sel2= new Select(month);
		sel2.selectByVisibleText("Mar");
		
		//WebElement year=driver.findElement(By.id("year"));
		//Select sel3= new Select(year);
		//sel3.deselectByIndex(0);
		
		
		Thread.sleep(2000);
		
		//WebElement newpassword = driver.findElement(By.name("z ba bb"));
		WebElement newpass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newpass.sendKeys("Naresh@123");
		
		driver.findElement(By.name("submit")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
