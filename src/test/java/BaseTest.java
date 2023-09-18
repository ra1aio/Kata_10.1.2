import main.BrowserManager;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    public BrowserManager browserManager = new BrowserManager();

    @BeforeEach
    public void precondition() {
        browserManager.initDesktopDriver();
        browserManager.browser.openPage("https://www.ae.com/us/en");
    }
}
