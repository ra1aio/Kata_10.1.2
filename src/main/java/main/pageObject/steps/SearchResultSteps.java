package main.pageObject.steps;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static main.pageObject.pages.SearchResultPage.searchResult;
import static main.pageObject.pages.SearchResultPage.searchResultList;

public class SearchResultSteps {

    @Step("Сравнение результатов поиска")
    public void verifyResultSearch (int expectedQuantity) {
        $$(searchResultList).shouldHave(CollectionCondition.size(expectedQuantity));
    }

    @Step("Переход на страницу товара")
    public void goToSearchProduct () {
        $(searchResult).click();
    }
}