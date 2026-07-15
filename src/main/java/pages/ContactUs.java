package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;

import java.time.Duration;

public class ContactUs {

    //locators
   // get in touch message
    private final By firstMessage = By.xpath("");
    //private final By signup_loginpage = By.xpath("");
    private final By name = By.xpath("//a[text() = ' Signup / Login']");
    private final By email = By.xpath("/input[@placeholder='Email']");
    private final By subject = By.xpath("//input[@placeholder='Subject']");
    private final By message = By.xpath("//textarea[@id='message']");
    private final By choosefile = By.xpath("//input[@name='upload_file']");
    private final By submit = By.xpath("//input[@type='submit']");
    private final By homebutton = By.xpath("//a[text() = ' Signup / Login']");
    private final By getInTouchMessage = By.xpath("//h2[text()='Get In Touch']");
    private final By successMessage = By.xpath("//div[starts-with(text(), 'Success!')][1]");

    WebDriver driver;
    WebDriverWait wait;
    File uploadFile = new File("C:\\Jerry\\Automation\\automationexercise_selenium_java\\automationexercise_selenium\\src\\test\\resources\\popup.png");

    public ContactUs(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    //methods
    public void fillDetails(String Name,String Email,String Message){
        driver.findElement(name).sendKeys(Name);
        driver.findElement(email).sendKeys(Email);
        driver.findElement(subject).sendKeys("feedback");
        driver.findElement(message).sendKeys(Message);

    }

    public void uploadFileandSubmit(){
        WebElement fileInput = driver.findElement(choosefile);
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();

    }


    public boolean verifyGetInTouchMessagePresent() {
        boolean isPresent = false;
        String message;
        message = driver.findElement(getInTouchMessage).getText();
        if (message.equals("GET IN TOUCH")){
            isPresent = true;
            return isPresent;
        } else {
            return isPresent;
        }
        
    }

    public void handleOKAlert() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public boolean successMessage() {
        boolean present = false;
        String successMess;
        successMess = driver.findElement(successMessage).getText();
        if (successMess.equals("Success! Your details have been submitted successfully.")){
            present = true;
            return present;
        } else {
            return present;
        }
    }

    public void navigatetoHomePage() {
    }
}
