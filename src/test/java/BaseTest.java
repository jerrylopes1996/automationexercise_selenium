import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;  //findout why protected?

    @BeforeTest
//    executable code must live inside a method block;
//    you cannot write code statements directly inside the class body.
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterTest
    public void tearDown() {
        if (driver != null) {  //understand the logic
            driver.quit();
        }
    }


}
