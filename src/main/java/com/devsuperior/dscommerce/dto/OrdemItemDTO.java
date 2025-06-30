package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.OrderItem;

public class OrdemItemDTO {

    private Long ProductId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrdemItemDTO() {
    }

    public OrdemItemDTO(Long productId, String name, Double price, Integer quantity) {
        ProductId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }public OrdemItemDTO(OrderItem entity) {
       this.ProductId = entity.getProduct().getId();
        this.name = entity.getProduct().getName();
        this.price = entity.getPrice();
        this.quantity = entity.getQuantity();
    }

    public Long getProductId() {
        return ProductId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getSubtotal() {
        return price * quantity;
    }

}
