package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    //locators
    private final By firstProduct = By.xpath("//p2[text()='Blue Top']");
    private final By firstProductDetails = By.xpath("//a[@href='/product_details/1']");  //think can we make this dynamic to accept values?

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));    // think about it
    }

    //methods
    public void viewProductDetails(){
        //driver.findElement(firstProductDetails).click();
        //implementing scroll action logic , ask about it!
      // WebElement detailslink = driver.findElement(firstProductDetails);
      // new Actions(driver).scrollByAmount(0,897).click();
        // is there a way to disable ads popup?
        wait.until(ExpectedConditions.elementToBeClickable(firstProductDetails)).click();

    }


   // 2 options view cart or continue shopping
    public  void addtoCart(){

    }

    public void searchProduct(){
       // is available = true;

    }
    public void selectCategory(){

    }
    public void selectBrand(){

    }

    public void writeReview(){

    }


    public String getProductDetailsTitle() {
        String title;
        title = driver.getTitle();
        return title;
    }
}
