package pages;

import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;

public class Chapter1 extends GeneralPageMethods {
    public Chapter1(WebDriver driver) {
        super(driver);
    }

    String urlregistr = "https://www.eveonline.com/ru/signup?invc=3fd899a6-2f9f-4282-9c8c-10cc5485df48";

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "agreedTerms")
    public WebElement agreedTerms;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement agreedButon;

    @FindBy(xpath = "//*[@id=\"c-right\"]/a\n")
    public WebElement cookieButon;

    @FindBy(className = "Download_download__mKClU")
    public WebElement NewUser;

    public void openUrl(){
        driver.get(urlregistr);
        waitElementVisible(email);
    }

    public void switchWindowHandele () {
        for (String windowHandle : driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
    }
    public boolean  waitForText (WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement until2 = wait.until(ExpectedConditions.visibilityOf(element));
        return false;
    }
    public void addCookies (String value) {

    }
    public void openThereg (int i) {
        int n = 2;
        i = 0;
        pages.Chapter1 chapter1;
        chapter1 = new Chapter1(driver);
        chapter1.openUrl();
        Cookie ck = new Cookie("name", "value");
        driver.manage().addCookie(ck);
        chapter1.email.sendKeys("evemadmax@gmail.com");
        chapter1.username.sendKeys("MadMaxTX" + n + i);
        chapter1.cookieButon.click();
        chapter1.password.sendKeys("15retuwS");
        chapter1.agreedTerms.click();
        chapter1.agreedButon.click();
        Assert.assertTrue(chapter1.checkElementExist(chapter1.NewUser));
    }
    public void cirklparam (){
        int i;
        for (i = 0; i < 9; i++){
            openThereg(i);
            }
    }

    }