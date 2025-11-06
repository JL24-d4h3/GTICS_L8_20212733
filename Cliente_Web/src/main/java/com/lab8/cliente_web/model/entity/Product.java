package com.lab8.cliente_web.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Integer id;
    private String productName;
    private Supplier supplier;
    private Category category;
    private String unit;
    private Double price;
}
