package main.pageObject.pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class ProductPage {

    @Description("Изображение товара")
    public static final By productImage =
            By.xpath("//img[@src='//s7d2.scene7.com/is/image/aeo/0112_6295_470_ob?$pdp-mdg-opt$&fmt=jpeg']");
}
