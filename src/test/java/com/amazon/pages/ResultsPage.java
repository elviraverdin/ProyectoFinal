package com.amazon.pages;

import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.amazon.utils.Properties;

public class ResultsPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public ResultsPage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css=".a-button-text.a-declarative")
    WebElement ordenarDropdown;
    @FindBy(css="#s-refinements")
    WebElement busquedaFiltros;
    @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/span/a/div/img")
    WebElement producto;

    public void verificarResultsPage(){
        SeleniumUtils.visibilityOfElement(ordenarDropdown, wait);
        SeleniumUtils.visibilityOfElement(busquedaFiltros, wait);
        System.out.println("Usuario esta en la pagina de resultados");
    }

    public void selectProduct(){
        SeleniumUtils.clickOnElement(producto,wait);
        System.out.println("Producto es seleccionado");

    }
}

