package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupandLoginPage {
    WebDriver driver;
    private final By newUserSignUpMessage = By.xpath("New User Signup!");
    private final By name = By.xpath("//input[text()='Name']");
    private final By email = By.xpath("//input[text()='Name']");
    private final By signUp = By.xpath("//input[text()='Name']");
    public SignupandLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void verifyMessage(){
       String message;
       message = driver.findElement(newUserSignUpMessage).getText();
       //assertEquals("some",message);
    }

    public void enterNameandEmail(){
        driver.findElement(name).sendKeys();
        driver.findElement(email).sendKeys();
        driver.findElement(signUp).click();
    }


}





