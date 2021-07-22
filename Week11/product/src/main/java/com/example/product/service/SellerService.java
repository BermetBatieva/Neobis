package com.example.product.service;

import com.example.product.entity.Seller;
import com.example.product.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;


    public List<Seller> getAllSeller() {
        return sellerRepository.findAll();
    }

    public Optional<Seller> getSellerById(Integer id) {
        return sellerRepository.findById(id);
    }

}
