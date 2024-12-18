package com.example.eshop.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor              //klassi annotatsioonid
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "settled_orders")
@ToString
public class SettledOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*private long id;*/
    private Long orderNumber;
    /*private String username;*/
    @Column(name="new_order_number")
    private Long newOrderNumber;
    private Date orderDate;
    private String productName;
    private int quantity;
    private double price;
    private boolean newOrder;
    @Column(name = "username")
    private String username;
}
