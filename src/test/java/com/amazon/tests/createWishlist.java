package com.amazon.tests;

import org.junit.Test;

public class createWishlist extends BaseTest {

        @Test
        public void createWishlist() {
            home.navegar();
            home.verificarPagina();
            home.navegarAMiCuenta();
        }

}
