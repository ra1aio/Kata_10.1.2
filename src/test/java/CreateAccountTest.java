import jdk.jfr.Description;
import main.utils.EmailGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateAccountTest extends BaseTest{

    @Test
    @Description("������ ���������. ���������� ����.")
    @DisplayName("����������� ������ ��������")
    void createNewAccount() {
        String firstName = "Tom";

        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickAccountButton();
        browserManager.accountSideBarSteps.clickCreateAccountButton();
        browserManager.createAccountSteps.inputEmail(EmailGenerator.getEmail("gmail.com"));
        browserManager.createAccountSteps.inputFirstName(firstName);
        browserManager.createAccountSteps.inputLastName("Cruise");
        browserManager.createAccountSteps.inputPassword("PaSSw0rd");
        browserManager.createAccountSteps.inputConfirmPassword("PaSSw0rd");
        browserManager.createAccountSteps.inputZipCode("00772");
        browserManager.createAccountSteps.inputMonthOfBirth();
        browserManager.createAccountSteps.inputDayOfBirth();
        browserManager.createAccountSteps.acceptTermsCheckBox();
        browserManager.createAccountSteps.createAccountButton();
        // ����� ���� ������, ������ ��� �� ���������� ���� �� ���������� ������ "Create account"
        browserManager.accountPageSteps.verifyAccountName(firstName);
    }
}
