package com.sakhayadeep.ecom.controller;

import com.sakhayadeep.ecom.entity.Basket;
import com.sakhayadeep.ecom.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {

    @Autowired
    private BasketRepository basketRepository;

    @GetMapping("/getBasket")
    public Basket getBasket() {
        return new Basket();
    }
}
