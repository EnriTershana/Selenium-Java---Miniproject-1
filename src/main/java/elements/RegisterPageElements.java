package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class RegisterPageElements {

    public RegisterPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(id = "firstname")
    public static WebElement firstNameField;

    @FindBy(id = "lastname")
    public static WebElement lastNameField;

    @FindBy(id = "email_address")
    public static WebElement emailField;


    @FindBy(id = "password")
    public static WebElement passwordField;

    @FindBy(id = "password-confirmation")
    public static WebElement confirmPasswordField;

    @FindBy(css = "button.action.submit.primary")
    public static WebElement registerButton;

}
