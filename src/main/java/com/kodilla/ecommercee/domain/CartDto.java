package com.kodilla.ecommercee.domain;

public class CartDto {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String groupId;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getGroupId() {
        return groupId;
    }

    public CartDto(String name, String description, Double price, String groupId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.groupId = groupId;
    }
}
