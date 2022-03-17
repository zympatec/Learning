package TestNG19;
import org.testng.annotations.*;

public class day3Test {

    @Parameters({"URL", "Apikey"}) // работает на 1 класс
    @BeforeClass
    public void BfClass(String urlname, String key) {
        System.out.println("Before class!");
        System.out.println(urlname);
        System.out.println(key);
    }

    @Test
    public void WebLoginCarLoan() {
        System.out.println("WebLoginCarLoan");
    }

    @BeforeMethod (enabled = false)
    public void BfMethod () {
        System.out.println("before method");
    }

    @Test (timeOut = 4000)
    public void MobileLoginCarLoan() {
        System.out.println("MobileLoginCarLoan");
    }

    @Test (dependsOnMethods = {"WebLoginCarLoan"})
    public void LoginAPICarLoan() {
        System.out.println("LoginAPICarLoan");
    }

    @BeforeSuite
    public void BfSuite() {
        System.out.println("i am first");
    }

    @Test
    public void MobileSignInCarLoan() {
        System.out.println("MobileSignIn");
    }

    @Test (dataProvider = "getData")
    public void MobileSignOutCarLoan(String username, String password) {
        System.out.println("MobileSignOut");
        System.out.println(username + " " + password);
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2]; // 3 строки, 2 столбца, каждая строка сработает
        data[0][0] = "firstsetusername";
        data[0][1] = "password";
        data[1][0] = "secondsetusername";
        data[1][1] = "secpassword";
        data[2][0] = "thirdsetusername";
        data[2][1] = "thpassword";
        return data;
    }
}
