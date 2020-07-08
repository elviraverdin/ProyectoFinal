package com.amazon.pages;

import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductoPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public ProductoPage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, Properties.MID_WAIT);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="#wishListMainButton-announce")
    WebElement agregarListaBoton;
    @FindBy(xpath="//*[@id='add-to-cart-button']")
    WebElement agregatrCarritoBoton;
    @FindBy (xpath="//*[@id='buy-now-button']")
    WebElement comprarAhoraBoton;
    @FindBy(css="#add-to-wishlist-button-submit")
    WebElement addWishL2;

    public void verificarPaginaDeProducto(){
        SeleniumUtils.visibilityOfElement(agregatrCarritoBoton,wait);
        SeleniumUtils.visibilityOfElement(comprarAhoraBoton,wait);
        System.out.println("User is on Product Page");
    }
    public void addProductToWishList(){
        SeleniumUtils.clickOnElement(agregarListaBoton,wait);
        System.out.println("Producto es agregado al Wishlist");
    }

    public void  loggedUseraddProductToWishList(){
        SeleniumUtils.clickOnElement(addWishL2,wait);
        System.out.println("Producto es agregado al Wishlist");
    }



}

