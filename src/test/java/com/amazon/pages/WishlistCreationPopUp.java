package com.amazon.pages;

import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishlistCreationPopUp {
    public WebDriver driver;
    public WebDriverWait wait;

    public WishlistCreationPopUp(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, Properties.MID_WAIT);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#a-popover-2")
    WebElement createWishListPopUp;
    @FindBy(css="#a-popover-header-2")
    WebElement title; //#a-popover-header-2F
    @FindBy(css="#list-name")
    WebElement inputWishlistName; //#list-name
    @FindBy(css="#wl-redesigned-create-list")
    WebElement submitbtn; //#wl-redesigned-create-list

    public void validateCreatePopUp(){
        SeleniumUtils.clickOnElement(createWishListPopUp,wait);
        System.out.println("Create PopUp is found");
        SeleniumUtils.visibilityOfElement(title, wait);
        System.out.println("PopUp title is found");

    }
    public void submitWihList(){
        SeleniumUtils.sendKeysElement(inputWishlistName,wait,"Lista Automatizada");
        System.out.println("User adds a name to the wishlist");
        SeleniumUtils.clickOnElement(submitbtn,wait);
        System.out.println("User submitted the new Wishlist");
    }
}
