package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends GeneralPageMethods {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    String urlHomePage = "https://www.eveonline.com/ru/signup?invc=3fd899a6-2f9f-4282-9c8c-10cc5485df48";

    @FindBy(className = "Typography__DynamicComponent-sc-1bolua0-0 izmaz")
    public WebElement mainTitle;

    public void openHomePage(){
        driver.get(urlHomePage);
        waitElementVisible(mainTitle);
     }
}
