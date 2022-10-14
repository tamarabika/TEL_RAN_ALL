package myTest;

import myTest.pages.HomePage;
import myTest.pages.RestaurantPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class BaseTest contains methods that initialize common settings
 */


public abstract class BaseTest {

    protected WebDriver driver;
    protected RestaurantPage restaurantPage;
    protected HomePage homePage;

    public BaseTest(WebDriver driver) {

    }

    /**
     * this method initializes common settings
     */
    @Before
    public void initialSetUp() {
        System.setProperty("webdriver.chrome.driver", "\"webdriver.chrome.driver\",\"/Users/mariposamariposa/Desktop/drivers\"");
        driver = new ChromeDriver();
        restaurantPage = new RestaurantPage(driver);
        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}


