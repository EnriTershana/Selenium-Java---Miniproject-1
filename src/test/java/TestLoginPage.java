import elements.HomePageElements;
import globals.Globals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoggedInPage;
import pages.LoginPage;
import utilities.BaseInformation;

public class TestLoginPage {

    private final WebDriver driver = BaseInformation.getDriver();
    LoginPage loginPage = new LoginPage();
    TestHomePage testHomePage = new TestHomePage();
    LoggedInPage loggedInPage = new LoggedInPage();
    @BeforeTest
    public void setup(){
        driver.get(Globals.homePageUrl);

    }
    @Test
    public void testLoginProccess() throws InterruptedException {
        testHomePage.testLoginButton();
        Thread.sleep(3000);
        loginPage.fillEmailField();
        loginPage.fillPasswordField();;
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "testLoginProccess")
    public void verifyLoginText() throws InterruptedException{
        loggedInPage.VerifyAndLogout();
    }

    @AfterTest
    public void termniate(){
        driver.quit();
    }
}