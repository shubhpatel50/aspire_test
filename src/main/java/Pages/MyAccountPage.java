package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage{

        public MyAccountPage(WebDriver driver){
            super(driver);
        }

    @FindBy(xpath = "//*[@class='page-heading']")
    public WebElement myAccountPageHeader;

    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    public WebElement myAddressesLink;

    @FindBy(xpath = "//li[3]//*[@title='T-shirts']")
    public WebElement tShirtLink;

    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]")
    public WebElement productBox;

    @FindBy(xpath = "//*[@id='center_column']/ul/li//span[contains(text(), 'Add to cart')]")
    public WebElement addToCardLink;

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    public WebElement productAddedText;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    public WebElement proceedToCheckoutBtn;

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
    public WebElement proceedToCheckoutBtnSummary;

    @FindBy(name = "processAddress")
    public WebElement proceedToCheckoutBtnAddress;

    @FindBy(name= "processCarrier")
    public WebElement proceedToCheckoutBtnShipping;

    @FindBy(id = "cgv")
    public WebElement termsCheckbox;

    @FindBy(className = "bankwire")
    public WebElement payBySelection;

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    public WebElement confirmOrderBtn;

    @FindBy(xpath = "//h1[@class='page-heading']")
    public WebElement orderConfirmationPageHeader;

    @FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
    public WebElement orderConfirmationText;

    @FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
    public WebElement backToOrdersLink;

    @FindBy(id = "total_price")
    public WebElement cartTotalPriceText;



    public AddNewAddressPage navigateToAddNewAddressPage(){
        Assert.assertTrue(isElementPresent(myAccountPageHeader),"Failed to Navigate to MyAccountPage");
        System.out.println("***** Navigated to MyAccountPage ******");
        click(myAddressesLink);
        return PageGenerator.getPage(AddNewAddressPage.class);
    }


    public OrderHistoryPage addItemFlow(){
        Assert.assertTrue(isElementPresent(myAccountPageHeader),"Failed to Navigate to MyAccountPage");
        Assert.assertTrue(isElementPresent(tShirtLink));
        moveToElementAction(tShirtLink);
        click(tShirtLink);
        Assert.assertTrue(isElementPresent(productBox));
        moveToElementAction(productBox);
        isElementPresent(addToCardLink);
        click(addToCardLink);
        Assert.assertTrue(isElementPresent(productAddedText));
        Assert.assertTrue(isElementPresent(proceedToCheckoutBtn));
        click(proceedToCheckoutBtn);
        Assert.assertTrue(isElementPresent(proceedToCheckoutBtnSummary));
        setCartValue(cartTotalPriceText.getText());
        click(proceedToCheckoutBtnSummary);
        Assert.assertTrue(isElementPresent(proceedToCheckoutBtnAddress));
        click(proceedToCheckoutBtnAddress);
        checkCheckbox(termsCheckbox);
        Assert.assertTrue(isElementPresent(proceedToCheckoutBtnShipping));
        click(proceedToCheckoutBtnShipping);
        click(payBySelection);
        click(confirmOrderBtn);
        Assert.assertTrue(isElementPresent(orderConfirmationPageHeader),"Failed to Navigate to OrderConfirmationPage");
        System.out.println("***** Navigated to OrderConfirmationPage ******");
        System.out.println("***** Order Placed Successfully ******");
        Assert.assertTrue(isElementPresent(orderConfirmationText),"Failed to Validate to orderConfirmationText");
        click(backToOrdersLink);
        return PageGenerator.getPage(OrderHistoryPage.class);
    }







}
