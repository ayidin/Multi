import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static ThreadLocal<WebDriver> browser = new ThreadLocal<WebDriver>();

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver_win32/chromedriver.exe");// локальное расоложение вебдрайвера
        browser.set(new ChromeDriver());
        browser.get().manage().window().maximize();
        browser.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        browser.get().quit();
    }
}
