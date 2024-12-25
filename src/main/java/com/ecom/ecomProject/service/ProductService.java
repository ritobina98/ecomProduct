package com.ecom.ecomProject.service;

import com.ecom.ecomProject.model.Product;
import com.ecom.ecomProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        System.out.println("in service");
        return productRepository.save(product);
    }
}
