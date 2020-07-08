package com.amazon.pages;

import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public HomePage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, Properties.MID_WAIT);
        PageFactory.initElements(driver, this); //inicializa el PAge Factory para poder agregar los elementos por medio del FindBy
    }
    //Declara todos los webelements que se necesitan durante el uso del Home Page
    @FindBy(css=".nav-logo-link")
    WebElement logoAmazon;
    @FindBy(css=".hm-icon.nav-sprite")
    WebElement hamburguerIcon;
    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[28]/a")
    WebElement miCuentaOpcion;

    public void navegar(){
      driver.get(Properties.URL);
    }//Navega a URL definida en la clase Properties dentro de la variable URL
    public void verificarPagina(){
        //Verifica que el elemento este visible usando la funcion visibilityOfElement en la clase SeleniumUtils
        SeleniumUtils.visibilityOfElement(logoAmazon,wait);
    }
    public void navegarAMiCuenta(){
        //Verifica que ambos elementos esten visibles usando la funcion clickonElement y despues de la click en la clase SeleniumUtils
        SeleniumUtils.clickOnElement(hamburguerIcon, wait);
        SeleniumUtils.clickOnElement(miCuentaOpcion, wait);
    }
}
