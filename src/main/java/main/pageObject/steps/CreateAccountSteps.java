package main.pageObject.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObject.pages.CreateAccountPage.*;

public class CreateAccountSteps {

    @Step("¬вод email")
    public void inputEmail(String email) {
        $(inputEmailField).setValue(email);
    }

    @Step("¬вод имени")
    public void inputFirstName(String firstName) {
        $(inputFirstNameField).setValue(firstName);
    }

    @Step("¬вод фамилии")
    public void inputLastName(String lastName) {
        $(inputLastNameField).setValue(lastName);
    }

    @Step("¬вод парол€")
    public void inputPassword(String password) {
        $(inputPasswordField).setValue(password);
    }

    @Step("¬вод подтверждени€ парол€")
    public void inputConfirmPassword(String confirmPassword) {
        $(inputConfirmPasswordField).setValue(confirmPassword);
    }

    @Step("¬вод почтового индекса")
    public void inputZipCode(String zipCode) {
        $(inputZipCodeField).setValue(zipCode);
    }

    @Step("¬вод мес€ца рождени€")
    public void inputMonthOfBirth() {
        $(monthOfBirthSelection).click();
    }

    @Step("¬вод дн€ рождени€")
    public void inputDayOfBirth() {
        $(dayOfBirthSelection).click();
    }

    @Step("„ек-бокс соглашение с услови€ми")
    public void acceptTermsCheckBox() {
        $(conditionsAcceptanceCheckbox).click();
    }

    @Step(" нопка создани€ учетной записи")
    public void createAccountButton() {
        $(createAccountButton).click();
    }
}
