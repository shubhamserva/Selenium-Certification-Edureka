import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookValidation {
	
	public static WebDriver driver;
	
	@Test
	public static void facebookValidations() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String text = driver.findElement(By.xpath("//body")).getText();
		System.out.println(text);
		Assert.assertEquals(text.contains("itle is Facebook Log In or Sign Up"), true);
		Assert.assertEquals(text.contains("Facebook helps you connect and share with the people in your life."), true);
		Assert.assertEquals(text.contains("It's free and always will"), true);
		driver.close();
	}

}