package main.pageObjectModel.Pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SearchSideBar {

    @Description("���� ����� ���������� �������")
    public static final By searchField =
            By.xpath("//input[contains(@class, 'form-input-search')]");
    @Description("������ �������� ���������� �������")
    public static final By searchButton =
            By.xpath("//button[@aria-label='Search']");
}
