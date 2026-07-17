package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    private final By signup_loginpage = By.xpath("//a[text() = ' Signup / Login']");
    private final By logoutBtn = By.xpath("//a[text()='Logout']");  //?
    private final By contactuspage = By.linkText("Contact us");//?
    private final By products = By.xpath("//a[@href='/products']");
    private final By testcasespage = By.xpath("//a[@href='/test_cases']");
    private final By Subscriptiontext = By.xpath("//h2[text()='Subscription']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public  void clickSignUp(){
        driver.findElement(signup_loginpage).click();

    }

     public void clickLogout(){
        driver.findElement(logoutBtn).click();  //need to implement wait strategy here
     }

    public void clickContactUs() {
        driver.findElement(contactuspage).click();
    }

    public void clickProductsPage(){
        driver.findElement(products).click();
    }

    public String clickTestCasePage() {
        String title;
        driver.findElement(testcasespage).click();
        title = driver.getTitle();
        return title;
    }

    /**
     *
     */
    public void verifyTextSubscriptionIsVisible() {
        // implementation of scrolling logic

        WebElement subscription = driver.findElement(By.xpath("//h2[text()='Subscription']"));
        Actions pause = new Actions(driver)
                .scrollToElement(subscription).pause(Duration.ofSeconds(10));
    }

    public void subscribe(){
        driver.findElement(By.cssSelector("#susbscribe_email")).sendKeys("Bond");
        driver.findElement(By.id("subscribe"));


    }
}
