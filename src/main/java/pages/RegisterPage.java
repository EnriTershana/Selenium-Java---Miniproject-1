package pages;

import elements.HomePageElements;
import elements.LoginPageElements;
import elements.RegisterPageElements;
import globals.Globals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseInformation;

import java.time.Duration;

public class RegisterPage {
    RegisterPageElements registerPageElements= new RegisterPageElements();

    public final WebDriver driver = BaseInformation.getDriver();

    public RegisterPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
        registerPageElements = new RegisterPageElements();
    }

    public void openRegisterForm(){

    }

    public void fillRegistrationForm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );

        registerPageElements.firstNameField.sendKeys("tershana");
        registerPageElements.lastNameField.sendKeys("tershanatest");
        registerPageElements.emailField.sendKeys("tershana@gmail.com");
        registerPageElements.passwordField.sendKeys("tershana1234-");
        registerPageElements.confirmPasswordField.sendKeys("tershana1234-");

        wait.until(ExpectedConditions.elementToBeClickable(registerPageElements.registerButton)).click();

    }

}