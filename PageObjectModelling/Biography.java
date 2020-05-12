package Pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Biography{
	
	public static WebDriver driver;

	@BeforeTest
	public static void setUp() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.barnesandnoble.com/");
	}
	
	@Test
	public static void textValidation() {
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//button[@data-click='close']")).click();
		action.moveToElement(driver.findElement(By.xpath("//li[@id='topNav1']"))).build().perform();
		driver.findElement(By.xpath("//div[@class='nav-menu visibility-visible']//a[contains(text(),'Biography')]")).click();
		String text = driver.findElement(By.xpath("//body")).getText();
		Assert.assertEquals(text.contains("Biography"), true);
		Assert.assertEquals(text.contains("Bestsellers"), true);
		driver.close();
	}
}