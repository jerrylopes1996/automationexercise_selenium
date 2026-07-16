import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class VerifyAllProductsAndProductDetailPage extends BaseTest {
    //WebDriver driver;   if you include this line it gives null pointer exception think about it!
    HomePage homepage;
    ProductPage productpage;
    String url = "https://automationexercise.com/";

    @Test
    public void verifyProductsPageAndFirstProductDetails(){
        homepage = new HomePage(driver);
        productpage = new ProductPage(driver);

        driver.get(url);
//          Verify that home page is visible successfully (how to verify this?)
        homepage.clickProductsPage();
//          Verify user is navigated to ALL PRODUCTS page successfully
//          The products list is visible
//          Click on 'View Product' of first product
        productpage.viewProductDetails();
//          User is landed to product detail page
        String expectedTitle =  productpage.getProductDetailsTitle();
        Assert.assertEquals(expectedTitle,"Automation Exercise - Product Details");
//        9. Verify that detail detail is visible: product name, category, price, availability, condition, brand














    }




}
