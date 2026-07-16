package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class SignupandLoginPage {
    WebDriver driver;
    WebDriverWait wait; //?
    private final By newUserSignUpMessage = By.xpath("//h2[text()='New User Signup!']");
    private final By nameOnSingUpPage = By.xpath("//input[@placeholder='Name']");
    //private final By name_One = By.xpath("//input[@id='name']");
    private final By email = By.xpath("//input[@data-qa='signup-email']");
   // private final By email_One = By.xpath("//input[@id='email']");
    private final By signUp = By.xpath("//button[text()='Signup']");
    private final By mr = By.xpath("//input[@type = 'radio' and @value='Mr']");
    private final By password = By.xpath("//input[@id='password']");
    private final By deleteconfirmatiomessage = By.xpath("//*[text()='Account Deleted!']");
    private final By day = By.xpath("//option[@value = '3' and text()='3']");
    private final By month = By.xpath("//option[@value = '7' and text()='July']");
    private final By year = By.xpath("//option[@value = '1995' and text()='1995']");
    private final By newsletter = By.xpath("//input[@id= 'newsletter']");
    private final By specialoffer = By.xpath("//input[@id= 'optin']");
    private final By verificationMessage = By.xpath("//div[@class = 'login-form']/h2/b");
    private final By successfulMessage = By.xpath("");
    private final By createAccountBtn = By.xpath("//button[text()='Create Account']");
    private final By continueBtn = By.xpath("//a[text()='Continue']");
    private final By firstName = By.xpath("	//input[@name='first_name']");
    private final By lastName = By.xpath("//input[@name='last_name']");
    private final By company = By.xpath("//input[@name='company']");
    private final By address = By.xpath("//input[@id='address1']");
    private final By country = By.xpath("//option[@value='Canada']");
    private final By state = By.xpath("//input[@id='state']");
    private final By city = By.xpath("//input[@id='city']");
    private final By zipcode = By.xpath("//input[@id='zipcode']");
    private final By mobileNumber = By.xpath("//input[@id='mobile_number']");
    private final By deleteBtn = By.linkText(" Delete Account");
    private final By continueLink = By.xpath("//*[text()='Continue']");
    public SignupandLoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String verifyMessage() {
        String message;
        message = driver.findElement(newUserSignUpMessage).getText();
        return message;
        //assertEquals("some",message);
    }

    public void enterNameandEmail() {
        driver.findElement(nameOnSingUpPage).sendKeys("Tom");
        driver.findElement(email).sendKeys("TomCat007@gmail.com");  //learn and implement java random module for string!
        driver.findElement(signUp).click();
    }

    public void enterAccountinfo() {
        String message;
        message = driver.findElement(verificationMessage).getText();
        wait.until(ExpectedConditions.elementToBeClickable(mr)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(password)).isDisplayed();
        driver.findElement(password).sendKeys("tome@1234");


    }

    public void enterDOB() {
        driver.findElement(day).click();
        driver.findElement(month).click();
        driver.findElement(year).getText();
    }

    public void selectNewsletterandSpecialOffer() {
        driver.findElement(newsletter).click();
        driver.findElement(specialoffer).click();
    }

    public void enterAddressinfo() {
        driver.findElement(firstName).sendKeys("tom");
        driver.findElement(lastName).sendKeys("cat");
        driver.findElement(company).sendKeys("ohoh");
        driver.findElement(address).sendKeys("w e  ajnonoin");
        driver.findElement(country);
        driver.findElement(state).sendKeys("experiment");
        driver.findElement(city).sendKeys("vancouer");
        driver.findElement(zipcode).sendKeys("303303");
        driver.findElement(mobileNumber).sendKeys("34567890");


    }

    public void clickCreateAccount() {
        driver.findElement(createAccountBtn).click();
        //String accntCreationMessage;
       // wait.until(ExpectedConditions.textToBePresentInElementValue(successfulMessage,"acnt created"));
      //  accntCreationMessage = driver.findElement(successfulMessage).getText();
      //  return accntCreationMessage;


    }

    public void clickContinue() {
        //driver.findElement(continueBtn).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }

    public String deleteAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteBtn)).click();
        String deletemessage ;
        deletemessage = driver.findElement(deleteconfirmatiomessage).getText();
        driver.findElement(continueLink);
        return deletemessage;
    }
}








