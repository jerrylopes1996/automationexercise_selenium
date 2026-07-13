import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupandLoginPage;

public class RegisterNewUserTest extends BaseTest {
   // WebDriver driver;
    HomePage homepage;
    SignupandLoginPage signuppage;


    //Navigate to url 'http://automationexercise.com'
    //Verify that home page is visible successfully Take screenshot
    @Test
    public void registerNewUser() {
        //Click on 'Signup / Login' button
        homepage = new HomePage(driver);
        signuppage = new SignupandLoginPage(driver);
        homepage.clickSignUp();
        //Verify 'New User Signup!' is visible
        String verifiymessage = signuppage.verifyMessage();
        Assert.assertEquals(verifiymessage, "New User Signup!");

        //Enter name and email address
        signuppage.enterNameandEmail();
        //Verify that 'ENTER ACCOUNT INFORMATION' is visible
        signuppage.enterAccountinfo();
        //Fill details: Title, Name, Email, Password, Date of birth
        signuppage.enterAddressinfo();
        //Verify that 'ACCOUNT CREATED!' is visible
        String successMessage = signuppage.clickCreateAccount();
        Assert.assertEquals(successMessage,"ACCOUNT CREATED!");
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
