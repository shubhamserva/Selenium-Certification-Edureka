package pageobjects;

import org.openqa.selenium.By;

public class FacebookLogin extends Home{

	public static void login(String username, String password) {

		driver.findElement(By.cssSelector("#email")).sendKeys(username);
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
	}
}