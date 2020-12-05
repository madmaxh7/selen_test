package tests;

import general.DriverSetUp;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class OpenThePageTestIT extends DriverSetUp {
    WebDriver driver;

    @Before
    public void startTest(){
        driver = setUpDriver();
    }

    @Test
    public void openTheHomePage(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        Assert.assertTrue(homePage.checkElementExist(homePage.mainTitle));
    }

    @After
    public void closeDriver(){
        quitDriver();
    }
}
