package com.laptrinhweb.shopkibe.service;

import com.laptrinhweb.shopkibe.dtos.ProductDTO;
import com.laptrinhweb.shopkibe.entity.Product;
import com.laptrinhweb.shopkibe.payload.ApiResponse;
import com.laptrinhweb.shopkibe.repository.ProductRepository;
import com.laptrinhweb.shopkibe.responses.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductResponse getProduct() {
        List<Product> products = productRepository.getAllProduct();
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Product product : products) {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(product.getId());
            productDTO.setShopId(product.getShop_id());
            productDTO.setName(product.getName());
            productDTO.setPrice(product.getPrice());
            productDTOS.add(productDTO);
        }
        return new ProductResponse(productDTOS);
    }

    public ApiResponse update(ProductDTO productDTO) {
        Product product = productRepository.getById(productDTO.getId());
        product.setShop_id(productDTO.getShopId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        productRepository.save(product);
        return new ApiResponse(0);
    }

    public ApiResponse delete(ProductDTO productDTO) {
        ApiResponse response = new ApiResponse();
        Product product = productRepository.getById(productDTO.getId());
        if (Objects.isNull(product)) {
            response.setMsg("Khong tim thay san pham nay!");
        } else {
            productRepository.delete(product);
        }
        return response;
    }
}
