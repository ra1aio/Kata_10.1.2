package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class GalleryPage {

    @Description("Кнопка загрузки фотографии")
    public static final By uploadImageButton =
            By.xpath("//a[@class='olapic-btn olapic-upload']");
}
