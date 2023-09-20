package main.pageObject.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.GalleryPage.uploadImageButton;

public class GalleryPageSteps {

    @Step("Проверка надписи на кнопке")
    public void verifyTextButton() {
        $(uploadImageButton).shouldHave(Condition.exactText("upload your photo"));
    }
}
