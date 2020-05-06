
package Module3_Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
	public static WebDriver driver;
	
	@Test
	public static void navigation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String url = "https://google.com";
		driver.get(url);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("yy");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test");
		driver.navigate().refresh();
		driver.navigate().back();
	}
}