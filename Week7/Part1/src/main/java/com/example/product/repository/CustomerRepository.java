package com.example.product.repository;

import com.example.product.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
