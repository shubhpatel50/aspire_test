package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class BasePage extends PageGenerator {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(this.driver,20);

    public static String cartValue;

    public void click (WebElement element) {
        element.click();

    }

    public void enterText (WebElement element, String text) {
            element.clear();
            element.sendKeys(text);
    }


    public Boolean isElementPresent (WebElement element) {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
    }

    public void selectDropdown (WebElement element, String text) {
        Select ele=new Select(element);
        ele.selectByVisibleText(text);
    }

    public void checkCheckbox (WebElement element) {
        if(!element.isSelected())
        element.click();
    }

    public void moveToElementAction (WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public void getScreenShot(WebElement element){
    try {
        File srcFile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("./target/screenshots/OrderDetails.png"));
    }
    catch(IOException e){
        System.out.println("FilePath doesnot exists" + e.getMessage());
    }
    }

    public void setCartValue(String cartValue){
        this.cartValue=cartValue;

    }

    public String getCartValue(){
        return cartValue;
    }

}
