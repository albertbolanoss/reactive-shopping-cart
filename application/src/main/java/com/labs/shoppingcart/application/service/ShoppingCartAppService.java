package com.labs.shoppingcart.application.service;

import com.labs.shoppingcart.domain.service.ShoppingCartDomainService;

public class ShoppingCartAppService {
    public void greet() {
        System.out.println("I'm in application layer");
        new ShoppingCartDomainService().greet();
    }
}
