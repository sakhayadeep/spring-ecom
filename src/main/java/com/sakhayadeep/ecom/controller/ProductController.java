package com.sakhayadeep.ecom.controller;

import com.sakhayadeep.ecom.entity.Product;
import com.sakhayadeep.ecom.errorHandling.ProductNotFoundException;
import com.sakhayadeep.ecom.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @PostMapping("/saveProduct")
    public Product saveProduct(@Valid @RequestBody Product product) {
        LOGGER.info("Saving product.");
        return productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> fetchProductList() {
        return productService.fetchProductList();
    }

    @GetMapping("/product/{id}")
    public Product fetchProductById(@PathVariable("id") Long productId) throws ProductNotFoundException {
        return productService.fetchProductById(productId);
    }

    @DeleteMapping("/delete/product/{id}")
    public String deleteProductById(@PathVariable("id") Long productId) {
        productService.deleteProductById(productId);
        return "Product deleted successfully.";
    }

    @PatchMapping("/product/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return productService.updateProduct(productId, product);
    }

    @GetMapping("/product/name/{name}")
    public Product fetchProductByName(@PathVariable("name") String productnName){
        return  productService.fetchProductByName(productnName);
    }
}
