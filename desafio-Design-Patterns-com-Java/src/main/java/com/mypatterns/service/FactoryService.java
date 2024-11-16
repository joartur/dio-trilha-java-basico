package com.mypatterns.service;

import com.mypatterns.model.Product;
import com.mypatterns.util.ProductFactory;
import org.springframework.stereotype.Service;

@Service
public class FactoryService {
    public String getProduct(String type) {
        Product product = ProductFactory.createProduct(type);
        return product.getProductName();
    }
}
