package main.pageObjectModel.Steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObjectModel.Pages.AccountPage.textAccountName;

public class AccountPageSteps {

    @Step("Проверка имени аккаунта")
    public void verifyAccountName(String name) {
        $(textAccountName).shouldHave(Condition.exactText(name + "'s Account"));
    }
}
