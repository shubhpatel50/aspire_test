package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManufacturingPage extends BasePage{

public ManufacturingPage(WebDriver driver){
    super(driver);
}


    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createProductBtn;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement productNameTextBox;

    @FindBy(xpath = "//div[@name='list_price']")
    public WebElement salePriceTextBox;

    @FindBy(xpath = "//div[@name='standard_price']")
    public WebElement costTextBox;

    @FindBy(xpath = "//div[@name='uom_id']")
    public WebElement unitOfMeasure;

    @FindBy(xpath = "//div[@name='uom_po_id']")
    public WebElement purchaseUnitOfMeasure;

    @FindBy(xpath = "//span[contains(text(),'Update Quantity')]")
    public WebElement updateQuantityBtn;

    @FindBy(xpath = "//div[@name='location_id']")
    public WebElement locationID;

    @FindBy(xpath = "//div[@name='package_id']")
    public WebElement packageID;

    @FindBy(xpath = "//input[@name='inventory_quantity']")
    public WebElement inventoryQuantityTextBox;






















//Manufacturing Page

//div[@name='product_id']//input[@type='text']

//button[@name='action_confirm']

//a[contains(text(),'Add a line')]




    //ProductName
    //ReferenceNumber
    //Quantity
    //Available Quantity
    //Package
    //Measurement Unit Dozen
    //Scheduled Date
    //Source Location
    //Destination Location




    public void createProductFlow() {


    }


}
