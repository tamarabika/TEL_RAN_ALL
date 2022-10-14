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
public class QuandootestsTest {
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
  public void talehThai() {
    driver.get("https://www.quandoo.de/en/result?destination=berlin");
    driver.manage().window().setSize(new Dimension(1440, 876));
    js.executeScript("window.scrollTo(0,114)");
    js.executeScript("window.scrollTo(0,303)");
    {
      List<WebElement> elements = driver.findElements(By.linkText("Taleh Thai"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Taleh Thai")).click();
    js.executeScript("window.scrollTo(0,0)");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".c8ydyw-0"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void sigup() {
    driver.get("https://www.quandoo.de/en/result?destination=berlin");
    driver.manage().window().setSize(new Dimension(1440, 876));
    {
      List<WebElement> elements = driver.findElements(By.linkText("Sign up"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Sign up")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".iTacbz"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void relevance() {
    driver.get("https://www.quandoo.de/en/result?destination=berlin");
    driver.manage().window().setSize(new Dimension(1440, 876));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".sc-17n3422-1"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".sc-17n3422-1")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".NpmQM"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void showallCuisine() {
    driver.get("https://www.quandoo.de/en/result?destination=berlin");
    driver.manage().window().setSize(new Dimension(1440, 876));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ulye33-7"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".ulye33-7")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".ulye33-1:nth-child(2)"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void login() {
    driver.get("https://www.quandoo.de/en/result?destination=berlin");
    driver.manage().window().setSize(new Dimension(1440, 876));
    {
      List<WebElement> elements = driver.findElements(By.linkText("Log in"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Log in")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".iTacbz"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void () {
    driver.get("https://www.quandoo.de/en/result?destination=berlin");
    driver.manage().window().setSize(new Dimension(1440, 876));
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".sc-1vpjxqi-0 > b"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".sc-1vpjxqi-0 > b")).click();
    {
      List<WebElement> elements = driver.findElements(By.linkText("Deutsch"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Italiano")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("content-wrapper"));
      assert(elements.size() > 0);
    }
  }
}