package com.ravindra.controller;

import com.ravindra.data.Product;
import com.ravindra.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    private static final Logger log = LoggerFactory.getLogger(ProductRestController.class);

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        log.info("Add Project");
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> listProducts() {
        log.info("List Pro");
        return productService.listProducts();
    }
}