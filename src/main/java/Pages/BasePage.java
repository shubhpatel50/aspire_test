package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BasePage extends PageGenerator {

    public BasePage(WebDriver driver) {
        super(driver);
        getTestData();
    }

    WebDriverWait wait = new WebDriverWait(this.driver,10);
    FileReader reader;
    Properties p = new Properties();

    public Properties getTestData()  {
        try {
            reader=new FileReader(System.getProperty("user.dir") + "/" + "TestData.prop");
            p.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p;
    }


    public void click (WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }

    public void enterText (WebElement element, String text) {
            element.clear();
            element.sendKeys(text);
    }


    public Boolean isElementPresent(WebElement element) {
        threadDotSleep(2000);
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
    }

    public Boolean isElementEnabled(WebElement element) {
        threadDotSleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element.isEnabled();
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

    public void selectProduct(String product){
        threadDotSleep(2000);
        driver.findElement(By.xpath("//li/a[text()='" + product +"']"));
    }

    public void threadDotSleep(int ms){

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
