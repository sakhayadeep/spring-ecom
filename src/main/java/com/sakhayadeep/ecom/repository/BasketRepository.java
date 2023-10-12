package com.sakhayadeep.ecom.repository;

import com.sakhayadeep.ecom.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {

}
