package com.sakhayadeep.ecom.repository;

import com.sakhayadeep.ecom.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findByProductName(String productName);

    public Product findByProductNameIgnoreCase(String productName);
}
