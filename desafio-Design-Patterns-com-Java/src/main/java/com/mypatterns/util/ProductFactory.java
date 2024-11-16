package com.mypatterns.util;

import com.mypatterns.model.Product;
import com.mypatterns.model.ProductA;
import com.mypatterns.model.ProductB;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}
