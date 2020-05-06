package module3_Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {
	
	public static WebDriver driver;
	
	@Test
	public static void facebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String url = "https://facebook.com";
		driver.get(url);
		
		driver.findElement(By.cssSelector("#email")).sendKeys("baba@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("mypass007");
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
		boolean actual = driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).isDisplayed();
		Assert.assertEquals(actual, true);;
	}
}