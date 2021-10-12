package com.laptrinhweb.shopkibe.responses;

import com.laptrinhweb.shopkibe.dtos.ProductDTO;

import java.util.List;

public class ProductResponse {
    public List<ProductDTO> getProducts() {
        return products;
    }

    public ProductResponse(List<ProductDTO> products) {
        this.products = products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    private List<ProductDTO> products;
}
