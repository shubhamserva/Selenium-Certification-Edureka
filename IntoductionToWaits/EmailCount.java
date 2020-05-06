
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmailCount {
public static WebDriver driver;
	
	@Test
	public static void mailCount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("baba@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath(".//*[@id='password']//input[@name='password']")).sendKeys("mypass007");
		driver.findElement(By.id("passwordNext")).click();	
		String count = driver.findElement(By.xpath("//div[@id=':13o']//span[@class='ts']")).getText();
		System.out.println("Number of emails are "+ Integer.parseInt(count));
 }
}