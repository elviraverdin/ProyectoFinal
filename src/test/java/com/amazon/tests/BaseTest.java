package com.amazon.tests;

import com.amazon.pages.*;
import com.amazon.utils.Properties;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    WebDriver driver;

    protected HomePage home;
    protected LoginPage login;
    protected WishListLoginPage wishlistLogin;
    protected WishlistCreationPopUp popUp;
    protected WishlistPage wishlist;
    protected MyAccoutPage myaccount;


    @Before
    public void setUp() {
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

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
