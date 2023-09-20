package main;

import main.pageObject.steps.*;

public class BrowserManager extends BrowserManagerBase {

    public final HomePageSteps homePage = new HomePageSteps();
    public final SearchSideBarSteps searchSideBar = new SearchSideBarSteps();
    public final SearchResultSteps searchResult = new SearchResultSteps();
    public final AccountSideBarSteps accountSideBarSteps = new AccountSideBarSteps();
    public final CreateAccountSteps createAccountSteps = new CreateAccountSteps();
    public final AccountPageSteps accountPageSteps = new AccountPageSteps();
    public final SingInSideBarSteps singInSideBarSteps = new SingInSideBarSteps();
    public final LoginSideBarSteps loginSideBarSteps = new LoginSideBarSteps();
}
