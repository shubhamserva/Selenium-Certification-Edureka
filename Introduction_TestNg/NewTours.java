import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours {

	public static WebDriver driver;

	@BeforeTest
	public static void setUp() throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public static void ScreenshotTest() throws IOException {

		takeScreenshot();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		takeScreenshot();

		driver.findElement(By.xpath("//input[@value='oneway']"));
		Select s1 = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		s1.selectByValue("3");
		Select s2 = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		s2.selectByValue("Frankfurt");
		Select s3 = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		s3.selectByValue("3");
		Select s4 = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		s4.selectByValue("5");
		Select s5 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		s5.selectByValue("Paris");
		Select s6 = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		s6.selectByValue("8");
		Select s7 = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		s7.selectByValue("6");

		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select s8 = new Select(driver.findElement(By.name("airline")));
		s8.selectByVisibleText("Pangea Airlines");

		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ITINERARY')]")).click();

		driver.findElement(By.xpath("//b[contains(text(),'Unified Airlines 363')]")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		takeScreenshot();

		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Baba");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Ram");
		driver.findElement(By.xpath("//select[@name='pass.0.meal']")).getText().equals("Hindu");
		driver.findElement(By.xpath("//select[@name='creditCard']")).getText().equals("Visa");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("4543 1212 99999 0000");
		driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")).getText().equals("04");
		driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")).getText().equals("2020");
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Baba");
		driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Singh ");
		driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("441, 32nd St");
		driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("Paris");
		driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("Paris deptt.");
		driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys("56432");
		driver.findElement(By.xpath("//tbody//tr[14]//td[2]//input[1]")).click()
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		takeScreenshot();
		
		driver.close();
	}

	public static void takeScreenshot() throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C://Users//Shubham//Screenshots//test.png");
		FileUtils.copyFile(srcFile, destFile);
	}
}