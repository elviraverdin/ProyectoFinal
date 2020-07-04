package com.amazon.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import com.amazon.utils.Properties.*;

public class SeleniumUtils {
    public static void clickOnElement (WebElement webElement, Wait wait) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }
    public static void visibilityOfElement (WebElement webElement, Wait wait) {
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }
    public static void sendKeysElement (WebElement webElement, Wait wait,String skeys) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(skeys);
    }
}
