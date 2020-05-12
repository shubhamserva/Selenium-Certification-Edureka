package Pom;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends HomePage{
	
	@Test
	public static void loginTest() {
		Page.login();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		System.out.println("Login successful !");
	}
}