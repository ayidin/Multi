
import org.openqa.selenium.By;

public class MainUserPage {

    private static String nameUser = "._1vp5";

    public boolean iconUserIsPresent() {
        return BrowserManager.browser.get().findElement(By.cssSelector(nameUser)).isDisplayed();
    }

    public String getUserName() {
        String name = BrowserManager.browser.get().findElement(By.cssSelector(nameUser)).getText();
        return name;
    }

}
