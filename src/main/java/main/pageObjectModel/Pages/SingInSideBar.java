package main.pageObjectModel.Pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SingInSideBar {

    @Description("���� ����� email")
    public static final By inputEmailField =
            By.xpath("//input[contains(@class, 'form-input-username')]");
    @Description("���� ����� ������")
    public static final By inputPasswordField =
            By.xpath("//input[contains(@class, 'form-input-password')]");
    @Description("������ ����� � �������")
    public static final By loginButton =
            By.xpath("//button[contains(@class, 'qa-btn-login')]");
    @Description("����� ������ ��� �������� ������ ��� ������")
    public static final By errorTextForIncorrectLoginOrPassword =
            By.xpath("//div[contains(@class, 'qa-error-help-block')]");
}
