package com.example.graphql.demo.controller;

import com.example.graphql.demo.model.Product;
import com.example.graphql.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @QueryMapping
    public List<Product> products() {
        return productRepository.findAll();
    }

    @MutationMapping
    public Product addProduct(@Argument String name, @Argument String category, @Argument double price) {
        return productRepository.save(new Product(null, name, category, price));
    }
}
