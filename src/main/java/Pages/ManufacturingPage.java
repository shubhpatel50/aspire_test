package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ManufacturingPage extends BasePage{

public ManufacturingPage(WebDriver driver){
    super(driver);
}

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createProductBtn;

    @FindBy(xpath = "//div[@name='product_id']")
    public WebElement productID;

    @FindBy(xpath = "//div[@name='product_id']//input")
    public WebElement productIDTextBox;

    @FindBy(xpath = "//a[contains(text(),'Add a line')]")
    public WebElement addLineLink;

    @FindBy(xpath = "//input[@name='product_uom_qty']")
    public WebElement productQuantityToConsumeTextBox;

    @FindBy(xpath = "//button[@name='action_confirm']")
    public WebElement confirmBtn;

    @FindBy(xpath = "//input[@name='qty_producing']")
    public WebElement quantityProducingTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement markAsDoneBtn;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[@placeholder='Manufacturing Reference']")
    public WebElement manufacturingReferenceNo;

    //Component Tab
    @FindBy(xpath = "//div[@name='product_id']")
    public List<WebElement> productComponent;

    @FindBy(xpath = "//div[@name='product_id']//input")
    public List<WebElement>  productIDTextBoxComponent;

    //Validation Page
    @FindBy(xpath = "//a[@name='product_id']")
    public WebElement productIDValidate;

    @FindBy(xpath = "//span[@name='qty_producing']")
    public WebElement quantityProducingValidate;

    public static String ManufacturingReferenceNo="";

    public ManufacturingPage createManufacturingOrderFlow() {
        click(createProductBtn);
        click(productID);
        enterText(productIDTextBox,p.getProperty("productName"));
        selectProduct(p.getProperty("productName"));
        click(addLineLink);
        threadDotSleep(5000);
        isElementPresent(productComponent.get(1));
        click(productComponent.get(1));
        enterText(productIDTextBoxComponent.get(1),p.getProperty("productName"));
        selectProduct(p.getProperty("productName"));
        enterText(productQuantityToConsumeTextBox,p.getProperty("productConsume"));
        click(confirmBtn);
        threadDotSleep(5000);
        ManufacturingReferenceNo = manufacturingReferenceNo.getText();
        enterText(quantityProducingTextBox,p.getProperty("productQuantity"));
        click(markAsDoneBtn);
        isElementEnabled(saveBtn);
        click(saveBtn);
        return PageGenerator.getPage(ManufacturingPage.class);
    }

    public void validateManufacturingOrderDetails() {
        threadDotSleep(5000);
        Assert.assertEquals(manufacturingReferenceNo.getText(),ManufacturingReferenceNo);
        Assert.assertEquals(productIDValidate.getText(),p.getProperty("productName"));
        Assert.assertEquals(quantityProducingValidate.getText(),p.getProperty("productQuantity"));
    }


}
