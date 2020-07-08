package com.amazon.tests;

import com.amazon.utils.Properties;
import org.junit.Test;

public class createWishlist extends BaseTest {
        @Test
        public void createWishlistA() {
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
            wishlist.validateWishListPage();
        }

        @Test
        public void addProductsWishList(){
            home.navegar();
            home.verificarPagina();
            products.verificarSearchPage();
            products.searchProduct(Properties.PRODUCTO1);
            resultsPage.verificarResultsPage();
            resultsPage.selectProduct();
            productoPage.verificarPaginaDeProducto();
            productoPage.addProductToWishList();
            login.sendCredentialsProduct();
            login.validateSuccessLogin();
            productoPage.loggedUseraddProductToWishList();
            wishlist.irAWishList();
            wishlist.validateWishListPage();
            wishlist.validateAddedProduct();
            eliminarWishlist.eliminarWishList();
        }
}
