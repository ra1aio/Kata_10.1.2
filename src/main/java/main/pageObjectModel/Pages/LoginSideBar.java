package main.pageObjectModel.Pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class LoginSideBar {

    @Description("����� � ������ ������������")
    public static final By loginAccountText = By.xpath("//h2[@class='modal-title']");
}
