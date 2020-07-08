package com.amazon.pages;


import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import com.amazon.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddProducts {

    public WebDriver driver;
    public WebDriverWait wait;

    public AddProducts(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, Properties.MID_WAIT);
        PageFactory.initElements(driver, this);
    }

    //barra de busqueda
    @FindBy(css="#twotabsearchtextbox")
    WebElement searchBar;
    //Boton de lupa
    @FindBy(css=".nav-input")
    WebElement searchBtn;
    @FindBy(css="#profile-list-name")
    WebElement listName;

    public void verificarSearchPage(){
        wait.until(ExpectedConditions.visibilityOf(searchBar));
    }

    public void searchProduct(String producto){
        SeleniumUtils.sendKeysElement(searchBar,wait, producto);
        searchBtn.submit();
        System.out.println("User is now searching for products");
    }

}
