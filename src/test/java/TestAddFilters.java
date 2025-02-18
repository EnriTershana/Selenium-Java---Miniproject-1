import globals.Globals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import utilities.BaseInformation;

public class TestAddFilters {

    private final WebDriver driver = BaseInformation.getDriver();
    LoginPage loginPage = new LoginPage();
    TestHomePage testHomePage = new TestHomePage();
    JacketPage jacketPage = new JacketPage();
    LoggedInPage loggedInPage= new LoggedInPage();
    @BeforeTest
    public void setup(){
        driver.get(Globals.homePageUrl);

    }
    @Test
    public void testLoginProccess() throws InterruptedException {
        testHomePage.testLoginButton();
        Thread.sleep(1000);
        loginPage.fillEmailField();
        loginPage.fillPasswordField();;
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "testLoginProccess")
    public void continueJacket() throws InterruptedException{

        loggedInPage.hoverOverJacket();

    }

    @Test(dependsOnMethods = "continueJacket")
    public void sortPrice() throws InterruptedException{
        Thread.sleep(2000);
        jacketPage.selectPrice();
    }

    @Test(dependsOnMethods = "sortPrice")
    public void sortColor() throws InterruptedException{
        Thread.sleep(2000);
        jacketPage.selectColor();
    }


    @AfterTest
    public void termniate(){
        driver.quit();
    }


}
