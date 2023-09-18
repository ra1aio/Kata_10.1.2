package main.pageObjectModel.Steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObjectModel.Pages.AccountSideBar.createAccountButton;
import static main.pageObjectModel.Pages.AccountSideBar.goToLoginPageButton;

public class AccountSideBarSteps {

    @Step("Нажать кнопку входа в аккаунт")
    public void clickSingInButton() {
        $(goToLoginPageButton).click();
    }

    @Step("Нажать кнопку создания аккаунта")
    public void clickCreateAccountButton() {
        $(createAccountButton).click();
    }
}
