import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{

    @Test
    @Description("Данные корректны. Позитивный тест.")
    @DisplayName("Вход под существующем пользователем")
    void loginUnderExistingUser() {
        String name = "Ivan";
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickAccountButton();
        browserManager.accountSideBarSteps.clickSingInButton();
        browserManager.singInSideBarSteps.inputEmail("srtdf@sda.re");
        browserManager.singInSideBarSteps.inputPassword("PaSSw0rd");
        browserManager.singInSideBarSteps.clickSingInButton();
        browserManager.loginSideBarSteps.verifyAccountName(name);
    }

    @Test
    @Description("Данные не корректны. Негативный тест.")
    @DisplayName("Вход с неверным паролем")
    void loginWithInvalidPassword() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickAccountButton();
        browserManager.accountSideBarSteps.clickSingInButton();
        browserManager.singInSideBarSteps.inputEmail("srtdf@sda.re");
        browserManager.singInSideBarSteps.inputPassword("PaSSw0rd23423");
        browserManager.singInSideBarSteps.clickSingInButton();
        browserManager.singInSideBarSteps.checkingErrorText();
    }
}
