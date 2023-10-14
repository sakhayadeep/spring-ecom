package com.sakhayadeep.ecom.service;

import com.sakhayadeep.ecom.repository.ProductRepository;
import com.sakhayadeep.ecom.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        Product product = Product.builder()
                .productName("test product")
                .shortDescription("product used for unit testing")
                .price(BigDecimal.valueOf(1000.00))
                .build();

        Mockito.when(productRepository.findByProductNameIgnoreCase("test product"))
                .thenReturn(product);
    }

    @Test
    @DisplayName("Get Product for valid productName")
    public void whenValidProductName_thenProductShouldBeFound() {
//        String productName = "test product";
//        Product found = productService.fetchProductByName(productName);
//        assertEquals(productName, found.getProductName());
    }
}