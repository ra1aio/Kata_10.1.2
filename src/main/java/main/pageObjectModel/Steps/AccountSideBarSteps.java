package main.pageObjectModel.Steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObjectModel.Pages.AccountSideBar.createAccountButton;
import static main.pageObjectModel.Pages.AccountSideBar.goToLoginPageButton;

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
