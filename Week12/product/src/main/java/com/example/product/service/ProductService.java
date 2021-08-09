package com.example.product.service;


import com.example.product.entity.Product;
import com.example.product.dto.ProductModel;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }



    public Product createProduct(ProductModel model) {
        Product product = new Product(1,
                model.getName(), model.getPrice());
        return productRepository.save(product);
    }

    public Product updateProductById(Integer id,ProductModel model) throws Exception {
    return productRepository.findById(id)
            .map(updateProduct-> {
                updateProduct.setName(model.getName());
                updateProduct.setPrice(model.getPrice());
                return productRepository.save(updateProduct);
            }).orElseThrow( Exception::new);
    }
}
