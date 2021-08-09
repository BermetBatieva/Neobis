package com.example.product.controller;

import com.example.product.entity.Product;
import com.example.product.dto.ProductModel;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/all")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Integer id){
        return productService.findById(id);
    }


    @PostMapping("/add")
    public ProductModel addProduct(@RequestBody ProductModel product) {
        productService.createProduct(product);
        return product;
    }

    @PutMapping("/{id}")
    public Product putProduct(@PathVariable ("id") Integer id ,
                              @RequestBody ProductModel model) throws Exception {
        return productService.updateProductById(id,model);
    }

}
