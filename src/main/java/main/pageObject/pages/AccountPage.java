package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class AccountPage {

    @Description("����� � ������ ������������")
    public static final By textAccountName =
            By.xpath("//div[@class='text-bold qa-list-menu-header _account-menu-header_1g7qxv']");
}
