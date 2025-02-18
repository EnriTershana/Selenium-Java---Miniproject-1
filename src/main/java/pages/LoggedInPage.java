package pages;

import elements.LoggedInPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.BaseInformation;

import java.time.Duration;

public class LoggedInPage {
    private static final Logger log = LoggerFactory.getLogger(LoggedInPage.class);

    public LoggedInPage() {
        PageFactory.initElements(BaseInformation.getDriver(),this);
    }
    public final WebDriver driver = BaseInformation.getDriver();

    LoggedInPageElements loggedInPageElements = new LoggedInPageElements();

    public void VerifyAndLogout(){

       loggedInPageElements.titleParent.click();

        loggedInPageElements.logOutButton.click();

    }


    public void hoverOverJacket() {
        Actions actions = new Actions(driver);
        actions.moveToElement(loggedInPageElements.womenLink).build().perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        actions.moveToElement(loggedInPageElements.topLink).build().perform();

        loggedInPageElements.jacketButton.click();

    }

    public  void goToShopping(){
        loggedInPageElements.shoppingCart.click();
        loggedInPageElements.goToCheckout.click();
    }

    public  void deleteFirstElement(){
        loggedInPageElements.deleteFirstElement.click();
    }

}