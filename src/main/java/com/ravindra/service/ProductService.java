package com.ravindra.service;

import com.ravindra.data.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }

    public List<Product> listProducts() {
        return products;
    }
}