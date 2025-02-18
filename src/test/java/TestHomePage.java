import elements.HomePageElements;
import globals.Globals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.BaseInformation;

public class TestHomePage {

    private final WebDriver driver = BaseInformation.getDriver();
    HomePage homePage = new HomePage();
    @BeforeTest
    public void setup(){
       driver.get(Globals.homePageUrl);

    }
    @Test
    public void testLoginButton(){
        homePage.clickLoginButton();
    }
    @AfterTest
    public void termniate(){
        driver.quit();
    }


}
