import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterNewUser extends BaseTest {
  WebDriver driver;
    //Test Case 1: Register User
  //1. Launch browser
   driver.get("'http://automationexercise.com'")

//2. Navigate to url 'http://automationexercise.com'
//            3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
    homepage.clickSignUp();
//5. Verify 'New User Signup!' is visible
    signuppage.verifyMessage();
//6. Enter name and email address
//7. Click 'Signup' button
    signuppage.createNewUser();
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    signuppage.enterAccountinfo();
//9. Fill details: Title, Name, Email, Password, Date of birth
     signuppage.enterAddressinfo();
//10. Select checkbox 'Sign up for our newsletter!'
//            11. Select checkbox 'Receive special offers from our partners!'
//            12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
     signuppage.clickCreateAccount();
//            14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
     signuppage.clickContinue();
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
     signuppage.deleteAccount();
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
}
