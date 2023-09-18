package main.pageObjectModel.Pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class AccountSideBar {

    @Description(" нопка перехода на страницу входа в аккаунт")
    public static final By goToLoginPageButton =
            By.xpath("//button[contains(@class, 'btn btn-secondary qa-btn-signin')]");

    @Description(" нопка создани€ аккаунта")
    public static final By createAccountButton =
            By.xpath("//a[contains(@class, 'qa-btn-register btn-action')]");
}
