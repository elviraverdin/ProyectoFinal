package com.amazon.pages;

import com.amazon.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css=".nav-logo-link")
    WebElement logoAmazon;
    @FindBy(css=".hm-icon.nav-sprite")
    WebElement hamburguerIcon;
    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[28]/a")
    WebElement miCuentaOpcion;

    public void navegar(){
      driver.get(Properties.URL);
    }
    public void verificarPagina(){
        wait.until(ExpectedConditions.visibilityOf(logoAmazon));
    }
    public void navegarAMiCuenta(){
        wait.until(ExpectedConditions.visibilityOf(hamburguerIcon));
        hamburguerIcon.click();
        wait.until(ExpectedConditions.visibilityOf(miCuentaOpcion));
        miCuentaOpcion.click();

    }
}
