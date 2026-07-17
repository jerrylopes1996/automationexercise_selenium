import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class VerifySubscriptionInHomePage extends BaseTest {
    HomePage homepage;
    String url = "http://automationexercise.com";
    @Test
    public void verifySubscriptionInHomePage(){
        homepage = new HomePage(driver);
        driver.get(url);


//        3. Verify that home page is visible successfully
//        4. Scroll down to footer
//        5. Verify text 'SUBSCRIPTION'
        homepage.verifyTextSubscriptionIsVisible();
//        6. Enter email address in input and click arrow button
        homepage.subscribe();
//        7. Verify success message 'You have been successfully subscribed!' is visible
//
//
    }
}
