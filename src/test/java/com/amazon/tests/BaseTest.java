package com.amazon.tests;

import com.amazon.pages.*;
import com.amazon.utils.Properties;
import com.amazon.utils.SeleniumUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    WebDriver driver;
    WebDriverWait wait;

    protected HomePage home;
    protected LoginPage login;
    protected WishListLoginPage wishlistLogin;
    protected WishlistCreationPopUp popUp;
    protected WishlistPage wishlist;
    protected MyAccoutPage myaccount;
    protected AddProducts products;
    protected ResultsPage resultsPage;
    protected ProductoPage productoPage;
    protected EliminarWishListPage eliminarWishlist;


    @Before
    public void setUp() {
        //work on this one.  the user might be using chromedriver with no .exe extension on unix based systems.
        String driverPath = System.getProperty("user.dir") + "/src/test/java/com/amazon/utils/selenium/webDrivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Properties.SHORT_WAIT, TimeUnit.SECONDS);

        home = new HomePage(driver);
        login = new LoginPage(driver);
        wishlistLogin = new WishListLoginPage(driver);
        wishlist = new WishlistPage(driver);
        myaccount= new MyAccoutPage(driver);
        popUp= new WishlistCreationPopUp(driver);
        products = new AddProducts(driver);
        resultsPage = new ResultsPage(driver);
        productoPage = new ProductoPage(driver);
        eliminarWishlist = new EliminarWishListPage(driver);
    }

    @After
    public void tearDown() {

        //Cerrar driver
        driver.quit();

    }
}
