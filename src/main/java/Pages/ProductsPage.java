package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductsPage extends BasePage{

public ProductsPage(WebDriver driver){
    super(driver);
}


    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createProductBtn;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createQuantityBtn;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement productNameTextBox;

    @FindBy(css = "button[name='action_update_quantity_on_hand']")
    public WebElement updateQuantityBtn;

    @FindBy(xpath = "//input[@name='inventory_quantity']")
    public WebElement inventoryQuantityTextBox;

    @FindBy(xpath = "//a[@title='Home menu']")
    public WebElement applicationIcon;

    @FindBy(xpath = "//div[@name='uom_id']")
    public WebElement unitOfMeasureMenu;

    @FindBy(xpath = "//a[text()='g']")
    public WebElement unitOfMeasureOption;

    @FindBy(xpath = "//div[@name='list_price']//input")
    public WebElement listPrice;

    @FindBy(xpath = "//div[@name='standard_price']//input")
    public WebElement costPrice;


    public ProductsPage createProductFlow() {
        click(createProductBtn);
        isElementPresent(productNameTextBox);
        enterText(productNameTextBox,p.getProperty("productName"));
        click(unitOfMeasureMenu);
        click(unitOfMeasureOption);
        enterText(listPrice,"10");
        enterText(costPrice,"5");
        click(saveBtn);
        return PageGenerator.getPage(ProductsPage.class);

    }

    public HomePage updateQuantityFlow() {
        isElementEnabled(updateQuantityBtn);
        click(updateQuantityBtn);
        isElementEnabled(createQuantityBtn);
        click(createQuantityBtn);
        enterText(inventoryQuantityTextBox,p.getProperty("productQuantity"));
        click(saveBtn);
        click(applicationIcon);
        return PageGenerator.getPage(HomePage.class);
    }




}
