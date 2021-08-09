package com.example.product.entity;
import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"Sales\"")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Integer id;

    @ManyToOne
    private Customer customer_id;

    @ManyToOne
    private Seller seller_id;

    @ManyToOne
    private Product product_id;

    private Date dateOfSale;

}
