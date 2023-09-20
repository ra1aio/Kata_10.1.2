package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SearchResultPage {

    @Description("������ ����������� ������")
    public static final By searchResultList =
            By.xpath("//div[contains(@class, 'product-tile qa-product-tile __eadf2')]");

    @Description("��������� ������")
    public static final By searchResult =
            By.xpath("//img[@class='img-responsive product-tile-image img-responsive']");
}
