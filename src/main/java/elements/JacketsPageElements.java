package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseInformation;

import java.util.List;

public class JacketsPageElements {

    public JacketsPageElements(){
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class, 'filter-options-title') and contains(text(), 'Price')]")
    public static WebElement orderDropdown;

    @FindBy(xpath = "//li[contains(@class, 'item') and .//span[contains(@class, 'price') and (contains(text(), '$50.00') or contains(text(), '$59.99'))]]")
    public static WebElement itemWithPriceRange;

    @FindBy(xpath = "//div[contains(@class, 'filter-options-title') and contains(text(), 'Color')]")
    public static WebElement orderDropdownColor;

    @FindBy(xpath = "//a[@aria-label='Red']//div[contains(@class, 'swatch-option') and @style='background: #ff0000 no-repeat center; background-size: initial;']")
    public static WebElement itemWithColorRange;

    @FindBy(xpath = "//li[.//span[text()='Price']]//a[contains(@class, 'action remove') and contains(@title, 'Remove Price')]")
    public static WebElement removePriceButton;

    @FindBy(xpath = "//ol[contains(@class, 'products list items product-items')]//li[1]")
    public static WebElement firstProduct;

    @FindBy(xpath = "//ol[contains(@class, 'products list items product-items')]//li[2]")
    public static WebElement secondProduct;



    // Select the XS size option
    @FindBy(xpath = "(//li[contains(@class, 'item product product-item')]//div[@aria-label='Size']//div[text()='XS'])[1]")
    public static WebElement firstProductXSSize;

    // Select the Red color option
    @FindBy(xpath = "(//li[contains(@class, 'item product product-item')]//div[@aria-label='Color']//div[@aria-label='Red'])[1]")
    public static WebElement firstProductRedColor;

    // Add to cart button for the first product
    @FindBy(xpath = "(//li[contains(@class, 'item product product-item')]//button[@title='Add to Cart'])[1]")
    public static WebElement firstProductAddToCartButton;


    // Select the XS size option
    @FindBy(xpath = "(//li[contains(@class, 'item product product-item')]//div[@aria-label='Size']//div[text()='S'])[4]")
    public static WebElement secondProductXSSize;

    // Select the Red color option
    @FindBy(xpath = "(//li[contains(@class, 'item product product-item')]//div[@aria-label='Color']//div[@aria-label='Red'])[4]")
    public static WebElement secondProductRedColor;

    // Add to cart button for the second product
    @FindBy(xpath = "(//li[contains(@class, 'item product product-item')]//button[@title='Add to Cart'])[4]")
    public static WebElement secondProductAddToCartButton;


}
