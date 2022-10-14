package myTest;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.List;

import static myTest.pages.RestaurantPage.RESTAURANT_URL;

/**
 * Class FunctionalTest contains tests for the https://www.quandoo.de/en/
 */
public class FunctionalTest extends BaseTest {
    public FunctionalTest(WebDriver driver) {
        super(driver);
    }


   /* private WebDriver driver;
   private Map<String, Object> vars;
    JavascriptExecutor js;*/

    @Before
    public void setUp() {

        driver.get("https://www.quandoo.de/en/result?destination=berlin");
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();

        driver.get(RESTAURANT_URL);
        driver.manage().window().setSize(new Dimension(1200, 997));
        restaurantPage.clickAcceptCookiesButton();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void clickOnTheSingUpButton() {


        {
            List<WebElement> elements = driver.findElements(By.linkText("Sign up"));
            assert (elements.size() > 0);
        }
        //driver.findElement(By.linkText("Sign up")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".iTacbz"));
            assert (elements.size() > 0);
        }
    }

    @Test
    public void clickOnTheRelevanceDropDown() {

        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".sc-17n3422-1"));
            assert (elements.size() > 0);
        }
      //  driver.findElement(By.cssSelector(".sc-17n3422-1")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".NpmQM"));
            assert (elements.size() > 0);
        }
    }

    @Test
    public void clickOnShowAllInCuisineSection() {

        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".ulye33-7"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".ulye33-7")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".ulye33-1:nth-child(2)"));
            assert (elements.size() > 0);
        }
    }


    @Test
    public void clickOnShowLessInCuisineSection() {

        JavascriptExecutor js = null;

        js.executeScript("window.scrollTo(0,115)");
        driver.findElement(By.cssSelector(".ulye33-7")).click();
        js.executeScript("window.scrollTo(0,299)");
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".ulye33-7"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".ulye33-7")).click();
        driver.findElement(By.cssSelector(".ulye33-1:nth-child(1) .apti0f-5")).click();
        driver.findElement(By.cssSelector(".ulye33-1:nth-child(2) > .ulye33-2")).click();
        driver.findElement(By.cssSelector(".ulye33-1:nth-child(3) .apti0f-5")).click();
        js.executeScript("window.scrollTo(0,137)");
        driver.findElement(By.cssSelector(".ulye33-1:nth-child(4) .apti0f-5")).click();
        driver.findElement(By.cssSelector(".ulye33-1:nth-child(5) .apti0f-5")).click();
        driver.findElement(By.cssSelector(".ulye33-1:nth-child(6) .apti0f-5")).click();
    }


    @Test
    public void checkLogInButton() {

        {
            List<WebElement> elements = driver.findElements(By.linkText("Log in"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.linkText("Log in")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".iTacbz"));
            assert (elements.size() > 0);
        }
    }
}



