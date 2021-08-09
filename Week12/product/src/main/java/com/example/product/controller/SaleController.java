package com.example.product.controller;

import com.example.product.entity.Sale;
import com.example.product.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/all")
    public List<Sale> showAllSales(){
        return saleService.getAllSales();
    }

    @GetMapping("/{id}")
    public Optional<Sale> showSaleById(@PathVariable("id") Integer id){
        return saleService.getSaleById(id);
    }
}
