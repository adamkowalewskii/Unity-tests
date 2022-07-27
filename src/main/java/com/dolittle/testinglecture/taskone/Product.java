package com.dolittle.testinglecture.taskone;

import java.math.BigDecimal;

public class Product {
    private String title;
    private Double price;

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }
}
