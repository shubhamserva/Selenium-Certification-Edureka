package Pom;

import org.openqa.selenium.By;

public class Page extends HomePage{

	public static void login() {

		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("baba");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mypass");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}