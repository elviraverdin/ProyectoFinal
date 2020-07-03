package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishlistCreationPopUp {
    public WebDriver driver;
    public WebDriverWait wait;

    public WishlistCreationPopUp(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
}
