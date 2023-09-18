package main.pageObjectModel.Steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static main.pageObjectModel.Pages.CreateAccountPage.*;

public class CreateAccountSteps {

    @Step("���� email")
    public void inputEmail(String email) {
        $(inputEmailField).setValue(email);
    }

    @Step("���� �����")
    public void inputFirstName(String firstName) {
        $(inputFirstNameField).setValue(firstName);
    }

    @Step("���� �������")
    public void inputLastName(String lastName) {
        $(inputLastNameField).setValue(lastName);
    }

    @Step("���� ������")
    public void inputPassword(String password) {
        $(inputPasswordField).setValue(password);
    }

    @Step("���� ������������� ������")
    public void inputConfirmPassword(String confirmPassword) {
        $(inputConfirmPasswordField).setValue(confirmPassword);
    }

    @Step("���� ��������� �������")
    public void inputZipCode(String zipCode) {
        $(inputZipCodeField).setValue(zipCode);
    }

    @Step("���� ������ ��������")
    public void inputMonthOfBirth() {
        $(monthOfBirthSelection).click();
    }

    @Step("���� ��� ��������")
    public void inputDayOfBirth() {
        $(dayOfBirthSelection).click();
    }

    @Step("���-���� ���������� � ���������")
    public void acceptTermsCheckBox() {
        $(conditionsAcceptanceCheckbox).click();
    }

    @Step("������ �������� ������� ������")
    public void createAccountButton() {
        $(createAccountButton).click();
    }
}
