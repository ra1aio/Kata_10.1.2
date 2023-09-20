import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EntranceToGalleryTest extends BaseTest{

    @Test
    @Description("������ ���������. ���������� ����")
    @DisplayName("���� � �������")
    void search() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.scrollingToButtonToEnterTheGallery();
        browserManager.homePage.enterTheGalleryButton();
        browserManager.galleryPageSteps.verifyTextButton();
    }
}
