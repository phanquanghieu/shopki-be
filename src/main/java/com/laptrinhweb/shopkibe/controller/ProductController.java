package com.laptrinhweb.shopkibe.controller;

import com.laptrinhweb.shopkibe.entity.Product;
import com.laptrinhweb.shopkibe.entity.Shop;
import com.laptrinhweb.shopkibe.entity.User;
import com.laptrinhweb.shopkibe.payload.ApiResponse;
import com.laptrinhweb.shopkibe.payload.auth.OTPRequest;
import com.laptrinhweb.shopkibe.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/create")
    public ApiResponse createProduct(@RequestBody Product productReq){
        System.out.println(productReq);
        Product product = new Product(productReq.getName(), productReq.getPrice());
        productRepository.save(product);
        return new ApiResponse(0);
    }

    @GetMapping("")
    public ArrayList<Product> getAllProduct(){
        return productRepository.getAllProduct();
    }
}
