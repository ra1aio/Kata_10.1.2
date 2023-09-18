package main.pageObjectModel.Steps;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$;
import static main.pageObjectModel.Pages.SearchResultPage.searchResultList;

public class SearchResultSteps {

    @Step("Сравнение результатов поиска")
    public void verifyResultSearch (int expectedQuantity) {
        $$(searchResultList).shouldHave(CollectionCondition.size(expectedQuantity));
    }
}