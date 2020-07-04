package com.amazon.tests;

import org.junit.Test;

public class createWishlist extends BaseTest {

        @Test
        public void createWishlist() {
            home.navegar();
            home.verificarPagina();
            home.navegarAMiCuenta();
            myaccount.validateMyAccountPage();
            myaccount.seleccionarWishlistoption();
            myaccount.goToLoginPage();
            login.validateLogInPage();
            login.sendCredentials();
            login.validateSuccessLogin();
            wishlistLogin.validateWishListPage();
            wishlistLogin.clickOnCreateWishlist();
            popUp.validateCreatePopUp();
            popUp.submitWihList();
            //wishlist
        }

}
