import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    @Test
    @Description("Данные корректны. Позитивный тест")
    @DisplayName("Поиск товара")
    void search() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickSearchButton();
        browserManager.searchSideBar.inputStringSearch("0436");
        // Далее постоянно меняется кол-во найденных товаров. Не факт, что с первого раза угадаешь. )))
        browserManager.searchResult.verifyResultSearch(23);
    }
}
