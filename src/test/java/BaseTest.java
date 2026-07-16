import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.SetUp;

public class BaseTest extends SetUp {

    @BeforeTest
//    executable code must live inside a method block;
//    you cannot write code statements directly inside the class body.
    public void setup() {
        chromeSetup();
    }


    @AfterTest
    public void tearDown() {
        browserTearDown();
    }


}
