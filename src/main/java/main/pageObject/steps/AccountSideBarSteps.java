package main.pageObject.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.AccountSideBar.createAccountButton;
import static main.pageObject.pages.AccountSideBar.goToLoginPageButton;

public class AccountSideBarSteps {

    @Step("������ ������ ����� � �������")
    public void clickSingInButton() {
        $(goToLoginPageButton).click();
    }

    @Step("������ ������ �������� ��������")
    public void clickCreateAccountButton() {
        $(createAccountButton).click();
    }
}
