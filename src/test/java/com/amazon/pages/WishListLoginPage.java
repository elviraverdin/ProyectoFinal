package com.amazon.pages;

import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WishListLoginPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public WishListLoginPage(WebDriver we) {
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="a[href='/gp/registry/wishlist/ref=cm_wl_your_lists']")
    WebElement misListasTxt; //a[href="/gp/registry/wishlist/ref=cm_wl_your_lists"]
    @FindBy(css="#createList")
    WebElement crearWishlist;//#createList

    public void validateWishListPage(){
        SeleniumUtils.visibilityOfElement(misListasTxt,wait);
        System.out.println("User is on WishList Page");
    }
    public void clickOnCreateWishlist(){
        SeleniumUtils.clickOnElement(crearWishlist,wait);
        System.out.println("User clicked on Create Wishlist");
    }
}

