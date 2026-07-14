import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupandLoginPage;

import java.util.Random;


public class RegisterNewUserTest extends BaseTest {
    HomePage homepage;
    SignupandLoginPage signuppage;
    //homepage = new HomePage(driver);
    // signuppage = new SignupandLoginPage(driver);  threw error here!
    Random random = new Random();
    // Generates an integer from 0 (inclusive) to bound (exclusive)
    int randomNum = random.nextInt(20); // Range: 0-9
    String url = "http://automationexercise.com";
    String email = "Tom" + "cat" + randomNum + "@gmail.com";


    //Verify that home page is visible successfully Take screenshot needs implementation
    @Test
    public void registerNewUser() {
        driver.get(url);
        homepage = new HomePage(driver);
        signuppage = new SignupandLoginPage(driver);
        homepage.clickSignUp();
        //Verify 'New User Signup!' is visible  need your feedback here
        String verificationmessage = signuppage.verifyMessage();
        Assert.assertEquals(verificationmessage, "New User Signup!");

        signuppage.enterNameAndEmail("tom", email);
        //Verify that 'ENTER ACCOUNT INFORMATION' is visible  //need your feedback here
        signuppage.enterFirstAndLastName("Tom", "PussyCat");
        signuppage.enterCompanyName("Disney");
        signuppage.enterAccountinfo();
        signuppage.enterDOB();
        signuppage.selectNewsletterAndSpecialOffer();
        signuppage.enterAddressInfo();
        signuppage.enterMobileNumber("7000600100");
        signuppage.clickCreateAccount();
        //Verify that 'ACCOUNT CREATED!' is visible
        //String successMessage = signuppage.clickCreateAccount();
        // Assert.assertEquals(successMessage, "ACCOUNT CREATED!");
        //Click 'Continue' button
        signuppage.clickContinue();

        //Verify that 'Logged in as username' is visible
        signuppage.deleteAccount();
        //Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button  Need your feedback
        String finalMessage = signuppage.accountDeletionConfirmationMessage();
        Assert.assertEquals(finalMessage, "ACCOUNT DELETED!");

    }
}
