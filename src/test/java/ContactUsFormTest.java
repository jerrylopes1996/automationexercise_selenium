import org.testng.Assert;
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
    homePage = new HomePage(driver);
    contactuspage = new ContactUs(driver);
    driver.get(url);
    //Verify that home page is visible successfully
    String title;
    title = driver.getTitle();
    homePage.clickContactUs();

   //Verify 'GET IN TOUCH' is visible
    boolean messageVisible = contactuspage.verifyGetInTouchMessagePresent();
    Assert.assertEquals(messageVisible,true);

   //Enter name, email, subject and message
    contactuspage.fillDetails("Tom","tomcat@cartoon.com","I like the product fantastic!");
   //Upload file & Click 'Submit' button
    contactuspage.uploadFileandSubmit();
   //Click OK button (Alert)
    contactuspage.handleOKAlert();
  //Verify success message 'Success! Your details have been submitted successfully.' is visible

    boolean successText = contactuspage.successMessage();
    Assert.assertEquals(successText,true);

   String  finalMessage = contactuspage.printSucessMessage();
    System.out.println(finalMessage);  //logger

  //Click 'Home' button and verify that landed to home page successfully
    //contactuspage.navigatetoHomePage();



}
























}
