import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupandLoginPage;

public class RegisterNewUserTest extends BaseTest {
    HomePage homepage;
    SignupandLoginPage signuppage;

    //Verify that home page is visible successfully Take screenshot
    @Test
    public void registerNewUser() {
        //Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        homepage = new HomePage(driver);
        signuppage = new SignupandLoginPage(driver);
        //Click on 'Signup / Login' button
        homepage.clickSignUp();
        //Verify 'New User Signup!' is visible
        String verificationmessage = signuppage.verifyMessage();
        Assert.assertEquals(verificationmessage, "New User Signup!");

        //Enter name and email address
        signuppage.enterNameandEmail();
        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        signuppage.enterAccountinfo();
        //Fill details: Title, Name, Email, Password, Date of birth
        signuppage.enterAddressinfo();
        //Verify that 'ACCOUNT CREATED!' is visible
        String successMessage = signuppage.clickCreateAccount();
        Assert.assertEquals(successMessage, "ACCOUNT CREATED!");
        //Click 'Continue' button
        signuppage.clickContinue();
/*
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
*/
        signuppage.deleteAccount();
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
