package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private final By signup_loginpage = By.xpath("//a[text() = ' Signup / Login']");
    private final By logoutBtn = By.xpath("//a[text()='Logout']");  //?
    private final By contactuspage = By.xpath("//a/i[text()='Contact us']"); //?

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
}
