package com.example.product.dto;

import lombok.*;
@AllArgsConstructor// принимает все значения по порядку
@NoArgsConstructor// пустой Constructor
@Getter
@Setter
public class ProductModel {
    private String name;
    private double price;
}
