import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class VerifyTestCasesPage extends BaseTest {
    HomePage homepage;
    String url = "https://automationexercise.com/";
    @Test
    public void verifyTestCasePage(){
        homepage = new HomePage(driver);
        driver.get(url);
       String title =  homepage.clickTestCasePage();

        Assert.assertEquals(title,"Automation Practice Website for UI Testing - Test Cases");





    }
}
