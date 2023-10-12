package com.sakhayadeep.ecom.repository;

import com.sakhayadeep.ecom.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Product product = Product.builder()
                .productName("repository test product")
                .shortDescription("product used for testing repository")
                .price(BigDecimal.valueOf(1100.99))
                .build();
        entityManager.persist(product);
    }

    @Test
    public void whenFindById_thenReturnProduct() {
        Product product = productRepository.findById(1L).get();
        assertEquals(product.getProductName(), "repository test product");
    }
}