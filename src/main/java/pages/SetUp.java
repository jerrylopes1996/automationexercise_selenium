package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
    public WebDriver driver;  //findout why protected?


//    executable code must live inside a method block;
//    you cannot write code statements directly inside the class body.
    public void chromeSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void browserTearDown() {
        if (driver != null) {  //understand the logic
            driver.quit();
        }
    }


}
