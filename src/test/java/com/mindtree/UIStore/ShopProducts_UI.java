package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class ShopProducts_UI {
public static By shop_products_header = By.xpath("//*[@class='menu-item hidden-submenu']//a[contains(text(),'Shop Products')]");
public static By shop_products_powder = By.xpath("//*[@class='menu-item hidden-submenu']//*[contains(text(),'Powder')]");
public static By shop_products_Confirm =By.xpath("//*[@class='col-lg-4 product']//strong[contains(text(),'Free and Gentle')]");
public static By shop_products_Home = By.xpath("//*[@alt='Brand Main Logo']");
}
