package com.example.product.service;

import com.example.product.entity.Sale;
import com.example.product.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getAllSales(){
        return saleRepository.findAll();
    }

    public Optional<Sale> getSaleById(Integer id){
        return saleRepository.findById(id);
    }


}
