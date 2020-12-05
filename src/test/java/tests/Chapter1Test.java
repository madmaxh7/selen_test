package tests;

import general.DriverSetUp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Chapter1Test extends DriverSetUp{
        WebDriver driver;
        @Before
        public void startTest(){
            driver = setUpDriver();
        }

        @Test
        public void openThereg2 () {
            pages.Chapter1 chapter1 = new pages.Chapter1(driver);
            chapter1.cirklparam();
        }
    }
