package main;

import com.codeborne.selenide.Configuration;
import main.pageObjectModel.BrowserSteps;

public class BrowserManagerBase {

    public final BrowserSteps browser = new BrowserSteps();

    public void initDesktopDriver() {
        initDriver();
        Configuration.browserSize = "1400x800";
    }

    private void initDriver() {
        Configuration.pageLoadTimeout = 20000;
        Configuration.timeout = 15000;
    }
}
