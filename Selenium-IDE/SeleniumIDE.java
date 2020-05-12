package Module2;
 
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import com.gargoylesoftware.htmlunit.javascript.host.URL;
 
public class SeleniumIDE {
 
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
 
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   
System.setProperty("webdriver.gecko.driver","src/geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://www.newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
 
  @Test
  public void test1Module3() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("baba");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("mypass007");
    driver.findElement(By.name("login")).click();
    try {
      assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("SIGN-OFF")).click();
    try {
      assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Home")).click();
  }
 
  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}