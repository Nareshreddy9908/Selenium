package selenium;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// A broken link is a link on website ,that is no-longer accessiable or exists
		// on website.

		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.err.println(links.size());

		for (WebElement link : links) {
			String linkURL = link.getAttribute("href");

			URL url = new URL(linkURL);
// urlcoonection - by using this open the connection
			URLConnection urlconnection = url.openConnection();

			// Httpurlconnection using we can send the request to the server.
			// urlconnection is converted into httpurlconnection object..
			// httpurlconnection is a abstract class
			

			HttpsURLConnection httpurlconnect = (HttpsURLConnection) urlconnection;
			httpurlconnect.setConnectTimeout(3000);
			httpurlconnect.connect();

			if (httpurlconnect.getResponseCode() == 200) {

				System.out.println(linkURL + " - " + httpurlconnect.getResponseMessage());
			} else {
				System.err.println(
						linkURL + "-" + httpurlconnect.getResponseCode() + " - " + httpurlconnect.getResponseMessage());

				httpurlconnect.disconnect();

			}

		}

	}
}
