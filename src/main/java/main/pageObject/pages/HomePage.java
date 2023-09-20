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

    @Description("���� � ������� ����� � �������")
    public static final By blockWithButtonToEnterTheGallery =
            By.id("olapic_specific_widget");

    @Description("������ ����� � �������")
    public static final By toEnterTheGalleryButton =
            By.xpath("//a[@class='k olapic-k msg-link-to']");
}
