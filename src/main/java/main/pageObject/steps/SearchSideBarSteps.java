package main.pageObject.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.SearchSideBar.searchButton;
import static main.pageObject.pages.SearchSideBar.searchField;

public class SearchSideBarSteps {

    @Step("¬вод в поисковую строку {searchText}")
    public void inputStringSearch(String searchText) {
        $(searchField).setValue(searchText);
        $(searchButton).click();
    }
}
