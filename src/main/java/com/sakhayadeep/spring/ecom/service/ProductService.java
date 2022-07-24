package com.sakhayadeep.spring.ecom.service;

import com.sakhayadeep.spring.ecom.entity.Product;
import com.sakhayadeep.spring.ecom.errorHandling.ProductNotFoundException;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);

    public List<Product> fetchProductList();

    public Product fetchProductById(Long productId) throws ProductNotFoundException;

    public void deleteProductById(Long productId);

    public Product updateProduct(Long productId, Product product);

    public Product fetchProductByName(String productnName);
}
