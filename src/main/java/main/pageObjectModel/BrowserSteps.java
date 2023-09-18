package main.pageObjectModel;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class BrowserSteps {

    @Step("Open page: '{url}'")
    public void openPage(String url) {
        Configuration.proxyEnabled = false;
        open(url);
    }
}
