package main.pageObject.steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static main.pageObject.pages.HomePage.*;

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

    @Step("Скроллинг страницы до блока с кнопкой для входа в галерею")
    public void scrollingToButtonToEnterTheGallery () {
        $(blockWithButtonToEnterTheGallery).scrollTo();
    }

    @Step("Вход в галерею")
    public void enterTheGalleryButton () {
        $(toEnterTheGalleryButton).click();
        sleep(10000);

    }
}
