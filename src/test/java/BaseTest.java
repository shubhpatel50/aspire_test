import Pages.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class BaseTest{

    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;


    @BeforeMethod
    public void setup () {

        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();

        //Instantiate the Page Class
        page = new PageGenerator(driver);
    }

    @AfterMethod
    public void teardown () {
        driver.quit();

    }
}
