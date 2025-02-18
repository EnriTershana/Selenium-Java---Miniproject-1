package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

public class LoggedInPageElements {
    public LoggedInPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(css = "li.authorization-link a[href*='customer/account/logout']")
    public static WebElement logOutButton;

    @FindBy(css = "button[class='action switch']")
    public static WebElement titleParent;

    @FindBy(css = "a[id='ui-id-4']")
    public static WebElement womenLink;

    @FindBy(css = "a[id='ui-id-9']")
    public WebElement topLink;

    @FindBy(css = "a[id='ui-id-11'")
    public WebElement jacketButton;

    @FindBy(css = "a.action.showcart")
    public WebElement shoppingCart;

    @FindBy(css ="a.action.viewcart" )
    public WebElement goToCheckout;

    @FindBy(css = "#shopping-cart-table tbody.cart.item:nth-of-type(1) .action-delete")
    public WebElement deleteFirstElement;


}
