package com.sakhayadeep.spring.ecom.service;

import com.sakhayadeep.spring.ecom.entity.Product;
import com.sakhayadeep.spring.ecom.errorHandling.ProductNotFoundException;
import com.sakhayadeep.spring.ecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> fetchProductList() {
        return productRepository.findAll();
    }

    @Override
    public Product fetchProductById(Long productId) throws ProductNotFoundException {

        Optional<Product> product = productRepository.findById(productId);
        if(!product.isPresent()) {
            throw new ProductNotFoundException("Product not found!");
        }
        return product.get();
    }

    @Override
    public void deleteProductById(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        Product productDB = productRepository.findById(productId).get();
        if(Objects.nonNull(product.getProductName()) &&
                !"".equalsIgnoreCase(product.getProductName())) {
            productDB.setProductName(product.getProductName());
        }
        if(Objects.nonNull(product.getShortDescription()) &&
                !"".equalsIgnoreCase(product.getShortDescription())) {
            productDB.setShortDescription(product.getShortDescription());
        }
        if(Objects.nonNull(product.getPrice()) && product.getPrice().compareTo(BigDecimal.ZERO) >= 0) {
            productDB.setPrice(product.getPrice());
        }
        return productRepository.save(productDB);
    }

    @Override
    public Product fetchProductByName(String productName) {
        return productRepository.findByProductNameIgnoreCase(productName);
    }
}
