package pages;


import elements.RegisterVerifyPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseInformation;
import org.junit.Assert;

import java.time.Duration;

public class RegisterVerifyPage {
    private RegisterVerifyPageElements registerVerifyPageElements;

    public final WebDriver driver = BaseInformation.getDriver();

    public RegisterVerifyPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
        registerVerifyPageElements = new RegisterVerifyPageElements();
    }

    public void confirmRegistration() {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));

        String actualText = registerVerifyPageElements.confirmationText.getText();
        String expectedText= "Thank you for registering with Main Website Store.";


        Assert.assertEquals(expectedText, actualText);
    }

}
