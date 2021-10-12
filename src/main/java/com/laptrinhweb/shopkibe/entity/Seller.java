package com.laptrinhweb.shopkibe.entity;

import javax.persistence.*;

@Entity
@Table(name = "seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userName;
    @Column
    private String password;

}
