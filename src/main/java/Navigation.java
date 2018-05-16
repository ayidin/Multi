import org.openqa.selenium.support.PageFactory;

public class Navigation {

    public static LoginUserPage mainPage() {
        BrowserManager.browser.get().get("https://www.facebook.com/");

        return PageFactory.initElements(BrowserManager.browser.get(), LoginUserPage.class);
    }
}
