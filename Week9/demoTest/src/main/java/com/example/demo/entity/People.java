package com.example.demo.entity;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "people")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer id;

    @Column(name = "name", length = 44)
    private String name;

    @Column(name ="age")
    private Integer age;

    @Column(name = "gender",length = 5)
    private String gender;


    public People(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

