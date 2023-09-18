package main.pageObjectModel.Steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObjectModel.Pages.SingInSideBar.*;

public class SingInSideBarSteps {

    @Step("Ввод email")
    public void inputEmail(String email) {
        $(inputEmailField).setValue(email);
    }
    @Step("Ввод пароля")
    public void inputPassword(String password) {
        $(inputPasswordField).setValue(password);
    }
    @Step("Нажать кнопку входа в аккаунт")
    public void clickSingInButton() {
        $(loginButton).click();
    }
    @Step("Проверка текста ошибки при неверном логине и пароле")
    public void checkingErrorText() {
        $(errorTextForIncorrectLoginOrPassword).
                shouldHave(Condition.exactText("Your user name and password are incorrect."));
    }
}
