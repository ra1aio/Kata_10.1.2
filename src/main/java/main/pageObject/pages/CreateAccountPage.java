package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class CreateAccountPage {

    @Description("���� ����� email")
    public static final By inputEmailField =
            By.xpath("//input[@placeholder='Email']");

    @Description("���� ����� �����")
    public static final By inputFirstNameField =
            By.xpath("//input[@placeholder='First Name']");

    @Description("���� ����� �������")
    public static final By inputLastNameField =
            By.xpath("//input[@placeholder='Last Name']");

    @Description("���� ����� ������")
    public static final By inputPasswordField =
            By.xpath("//input[@placeholder='Password']");

    @Description("���� ������������� ������")
    public static final By inputConfirmPasswordField =
            By.xpath("//input[@placeholder='Confirm Password']");

    @Description("���� ����� ��������� �������")
    public static final By inputZipCodeField =
            By.xpath("//input[@placeholder='Zip Code']");

    @Description("������ ������ ������ ��������")
    public static final By monthOfBirthSelection =
            By.xpath("//select[@name='month']/option[text()='April']");

    @Description("������ ������ ��� ��������")
    public static final By dayOfBirthSelection =
            By.xpath("//select[@name='day']/option[text()='1']");

    @Description("������� �������� �������")
    public static final By conditionsAcceptanceCheckbox =
            By.xpath("//label[@class='aeo-checkbox-label clickable']");

    @Description("������ �������� ��������")
    public static final By createAccountButton =
            By.xpath("//button[contains(@class, 'qa-btn-register')]");
}
