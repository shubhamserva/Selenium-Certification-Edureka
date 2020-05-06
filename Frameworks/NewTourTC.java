package pageobjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewToursTC extends NewToursLogin {

	@Test
	public static void invalidUsernameTest() {
		driver.get("http://newtours.demoaut.com/");
		NewToursPage.login("baba", "mypass");
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}
	
	@Test
	public static void invalidPasswordTest() {
		driver.get("http://newtours.demoaut.com/");
		NewToursPage.login("baba", "mypass");
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}

	@Test
	public static void blankCredentialsTest() {
		driver.get("http://newtours.demoaut.com/");
		NewToursPage.login("", "");
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}
}