
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	public static WebDriver driver;
	public static int flag = 0;
	@Test
	public static void facebookValidations() throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		java.util.List<WebElement> elements = driver
				.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li//a"));

		int size = elements.size();
		System.out.println("Total number of links "+ size);
		for (int i = 0; i < size; i++) {	
			System.out.println(elements.get(i).getText());
			String url = elements.get(i).getAttribute("href");
			System.out.println("URL: "+ url);
			isLinkBroken(url);
		}
		System.out.println("Total number of working links "+ (size - flag));
		System.out.println("Total number of broken links "+ flag);
		driver.close();
	}

	public static void isLinkBroken(String url) throws MalformedURLException, IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	//	connection.setRequestMethod("HEAD");
		connection.connect();
		int respcode = connection.getResponseCode();

		if (respcode > 400) {
			System.out.println("Url link is broken");
			flag++;
		} else {
			System.out.println("Url link is working");
		}
	}
}