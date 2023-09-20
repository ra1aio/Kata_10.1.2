package main.pageObject.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.LoginSideBar.loginAccountText;

public class LoginSideBarSteps {

    @Step("Сравнение имени пользователя")
    public void verifyAccountName (String name) {
        $(loginAccountText).shouldHave(Condition.exactText(name + "'s Account"));
    }
}
