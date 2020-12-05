package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chapter2 extends GeneralPageMethods{

    public Chapter2(WebDriver driver) {
        super(driver);
    }
    String urlChapter2 = "http://book.theautomatedtester.co.uk/chapter2";

    @FindBy(name = "but2")
    public WebElement but2;

    @FindBy(className = "mainheading")
    public WebElement mainheading;

    @FindBy(id = "but1")
    public WebElement but1;

    @FindBy(id = "random")
    public WebElement randombutton;

    @FindBy(xpath = "//*[@id=\"divontheleft\"]/input[2]")
    public WebElement siblingButton;

    @FindBy(xpath = "//*[@id=\"divinthecenter\"]/input[1]")
    public WebElement verifybutton;

    @FindBy(xpath = "//*[@id=\"divinthecenter\"]/input[1]")
    public WebElement chocolate;

    public void openChapter2(){
        driver.get(urlChapter2);
        waitElementVisible(mainheading);
    }

}