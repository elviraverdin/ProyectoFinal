package com.amazon.pages;

import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.amazon.utils.Properties;

import java.util.List;

public class WishlistPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public WishlistPage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, Properties.MID_WAIT);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="a[href='/gp/registry/wishlist/ref=cm_wl_your_lists']")
     WebElement myWLists; //a[href="/gp/registry/wishlist/ref=cm_wl_your_lists"]
    @FindBy(xpath = "//*[@id='WLHUC_viewlist']/span/span")
    WebElement verWishLBtn;
    @FindBy(css=".a-fixed-left-grid-col.g-item-sortable-ranking-column.a-col-left")
    WebElement verificarProducto;
    @FindBy(css="h3.a-size-base")
    WebElement nombreProducto;

    public void validateWishListPage(){
        SeleniumUtils.visibilityOfElement(myWLists, wait);
        System.out.println("User now sees My WishLists");
    }

    public void irAWishList(){
        //Presionar Boton Ir a WishList
        SeleniumUtils.clickOnElement(verWishLBtn,wait);
        System.out.println("Ir a WishList");

    }
    public void validateAddedProduct(){
        //Validar que el producto este en la lista
        SeleniumUtils.visibilityOfElement(verificarProducto, wait);
        SeleniumUtils.visibilityOfElement(nombreProducto,wait);
        String nombre = nombreProducto.getText();
        System.out.println("El producto agregado al WishList es: "+ nombre);
    }
}
