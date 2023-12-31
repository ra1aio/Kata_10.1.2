package main.pageObject.steps;

import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.HomePage.*;

public class HomePageSteps {

    @Step("������� ����")
    public void acceptCookies() {
        $(acceptCookiesButton).shouldBe(visible, Duration.ofSeconds(60)).click();
    }

    @Step("������ �� ������ ������")
    public void clickSearchButton() {
        $(searchButton).click();
    }

    @Step("������ �� ������ ��������")
    public void clickAccountButton() {
        $(accountButton).click();
    }
}
