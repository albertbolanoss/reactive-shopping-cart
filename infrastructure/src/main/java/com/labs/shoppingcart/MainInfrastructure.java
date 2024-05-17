package com.labs.shoppingcart;

import com.labs.shoppingcart.application.service.ShoppingCartAppService;

public class MainInfrastructure {

    public static void main(String[] args) {
        System.out.println("I'm in infrastructure layer");
        new ShoppingCartAppService().greet();
    }
}