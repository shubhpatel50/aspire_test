//import Pages.LoginPage;
//import Pages.PageGenerator;
//import com.paulhammant.ngwebdriver.ByAngular;
//import com.paulhammant.ngwebdriver.NgWebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class MyStoreTest extends BaseTest{
//
//    @Test
//    public void placeOrderTest(){
//
//    LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
//        loginpage.
//                loginFlow().
//
//                navigateToAddNewAddressPage().
//                addNewAddressFlow().
//                addItemFlow().
//                verifyOrderDetails();
//
//
//    }
//
//    @Test
//    public void ngWebdriverTest(){
//        NgWebDriver ngDriver;
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://juliemr.github.io/protractor-demo/");
//        ngDriver = new NgWebDriver((JavascriptExecutor) driver);
//        ngDriver.waitForAngularRequestsToFinish();
//        driver.findElement(ByAngular.model("first")).sendKeys("2");
//        driver.findElement(ByAngular.model("second")).sendKeys("2");
//        driver.findElement(ByAngular.buttonText("Go!")).click();
//        ngDriver.waitForAngularRequestsToFinish();
//        String Calc=driver.findElement(By.className("ng-binding")).getText();
//        Assert.assertEquals(Calc,"4");
//
//
//    }
//
//
//
//
//
//}
