package com.laptrinhweb.shopkibe.dtos;

import com.laptrinhweb.shopkibe.entity.Shop;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Long shopId;
    private Long price;
    private ShopDTO shop;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    public ShopDTO getShop() {
        return shop;
    }

    public void setShop(ShopDTO shop) {
        this.shop = shop;
    }
}
