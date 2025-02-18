package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class LoginPageElements {

    public LoginPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement LoginField;

    @FindBy(id = "pass")
    public WebElement PasswordField;

    @FindBy(css = "button[id='send2']")
    public WebElement loginFormButton;

}