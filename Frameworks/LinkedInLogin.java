package pageobjects;
import org.openqa.selenium.By;

public class LinkedInPage extends Home
{

	public static void login(String username, String password) {

		driver.findElement(By.xpath("//input[@name='session_key']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='sign-in-form__submit-btn']")).click();
	}
}