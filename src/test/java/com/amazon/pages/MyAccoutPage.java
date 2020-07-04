package com.amazon.pages;

import com.amazon.tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccoutPage extends BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public MyAccoutPage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="[href='https://www.amazon.com.mx/wishlist?ref_=ya_d_l_lists']")
    WebElement wishlistBtn;
    @FindBy(css=".a-row.a-spacing-base")
    WebElement miCuentatxt; //
    @FindBy(css="#a-autoid-0-announce")
    WebElement identificateBtn;

    public void validateMyAccountPage(){
        wait.until(ExpectedConditions.visibilityOf(miCuentatxt));
        System.out.println("User is on my Account Page");
    }
public void seleccionarWishlistoption(){
        wait.until(ExpectedConditions.visibilityOf(wishlistBtn));
        wishlistBtn.click();
        System.out.println("User clicked on Wishlist button");
}
public void goToLoginPage(){
    wait.until(ExpectedConditions.visibilityOf(identificateBtn));
    identificateBtn.click();
    System.out.println("User clicked on SignIn");
}
}
