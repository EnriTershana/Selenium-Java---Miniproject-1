import globals.Globals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.JacketPage;
import pages.LoggedInPage;
import pages.LoginPage;
import utilities.BaseInformation;

public class TestDeleteCart {

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
    public void goToShopping() throws InterruptedException{
        Thread.sleep(5000);
        loggedInPage.goToShopping();

    }

    @Test(dependsOnMethods = "goToShopping")
    public void deleteFirstElement() throws InterruptedException{
        Thread.sleep(3000);
        loggedInPage.deleteFirstElement();
    }

    @AfterTest
    public void terminate(){
        driver.quit();
    }


}
