package com.amazon.pages;

import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WishlistPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public WishlistPage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, Properties.SHORT_WAIT);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="a[href='/gp/registry/wishlist/ref=cm_wl_your_lists']")
     WebElement myWLists; //a[href="/gp/registry/wishlist/ref=cm_wl_your_lists"]
    @FindBy(css="")
    WebElement wListName;
    @FindBy(css=".a-fixed-left-grid-col.a-col-left")
    List<WebElement> listaWishlist;//.a-fixed-left-grid-col.a-col-left

    public void validateWishListPage(){
        SeleniumUtils.visibilityOfElement(myWLists, wait);
        System.out.println("User now sees My WishLists");
    }
    private String obtenerNombre (WebElement wListName){
        return wListName.getText(); //Id del objeto donde esta especificamente el nombre
    }
    public void validateCreatedWishList(String wishlistName){ // Checar
        for (WebElement wlistname:listaWishlist) {
            if (this.obtenerNombre(wlistname).contains(wishlistName)) {
                System.out.println("WishList: "+wlistname+"is listed");
                break;
            }
        }
    }
}
