package com.sakhayadeep.ecom.repository;

import com.sakhayadeep.ecom.entity.ProductLineItem;
import com.sakhayadeep.ecom.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ProductLineItemRepositoryTest {
    @Autowired
    private ProductLineItemRepository productLineItemRepository;

//    @Test
//    public void saveProductLineItem() {
//        Product product = Product.builder()
//                .productName("test product")
//                .shortDescription("Just a product to test that it's working")
//                .price(BigDecimal.valueOf(69.96))
//                .build();
//        ProductLineItem productLineItem = ProductLineItem.builder()
//                .quantity(1)
//                .product(product)
//                .build();
//
//        productLineItemRepository.save(productLineItem);
//    }

//    @Test
//    public void printAllProductLineItems() {
//        List<ProductLineItem> productLineItems = productLineItemRepository.findAll();
//        System.out.println("productLineItems = " + productLineItems);
//    }
}