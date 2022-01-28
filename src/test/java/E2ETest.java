import Pages.LoginPage;
import Pages.PageGenerator;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest{

    @Test
    public void loginSuccessTest(){
        LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
        loginpage.
                loginFlow().
                navigateToInventoryPage().
                navigateToProductsPage().
                createProductFlow().
                updateQuantityFlow().
                navigateToManufacturingPage();


    }

    @Test
    public void inCorrectEmailTest(){
        LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
        loginpage.
                inCorrectEmailCheck();
    }

    @Test
    public void inCorrectPasswordTest(){
        LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
        loginpage.
                inCorrectPasswordCheck();
    }

    @Test
    public void resetPasswordFlow(){
        LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
        loginpage.
                resetPasswordFlow();
    }

}
