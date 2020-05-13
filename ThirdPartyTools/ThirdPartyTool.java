package ThirdPartyTools;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ThirdPartyTool {
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\Shubham\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String baseUrl = "https://www.last.fm/music/+free-music-downloads";
		driver.get(baseUrl);
		WebElement downloadButton = driver.findElement(By.class("chartlist-download-button"));
		String sourceLocation = downloadButton.getAttribute("href");
		
		//Using third party tool - wget to use custom location.

		String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

		try {

			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
		} catch (InterruptedException | IOException ex) 
		{
			System.out.println(ex.toString());
		}
		driver.close();
	}

}