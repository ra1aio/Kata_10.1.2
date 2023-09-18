import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    @Test
    @Description("������ ���������. ���������� ����")
    @DisplayName("����� ������")
    void search() {
        browserManager.homePage.acceptCookies();
        browserManager.homePage.clickSearchButton();
        browserManager.searchSideBar.inputStringSearch("0436");
        // ����� ��������� �������� ���-�� ��������� �������. �� ����, ��� � ������� ���� ��������. )))
        browserManager.searchResult.verifyResultSearch(23);
    }
}
