import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Pattern {




    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        Set<String> tabs = driver.getWindowHandles();

        int i, j, k, row =5;

        for(i=1;i<=row;i++) {

            for (j = row - i; j >= 0; j--) {

                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) {

                System.out.print("* ");

            }
            System.out.println();
        }


    }
}
