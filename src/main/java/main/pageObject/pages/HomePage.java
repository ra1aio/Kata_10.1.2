package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class HomePage {

    @Description("������ �������� cookies")
    public static final By acceptCookiesButton = By.id("onetrust-accept-btn-handler");

    @Description("������ �������� ����� ������")
    public static final By searchButton =
            By.xpath("//button[contains(@class, 'btn-link qa-btn-search-cta')]");

    @Description("������ �������� ����� ��������")
    public static final By accountButton =
            By.xpath("//a[contains(@class, 'qa-show-sidetray-account')]");
}
