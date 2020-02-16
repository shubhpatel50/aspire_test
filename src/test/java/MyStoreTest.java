import Pages.LoginPage;
import Pages.PageGenerator;
import org.testng.annotations.Test;

public class MyStoreTest extends BaseTest{

    @Test
    public void placeOrderTest(){
        LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
        loginpage.
                loginFlow().
                navigateToAddNewAddressPage().
                addNewAddressFlow().
                addItemFlow().
                verifyOrderDetails();

    }



}
