package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class GalleryPage {

    @Description("������ �������� ����������")
    public static final By uploadImageButton =
            By.xpath("//a[@class='olapic-btn olapic-upload']");
}
