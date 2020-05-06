import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validate {
	
	public static WebDriver driver;

	@BeforeTest
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String url = "https://material.angular.io/components/checkbox/overview";
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	public static void validateCheckbox() {
		boolean checkboxEnabled = driver.findElement(By.xpath("//input[@id='mat-checkbox-1-input']")).isSelected();
		Assert.assertEquals(checkboxEnabled, true);
	}
	
	@Test
	public static void elementExists() {
		String url = "https://material.angular.io/components/datepicker/overview";
		driver.get(url);
		boolean elementExists = driver.findElement(By.xpath("//input[@id='mat-input-3']")).isDisplayed();
		Assert.assertEquals(elementExists, true);
	}
	
	@Test
	public static void textboxCheck() {
		boolean elementDisabled = driver.findElement(By.xpath("//select[@id='continents']")).isEnabled();
		Assert.assertEquals(elementDisabled, false);
	}

}