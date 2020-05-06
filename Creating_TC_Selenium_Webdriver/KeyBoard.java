import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Keyboard {
	public static WebDriver driver;

	@BeforeTest
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void validateKeyboardActions() {
		String url = "https://material.angular.io/components/datepicker/overview";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL.PAGE_UP);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL, "a");
		driver.close();
	}

}