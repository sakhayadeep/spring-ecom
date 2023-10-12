package com.sakhayadeep.ecom.service;

import com.sakhayadeep.ecom.entity.Basket;
import com.sakhayadeep.ecom.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BasketServiceImpl implements BasketService {
    private final BasketRepository basketRepository;

    @Autowired
    public BasketServiceImpl(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public Basket getBasket(Long basketId) {
        Optional<Basket> basket = basketRepository.findById(basketId);
        return basket.orElse(null);
    }
}
