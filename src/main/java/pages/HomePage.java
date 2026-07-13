package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private final By signup_loginpage = By.xpath("//a[text() = ' Signup / Login']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void clickSignUp(){
        driver.findElement(signup_loginpage).click();

    }




}
