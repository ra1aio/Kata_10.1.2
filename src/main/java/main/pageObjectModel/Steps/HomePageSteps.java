package main.pageObjectModel.Steps;

import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static main.pageObjectModel.Pages.HomePage.*;

public class HomePageSteps {

    @Step("Принять куки")
    public void acceptCookies() {
        $(acceptCookiesButton).shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    @Step("Нажать на кнопку поиска")
    public void clickSearchButton() {
        $(searchButton).click();
    }

    @Step("Нажать на кнопку аккаунта")
    public void clickAccountButton() {
        $(accountButton).click();
    }
}
