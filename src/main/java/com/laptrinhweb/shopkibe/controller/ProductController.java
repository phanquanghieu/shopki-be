package com.laptrinhweb.shopkibe.controller;

import com.laptrinhweb.shopkibe.dtos.ProductDTO;
import com.laptrinhweb.shopkibe.entity.Product;
import com.laptrinhweb.shopkibe.entity.Shop;
import com.laptrinhweb.shopkibe.entity.User;
import com.laptrinhweb.shopkibe.payload.ApiResponse;
import com.laptrinhweb.shopkibe.payload.auth.OTPRequest;
import com.laptrinhweb.shopkibe.repository.ProductRepository;
import com.laptrinhweb.shopkibe.responses.ProductResponse;
import com.laptrinhweb.shopkibe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/create")
    public ApiResponse createProduct(@RequestBody ProductDTO productDTO){
        //System.out.println(productReq);
        Product product = new Product();
        product.setShop_id(productDTO.getShopId());
        product.setPrice(productDTO.getPrice());
        product.setName(productDTO.getName());
        productRepository.save(product);
        return new ApiResponse(0);
    }

    @PutMapping("/update")
    public ApiResponse updateProduct(@RequestBody ProductDTO productDTO) {
        return productService.update(productDTO);
    }

    @GetMapping
    public ProductResponse getAllProduct(){
        return productService.getProduct();
    }

    @DeleteMapping
    public ApiResponse delete(@RequestBody ProductDTO productDTO) {
        return productService.delete(productDTO);
    }
}
