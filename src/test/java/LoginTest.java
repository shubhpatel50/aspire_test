import Pages.LoginPage;
import Pages.PageGenerator;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginSuccessTest(){
        LoginPage loginpage= PageGenerator.getPage(LoginPage.class);
        loginpage.
                loginFlow();
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
