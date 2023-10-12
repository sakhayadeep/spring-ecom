package com.sakhayadeep.ecom.repository;

import com.sakhayadeep.ecom.entity.ProductLineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLineItemRepository extends JpaRepository<ProductLineItem, Long> {
}
