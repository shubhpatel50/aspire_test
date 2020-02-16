package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddNewAddressPage extends BasePage{

    public AddNewAddressPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@class='page-heading']")
    public WebElement myAddressesHeader;

    @FindBy(xpath = "//span[contains(text(),'Add a new address')]")
    public WebElement addNewAddressLink;

    @FindBy(xpath = "//*[@class='page-subheading']")
    public WebElement yourAddressesHeader;

    @FindBy(id = "firstname")
    public WebElement firstnameTextbox;

    @FindBy(id = "lastname")
    public WebElement lastnameTextbox;

    @FindBy(id = "company")
    public WebElement companyTextbox;

    @FindBy(id = "address1")
    public WebElement address1Textbox;

    @FindBy(id = "address2")
    public WebElement address2Textbox;

    @FindBy(id = "city")
    public WebElement cityTextbox;

    @FindBy(id = "id_state")
    public WebElement stateDropdown;

    @FindBy(id = "postcode")
    public WebElement zipcodeTextbox;

    @FindBy(id = "id_country")
    public WebElement countryDropdown;

    @FindBy(id = "phone")
    public WebElement homehoneTextbox;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneTextbox;

    @FindBy(id = "other")
    public WebElement additionalInfoTextbox;

    @FindBy(id = "alias")
    public WebElement aliasTextbox;

    @FindBy(id = "submitAddress")
    public WebElement saveBtn;

    @FindBy(xpath = "//h3[@class='page-subheading']")
    public WebElement homeAddressText;

    @FindBy(xpath = "//span[contains(text(),'Back to your account')]")
    public WebElement backToAccountLink;


    public MyAccountPage addNewAddressFlow() {
        Assert.assertTrue(isElementPresent(myAddressesHeader),"Failed to Navigate to MyAddressesPage");
        System.out.println("***** Navigated to MyAddressesPage ******");
        click(addNewAddressLink);
        Assert.assertTrue(isElementPresent(yourAddressesHeader),"Failed to Navigate to YourAddressesPage");
        System.out.println("***** Navigated to YourAddressesPage ******");
        enterText(firstnameTextbox,"Shubham");
        enterText(lastnameTextbox,"Patel");
        enterText(companyTextbox,"ATC");
        enterText(address1Textbox,"Walker Street");
        enterText(address2Textbox,"Longride");
        enterText(cityTextbox,"Anchorage");
        selectDropdown(stateDropdown,"Alaska");
        enterText(zipcodeTextbox,"99501");
        selectDropdown(countryDropdown,"United States");
        enterText(homehoneTextbox,"0987654321");
        enterText(mobilePhoneTextbox,"1234567890");
        enterText(additionalInfoTextbox,"Default Address for Order Delivery");
        enterText(aliasTextbox,"Home Address");
        click(saveBtn);
        Assert.assertTrue(isElementPresent(homeAddressText),"Address not Saved successfully");
        System.out.println("***** Address Saved successfully ******");
        click(backToAccountLink);
        return PageGenerator.getPage(MyAccountPage.class);

    }
}
