import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.ContactUs;
import pages.HomePage;

public class ContactUsFormTest extends BaseTest {

ContactUs contactuspage;
HomePage homePage;
String url = "https://automationexercise.com/";

@Test
        public void contantusformtest(){
    driver.get(url);
//          3. Verify that home page is visible successfully
    String title;
    title = driver.getTitle();
    //Assertions.
    homePage.clickContactUs();

//5. Verify 'GET IN TOUCH' is visible
    contactuspage.verifymessagemessage();

//6. Enter name, email, subject and message
    contactuspage.fillDetails();
//7. Upload file
//8. Click 'Submit' button
    contactuspage.uploadFileandSubmit();
//9. Click OK button
    contactuspage.handleOKAlert();
//10. Verify success message 'Success! Your details have been submitted successfully.' is visible
    contactuspage.successmessage();

//11. Click 'Home' button and verify that landed to home page successfully
    contactuspage.navigatetoHomePage();
//
//


}
























}
