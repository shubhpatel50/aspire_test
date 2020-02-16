package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OrderHistoryPage extends BasePage{

    public OrderHistoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    public WebElement orderHistoryPageHeader;

    @FindBy(xpath = "//p[@class='info-title']")
    public WebElement orderHistoryText;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    public WebElement backToHomeLink;

    @FindBy(xpath = "//div[@id='center_column']")
    public WebElement orderDetailsText;

    @FindBy(xpath = "//tr[contains(@class,'first_item')]//td[@class='history_price']")
    public WebElement totalPriceText;

    @FindBy(className= "logout")
    public WebElement signOutLink;


    public LoginPage verifyOrderDetails(){
        Assert.assertTrue(isElementPresent(orderHistoryPageHeader),"Failed to Navigate to orderHistoryPage");
        System.out.println("***** Navigated to orderHistoryPage ******");
        Assert.assertTrue(isElementPresent(orderHistoryText),"Failed to Validate to orderHistoryText");
        System.out.println("***** Order Validated Successfully ******");
        getScreenShot(orderDetailsText);
        Assert.assertEquals(totalPriceText.getText(),getCartValue());
        click(backToHomeLink);
        click(signOutLink);
        return PageGenerator.getPage(LoginPage.class);
    }



}
