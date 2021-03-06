package com.amazon.pages;

import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, Properties.MID_WAIT);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="h1.a-spacing-small")
    WebElement loginTxt; //h1.a-spacing-small
    @FindBy(css="#ap_email")
    WebElement email; // #ap_email
    @FindBy(css="#ap_password")
    WebElement password;// #ap_password
    @FindBy(css= "#signInSubmit")
    WebElement loginBtn; // #signInSubmit
    @FindBy(css="#nav-link-accountList .nav-line-1-container .nav-line-1")
    WebElement successLogin; //#nav-link-accountList .nav-line-1-container .nav-line-1
    @FindBy(css="span #continue")
    WebElement continueBtn;
    @FindBy(xpath = "//*[@id='nav-link-accountList']/div/span")
    WebElement nombre;

    public void validateLogInPage(){
        SeleniumUtils.visibilityOfElement(loginTxt, wait);
    }
    public void sendCredentials(){
        SeleniumUtils.sendKeysElement(email,wait, Properties.USERNAME);
        SeleniumUtils.sendKeysElement(password,wait, Properties.PASSWORD);
        System.out.println("User sends user and password");
        SeleniumUtils.clickOnElement(loginBtn,wait);
        System.out.println("User clicked on Login button");
    }
    public void sendCredentialsProduct(){
        SeleniumUtils.sendKeysElement(email,wait, Properties.USERNAME);
        SeleniumUtils.clickOnElement(continueBtn,wait);
        SeleniumUtils.sendKeysElement(password,wait, Properties.PASSWORD);
        System.out.println("User sends user and password");
        SeleniumUtils.clickOnElement(loginBtn,wait);
        System.out.println("User clicked on Login button");
    }

    public void validateSuccessLogin(){
        SeleniumUtils.visibilityOfElement(successLogin, wait);
        SeleniumUtils.visibilityOfElement(nombre, wait);
        String saludo = nombre.getText();
        if(saludo.contains("Hola")) {
            System.out.println("User is on Login Page");
        }
        System.out.println(successLogin.getText()+" you are logged now");
    }

}
