package selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class takeScreenShot {

	@Test
	public void capturescreenShot() throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("naresh031995@gmail.com");

		TakesScreenshot ts = (TakesScreenshot) driver;

		// Type -1 : File formate
		File source = ts.getScreenshotAs(OutputType.FILE);
		// screenshot captures the interms of file..

		// apache common io jar is required for the "fileutils" class.
		FileUtils.copyFile(source, new File("./screenshots/Image.png"));

		// Type -2 : base64 formate
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(base64);
		FileOutputStream fos = new FileOutputStream(new File("./screenshots/Image1.jpeg"));
		fos.write(byteArr);
		fos.close();

		// Type-3: BYTES formate

		byte[] byteArr1 = ts.getScreenshotAs(OutputType.BYTES);
		FileOutputStream fos1 = new FileOutputStream(new File("./screenshots/Image3.png"));
		fos1.write(byteArr1);
		fos1.close();

		System.out.println("ScreenShot taken...");

		driver.quit();
	}

}
