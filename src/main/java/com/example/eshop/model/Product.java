package com.example.eshop.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor              //klassi annotatsioonid
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
@ToString

public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String productName;
    private String description;
    private Double price;

}
