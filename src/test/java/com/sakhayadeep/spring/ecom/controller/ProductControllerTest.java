package com.sakhayadeep.spring.ecom.controller;

import com.sakhayadeep.spring.ecom.entity.Product;
import com.sakhayadeep.spring.ecom.errorHandling.ProductNotFoundException;
import com.sakhayadeep.spring.ecom.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    private Product product;

    @BeforeEach
    void setUp() {
        product = Product.builder()
                .productName("controller test product")
                .shortDescription("product used for testing the controller")
                .price(BigDecimal.valueOf(699.96))
                .productId(1L)
                .build();
    }

    @Test
    void saveProduct() throws Exception {
        Product inputProduct = Product.builder()
                .productName("controller test product")
                .shortDescription("product used for testing the controller")
                .price(BigDecimal.valueOf(699.96))
                .build();
        Mockito.when(productService.saveProduct(inputProduct))
                .thenReturn(product);
        mockMvc.perform(post("/saveProduct")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"productName\":\"controller test product\",\n" +
                        "    \"shortDescription\":\"product used for testing the controller\",\n" +
                        "    \"price\":\"699.96\"\n" +
                        "}"))
                .andExpect(status().isOk());
    }

    @Test
    void fetchProductById() throws Exception {
        Mockito.when(productService.fetchProductById(1L))
                .thenReturn(product);
        mockMvc.perform(get("/product/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productName").value(product.getProductName()));
    }
}