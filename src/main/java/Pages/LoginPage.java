package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

public LoginPage(WebDriver driver){
    super(driver);
}


    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement homePageLogo;

    @FindBy(xpath = "//input[@id='login']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(css = "button[type='submit']")
    public WebElement loginBtn;

    @FindBy(css = "a[href='/web/reset_password?']")
    public WebElement resetpasswordLink;

    @FindBy(css = "p[role='alert']")
    public WebElement errorMessageText;

    @FindBy(css = "button[type='submit']")
    public WebElement confirmBtn;

    @FindBy(css = "a[href='/web/login?']")
    public WebElement backToLoginLink;


    public HomePage loginFlow() {
        driver.get(p.getProperty("url"));
        Assert.assertTrue(isElementPresent(homePageLogo),"Navigation to Login Page Failed");
        enterText(emailTextBox,p.getProperty("username"));
        enterText(passwordTextBox,p.getProperty("password"));
        click(loginBtn);
        return PageGenerator.getPage(HomePage.class);
    }

    public void inCorrectEmailCheck() {
        driver.get(p.getProperty("url"));
        Assert.assertTrue(isElementPresent(homePageLogo),"Navigation to Login Page Failed");
        enterText(emailTextBox,"abcdef");
        enterText(passwordTextBox,"12345");
        click(loginBtn);
        Assert.assertEquals(errorMessageText.getText(),"Wrong login/password");

    }

    public void inCorrectPasswordCheck() {
        driver.get(p.getProperty("url"));
        Assert.assertTrue(isElementPresent(homePageLogo),"Navigation to Login Page Failed");
        enterText(emailTextBox,"abcdef");
        enterText(passwordTextBox,"12345");
        click(loginBtn);
        Assert.assertEquals(errorMessageText.getText(),"Wrong login/password");
    }

    public void resetPasswordFlow() {
        driver.get(p.getProperty("url"));
        Assert.assertTrue(isElementPresent(homePageLogo),"Navigation to Login Page Failed");
        click(resetpasswordLink);
        Assert.assertEquals(driver.getCurrentUrl(),"https://aspireapp.odoo.com/web/reset_password?");
        Assert.assertTrue(isElementPresent(emailTextBox),"emailTextBox is not displayed");
        Assert.assertTrue(isElementPresent(confirmBtn),"confirmBtn is not displayed");
        Assert.assertTrue(isElementPresent(backToLoginLink),"backToLoginLink is not displayed");
    }

}
