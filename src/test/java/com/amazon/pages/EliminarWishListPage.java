package com.amazon.pages;

import com.amazon.pages.*;
import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class EliminarWishListPage {

        public WebDriver driver;
        public WebDriverWait wait;

        public EliminarWishListPage(WebDriver we){
            this.driver = we;
            wait = new WebDriverWait(driver, Properties.MID_WAIT);
            PageFactory.initElements(driver, this);
        }

public void eliminarWishList(){ //Mouse over
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id='overflow-menu-popover-trigger']/div[1]/span/img"));
        action.moveToElement(we).moveToElement(driver.findElement(By.cssSelector("#editYourList"))).click().build().perform();

        WebElement adminListatitulo = driver.findElement(By.cssSelector("h4.a-popover-header-content"));
        WebElement eliminarListaBtn = driver.findElement(By.xpath("//*[@id='list-settings-container']/span/span/span/input"));
        SeleniumUtils.visibilityOfElement(adminListatitulo,wait);

        String s = adminListatitulo.getText();
        if(s.contains("Administrar lista")){
            System.out.println("Usuario esta en Administrar lista modal");
        }
        SeleniumUtils.clickOnElement(eliminarListaBtn,wait);

        System.out.println("Usuario dio click al boton Eliminar lista");
        }


    //Amazon Logout

}
