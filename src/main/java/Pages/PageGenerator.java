package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Constructor;

public class PageGenerator {

    public static WebDriver driver;

    public PageGenerator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public  static <TPage extends BasePage> TPage getPage(Class<TPage> pageClass) {
        TPage page=null;
        try {
            Constructor<TPage> con = pageClass.getConstructor(WebDriver.class);
            page = con.newInstance(driver);
        }
        catch(Exception e){

            System.out.println("Failed to create PageObject" + e.getMessage());
        }
        return page;
    }
}
