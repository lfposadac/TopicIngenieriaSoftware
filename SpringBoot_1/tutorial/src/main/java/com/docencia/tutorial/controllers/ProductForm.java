package com.docencia.tutorial.controllers;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min; 
import jakarta.validation.constraints.Positive;

public class ProductForm {

    @NotEmpty(message = "The name is required")
    private String name;

    @NotNull(message = "The price is required")
    @Min(value = 1, message = "The price must be greater than zero my friend")
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}