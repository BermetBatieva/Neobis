package com.example.product.entity;


import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Integer id;

    @Column(name = "name",length = 44)
    private String name;

    @Column(name = "phoneNumber")
    private String phoneNumber;
}
