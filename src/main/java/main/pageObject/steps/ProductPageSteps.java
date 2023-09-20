package main.pageObject.steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.ProductPage.productImage;

public class ProductPageSteps {

    @Step("Проверка фотографии")
    public void verifyImage () {
        Assertions.assertTrue($(productImage).isImage());

    }
}
