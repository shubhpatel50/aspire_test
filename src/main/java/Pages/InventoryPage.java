package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InventoryPage extends BasePage{

public InventoryPage(WebDriver driver){
    super(driver);
}


    @FindBy(xpath = "//div[text()='Discuss']")
    public WebElement discussLink;

    @FindBy(xpath = "//div[text()='Inventory']")
    public WebElement inventoryLink;

    @FindBy(xpath = "//div[text()='Manufacturing']")
    public WebElement manufacturingLink;

    @FindBy(xpath = "//div[text()='Barcode']")
    public WebElement barcodeLink;


    public void inventoryFlow() {
        click(inventoryLink);

    }

    public void homePageUIElementsCheck() {
        Assert.assertTrue(isElementPresent(discussLink),"discussLink is not displayed");
        Assert.assertTrue(isElementPresent(inventoryLink),"inventoryLink is not displayed");
        Assert.assertTrue(isElementPresent(manufacturingLink),"manufacturingLink is not displayed");
        Assert.assertTrue(isElementPresent(barcodeLink),"barcodeLink is not displayed");
    }



}
