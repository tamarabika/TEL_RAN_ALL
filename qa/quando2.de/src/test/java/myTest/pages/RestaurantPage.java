package myTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class RestaurantPage contains restaurant page locators and methods
 */
public class RestaurantPage extends Page {

    /**
     * test constants
     */
    public static String RESTAURANT_URL = BASE_URL + "/en/place/cavallino-rosso-306";
    public static String TEXT_PHOTOS_OF = "Photos of";
    public static String TEXT_MENU_FROM = "Menu from";
    public static String TEXT_COMPLETE_YOUR_RESERVATION = "Complete your reservation";
    public static String TEXT_REVIEWS_OF = "Reviews of";

    /**
     * Constructor injecting the WebDriver interface
     *
     * @param driver
     */
    public RestaurantPage(WebDriver driver) {
        super(driver);
    }

    // locators
    @FindBy(xpath = "//*[@data-qa='sub-nav-tab-tab-photos']")
    static WebElement photosBtn;

    @FindBy(xpath = "//*[@data-qa='sub-nav-tab-tab-menu']")
    static WebElement menuBtn;

    @FindBy(xpath = "//*[@data-qa='reservation-tab']")
    static WebElement reserveNowBtn;

    @FindBy(xpath = "//*[@data-qa='sub-nav-tab-tab-reviews']")
    static WebElement reviewsBtn;

    @FindBy(xpath = "//*[@data-qa='sub-nav-tab-tab-photos']/div/h2")
    static WebElement textAbovePhotosBtn;

    @FindBy(xpath = "//*[@id='content']/div/div/h2")
    static WebElement textAboveMenuBtn;

    @FindBy(xpath = "//*[@data-qa='checkout-title']")
    static WebElement reserveNowBtnText;

    @FindBy(xpath = "//div[3]/div/div/h2")
    static WebElement textAboveReviewsBtn;

    /**
     * this method makes a click on the photo button locator
     */
    public void clickOnPhotosBtn() throws InterruptedException {
        photosBtn.click();
        Thread.sleep(5000);
    }

    /**
     * this method makes a click on the menu button locator
     */
    public void clickOnMenuBtn() throws InterruptedException {
        menuBtn.click();
        Thread.sleep(5000);
    }

    /**
     * this method makes a click on the reserveNow button locator
     */
    public void clickOnReserveNowBtn() throws InterruptedException {
        Thread.sleep(5000);
        reserveNowBtn.click();
    }

    /**
     * this method makes a click on the reviews button locator
     */
    public void clickOnReviewsBtn() throws InterruptedException {
        Thread.sleep(5000);
        reviewsBtn.click();
    }

    /**
     * this method gets text from the text above photos button locator
     */
    public String getTextAbovePhoto() throws InterruptedException {
        Thread.sleep(4000);
        return textAbovePhotosBtn.getText();
    }

    /**
     * this method gets text from the text above menu button locator
     */
    public String getTextAboveMenu() throws InterruptedException {
        Thread.sleep(4000);
        return textAboveMenuBtn.getText();
    }

    /**
     * this method gets text from the reserveNow button text locator
     */
    public String getReserveNowText() throws InterruptedException {
        Thread.sleep(4000);
        return reserveNowBtnText.getText();
    }

    /**
     * this method gets text from the text above reviews button locator
     */
    public String getTextAboveReviews() throws InterruptedException {
        Thread.sleep(5000);
        return textAboveReviewsBtn.getText();
    }

}




