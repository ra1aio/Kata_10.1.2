import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ImageTest extends BaseTest{

    @Test
    @Description("Данные корректны. Позитивный тест.")
    @DisplayName("Проверка фотографии товара")
    void isImage() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickSearchButton();
        browserManager.searchSideBar.inputStringSearch("0112-6295");
        browserManager.searchResult.goToSearchProduct();
        browserManager.productPageSteps.verifyImage();
    }
}
