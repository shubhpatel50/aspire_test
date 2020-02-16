package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

public LoginPage(WebDriver driver){
    super(driver);
}

    String baseURL = "http://automationpractice.com/index.php";
    String userName="mnop@gmail.com";
    String passWord="12345";

    @FindBy(partialLinkText = "Sign in")
    public WebElement signInLink;

    @FindBy(xpath = "//*[@class='page-heading']")
    public WebElement loginPageHeader;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "passwd")
    public WebElement passwordTextBox;

    @FindBy(id = "SubmitLogin")
    public WebElement signInBtn;


    public MyAccountPage loginFlow() {
        driver.get(baseURL);
        Assert.assertTrue(isElementPresent(signInLink),"Failed to Navigate to HomePage");
        System.out.println("***** Navigated to HomePage ******");
        click(signInLink);
        Assert.assertTrue(isElementPresent(loginPageHeader),"Failed to Navigate to LoginPage");
        System.out.println("***** Navigated to LoginPage ******");
        enterText(emailTextBox,userName);
        enterText(passwordTextBox,passWord);
        click(signInBtn);
        return PageGenerator.getPage(MyAccountPage.class);

    }


}
