import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupandLoginPage;

public class RegisterNewUserTest extends BaseTest {
    HomePage homepage;
    SignupandLoginPage signuppage;
     //homepage = new HomePage(driver);
     // signuppage = new SignupandLoginPage(driver);  threw error here!
    String url = "http://automationexercise.com";

    //Verify that home page is visible successfully Take screenshot
    @Test
    public void registerNewUser() {
       driver.get(url);
        homepage = new HomePage(driver);
        signuppage = new SignupandLoginPage(driver);
        homepage.clickSignUp();
        //Verify 'New User Signup!' is visible
        String verificationmessage = signuppage.verifyMessage();
        Assert.assertEquals(verificationmessage, "New User Signup!");

        //Enter name and email address
        signuppage.enterNameandEmail();
        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        signuppage.enterAccountinfo();
        signuppage.enterDOB();
        signuppage.selectNewsletterandSpecialOffer();
        signuppage.enterAddressinfo();
        signuppage.clickCreateAccount();
        //Verify that 'ACCOUNT CREATED!' is visible
        //String successMessage = signuppage.clickCreateAccount();
       // Assert.assertEquals(successMessage, "ACCOUNT CREATED!");
        //Click 'Continue' button
        signuppage.clickContinue();
/*
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
*/
        String finalMessage = signuppage.deleteAccount();
        Assert.assertEquals(finalMessage,"DELETED");
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
