package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupandLoginPage {
    WebDriver driver;
    private final By newUserSignUpMessage = By.xpath("New User Signup!");
    private final By name = By.xpath("//input[text()='Name']");
    private final By email = By.xpath("//input[text()='Name']");
    private final By signUp = By.xpath("//input[text()='Name']");
    private final By mr= By.xpath("//input[text()='Name']");
    private final By password= By.xpath("//input[text()='Name']");
    //private final By signUp = By.xpath("//input[text()='Name']");
    private final By day= By.xpath("//input[text()='Name']");
    private final By month= By.xpath("//input[text()='Name']");
    private final By year= By.xpath("//input[text()='Name']");
    private final By newsletter= By.xpath("//input[text()='Name']");
    private final By specialoffer= By.xpath("//input[text()='Name']");
    private  final By verificationMessage   = By.xpath("");
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

    public void enterAccountinfo(){
        String message ;
        message = driver.findElement(verificationMessage).getText();
        driver.findElement(mr).click();
        driver.findElement(name).sendKeys();
        driver.findElement(email).sendKeys();
        driver.findElement(password).sendKeys();
        driver.findElement(day).sendKeys();
        driver.findElement(month).sendKeys();
        driver.findElement(year).sendKeys();
        driver.findElement(newsletter).click();
        driver.findElement(specialoffer).click();

    }


}





