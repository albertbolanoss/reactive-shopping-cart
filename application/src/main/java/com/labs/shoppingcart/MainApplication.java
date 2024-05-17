package com.labs.shoppingcart;

import com.labs.shoppingcart.domain.service.ShoppingCartDomainService;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("I'm in application layer");
        new ShoppingCartDomainService().greet();
    }
}