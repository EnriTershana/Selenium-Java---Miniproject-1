import globals.Globals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterVerifyPage;
import utilities.BaseInformation;


public class TestRegisterPage {
    private final WebDriver driver = BaseInformation.getDriver();
    RegisterPage registerPage = new RegisterPage();
    HomePage testHomePage = new HomePage();
    RegisterVerifyPage registerVerifyPage = new RegisterVerifyPage();

    @BeforeTest
    public void setup(){
        driver.get(Globals.homePageUrl);

    }

    @Test
    public void openRegisterPage() throws InterruptedException {
        testHomePage.clickRegisterButton();
        Thread.sleep(3000);

    }

    @Test(dependsOnMethods = "openRegisterPage")
    public void testRegisterPage() throws InterruptedException {
        registerPage.fillRegistrationForm();
    }

    @Test(dependsOnMethods = "testRegisterPage")
    public void testconfirmation() throws InterruptedException {
        registerVerifyPage.confirmRegistration();
    }

    @AfterTest
    public void termniate(){
        driver.quit();
    }

}
