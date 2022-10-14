package quandoo2.de;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.support.PageFactory;

import quandoo2.de.pages.HomePage;

public class SampleJUnitTest extends JUnitTestBase {

  private HomePage homepage;

  @Before
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
