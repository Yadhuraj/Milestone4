package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class SearchItem_UI {
public static By Search_bar_input = By.xpath("//*[@type='search']");
public static By Search_bar_present = By.xpath("//*[@class='product-preview-content']//strong[contains(text(),'Antibacterial')]");
public static By Search_bar_Home = By.xpath("//*[@alt='Brand Main Logo']");
}
