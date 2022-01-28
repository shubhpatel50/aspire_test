package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InventoryPage extends BasePage{

public InventoryPage(WebDriver driver){
    super(driver);
}


    @FindBy(xpath = "//span[text()='Inventory Overview']")
    public WebElement inventoryOverviewHeader;

    @FindBy(xpath = "//button/span[contains(text(),'Products')]")
    public WebElement productsMenu;

    @FindBy(xpath = "//a[text()='Products']")
    public WebElement productsOption;


    public ProductsPage navigateToProductsPage() {
        Assert.assertTrue(isElementPresent(inventoryOverviewHeader),"Navigation to Inventory Page Failed");
        click(productsMenu);
        click(productsOption);
        return PageGenerator.getPage(ProductsPage.class);
    }

}
