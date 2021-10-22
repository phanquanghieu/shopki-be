package com.laptrinhweb.shopkibe.dtos;

import javax.persistence.Column;

public class WareHouseDTO {

    private String address;

    private Long shop_id;


    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
