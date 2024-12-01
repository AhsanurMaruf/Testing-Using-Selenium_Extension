// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class NewTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void new() {
    driver.get("https://the-internet.herokuapp.com/login");
    driver.manage().window().setSize(new Dimension(642, 816));
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.cssSelector(".fa")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("fghhdjg");
    driver.findElement(By.cssSelector(".fa")).click();
    driver.findElement(By.cssSelector(".radius")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.cssSelector(".fa")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("hsdfhgds");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("hdhdghg");
    driver.findElement(By.cssSelector(".fa")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.cssSelector("em:nth-child(2)")).click();
    driver.findElement(By.cssSelector("em:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".subheader")).click();
    driver.findElement(By.cssSelector(".subheader")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword! ");
    driver.findElement(By.cssSelector(".radius")).click();
  }
}
