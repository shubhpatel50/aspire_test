import Pages.LoginPage;
import Pages.PageGenerator;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest{

    @Test
    public void e2eTest(){
        LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
        loginpage.
                loginFlow().
                navigateToInventoryPage().
                navigateToProductsPage().
                createProductFlow().
                updateQuantityFlow().
                navigateToManufacturingPage().
                createManufacturingOrderFlow().
                validateManufacturingOrderDetails();

    }

}
