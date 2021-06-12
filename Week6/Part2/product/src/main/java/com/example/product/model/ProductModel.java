package com.example.product.model;

import lombok.*;

import javax.persistence.*;
//@AllArgsConstructor// принимает все значения по порядку
//@NoArgsConstructor// пустой Constructor
//@Data
public class ProductModel {
    public ProductModel(){

    }
    public ProductModel(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String name;
    private double price;


}
