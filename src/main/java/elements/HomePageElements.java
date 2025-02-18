package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class HomePageElements {

    public HomePageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);


    }

    @FindBy(css = "li.authorization-link a")
    public WebElement loginButton;

    @FindBy(css = "ul.header.links > li:last-of-type")

    public WebElement registerButton;


}
