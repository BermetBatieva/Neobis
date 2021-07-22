package com.example.product.controller;


import com.example.product.entity.Customer;
import com.example.product.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping(value="/all")
    public Iterable<Customer> getAllCustomer(){
        return service.getAllCustomers();
    }

     @GetMapping("/{id}")
     public Customer getCustomerId(@PathVariable("id") Integer id){
        return service.getCustomerById(id);
     }
}
