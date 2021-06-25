package com.example.product.entity;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor// принимает все значения по порядку
@NoArgsConstructor// пустой Constructor
@Setter
@Getter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;

    @Column(name = "name", length = 44)
    private String name;

    @Column(name = "price")
    private double price;

}
