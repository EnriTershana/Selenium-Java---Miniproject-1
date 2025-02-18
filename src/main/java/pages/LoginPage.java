package pages;

import elements.HomePageElements;
import elements.LoginPageElements;
import globals.Globals;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BaseInformation.getDriver(),this);
    }

    LoginPageElements loginPageElements= new LoginPageElements();



    public void fillEmailField(){
        loginPageElements.LoginField.sendKeys(Globals.LoginUsername);
    }
    public void fillPasswordField(){
        loginPageElements.PasswordField.sendKeys(Globals.LoginPassword);
    }
    public void clickLoginButton(){
        loginPageElements.loginFormButton.click();
    }
}