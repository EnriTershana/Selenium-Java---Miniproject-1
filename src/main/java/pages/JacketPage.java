package pages;

import elements.JacketsPageElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseInformation;

import java.time.Duration;
import java.util.List;
import static elements.JacketsPageElements.*;
import static org.junit.Assert.assertEquals;

public class JacketPage {
    public JacketPage() {
        PageFactory.initElements(BaseInformation.getDriver(), this);
    }

    JacketsPageElements jacketsPageElements = new JacketsPageElements();
    public final WebDriver driver = BaseInformation.getDriver();


    public void selectPrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jacketsPageElements.orderDropdown.click();

        jacketsPageElements.itemWithPriceRange.click();

    }


    public void selectColor() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jacketsPageElements.orderDropdownColor.click();

        jacketsPageElements.itemWithColorRange.click();

    }

    public void removePrice() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        jacketsPageElements.removePriceButton.click();


    }


    public void addToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Click XS size for the first product
        firstProductXSSize.click();
        // Click Red color for the first product
        firstProductRedColor.click();


        // Add first product to the cart
        firstProductAddToCartButton.click();




    }
    public void addToCart2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //  Click XS size for the second product
        secondProductXSSize.click();
        // Click Red color for the second product
        secondProductRedColor.click();
        // Add second product to the cart
        secondProductAddToCartButton.click();
    }
}






