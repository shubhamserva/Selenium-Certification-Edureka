import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contents {
	public static WebDriver driver;

	@BeforeTest
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void validateKeyboardActions() {
		String url = "https://material.angular.io/";
		driver.get(url);
		String text = driver.findElement(By.xpath("//body")).getText();
		Assert.assertEquals(text.contains("Sprint from Zero to App"), true);
		System.out.println("The text is" + text);
		driver.close();
	}
}