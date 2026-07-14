package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    private final By signup_loginpage = By.xpath("//a[text() = ' Signup / Login']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));  // understand syntax and  logic
    }

    public void clickSignUp() {
       wait.until(ExpectedConditions.elementToBeClickable(signup_loginpage)).click();
    }


}