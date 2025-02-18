package elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class RegisterVerifyPageElements{

    public RegisterVerifyPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "div[data-bind*='html']")
    public static WebElement confirmationText;
}
