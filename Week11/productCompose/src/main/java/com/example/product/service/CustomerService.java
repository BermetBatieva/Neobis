package com.example.product.service;

import com.example.product.entity.Customer;
import com.example.product.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

//    private final CustomerRepository customerRepository;
//
//    public CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    public Customer getCustomerById(Integer id){
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.get();
    }

    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
}
