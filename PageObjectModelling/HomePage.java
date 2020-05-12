package Pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class HomePage {
	
		public static WebDriver driver;
				
		@BeforeTest
		public void setUp() throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@AfterTest
		public void tearDown() {
			driver.close();
		}
}