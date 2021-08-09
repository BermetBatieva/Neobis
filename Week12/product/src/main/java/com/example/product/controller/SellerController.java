package com.example.product.controller;

import com.example.product.entity.Seller;
import com.example.product.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping("/all")
    public List<Seller> showAllSeller(){
        return sellerService.getAllSeller();
    }

    @GetMapping("/{id}")
    public Optional<Seller> showSellerById(@PathVariable("id")
                                                       Integer id){
        return sellerService.getSellerById(id);
    }
}
