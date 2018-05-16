import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertTrue;

public class FacebookTest {

    @BeforeMethod
    public void openBrowser() {
        new BrowserManager().openBrowser();
    }

    @Test
    public void facebookTest() {
        MainUserPage loginPage = Navigation.mainPage().loginPage();
        assertTrue(loginPage.iconUserIsPresent());
    }

    @Test
    public void facebookUserNameTest() {
        String userName = Navigation.mainPage().loginPage().getUserName();
        assertTrue(userName.contains("Alexandr"));
    }

    @AfterMethod
    public void closeBrowser() {
        new BrowserManager().closeBrowser();
    }

}
