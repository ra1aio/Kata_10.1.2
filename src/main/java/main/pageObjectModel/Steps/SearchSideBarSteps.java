package main.pageObjectModel.Steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObjectModel.Pages.SearchSideBar.searchButton;
import static main.pageObjectModel.Pages.SearchSideBar.searchField;

public class SearchSideBarSteps {

    @Step("¬вод в поисковую строку {searchText}")
    public void inputStringSearch(String searchText) {
        $(searchField).setValue(searchText);
        $(searchButton).click();
    }
}
