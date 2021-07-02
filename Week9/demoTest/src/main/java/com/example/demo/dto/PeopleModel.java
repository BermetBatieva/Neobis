package com.example.demo.dto;


import lombok.*;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeopleModel {

    @Column(name = "name", length = 44)
    private String name;

    @Column(name ="age")
    private Integer age;

    @Column(name = "gender",length = 5)
    private String gender;

}
