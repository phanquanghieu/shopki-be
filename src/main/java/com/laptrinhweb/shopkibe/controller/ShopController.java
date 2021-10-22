package com.laptrinhweb.shopkibe.controller;

import com.laptrinhweb.shopkibe.dtos.ShopDTO;
import com.laptrinhweb.shopkibe.responses.ShopResponse;
import com.laptrinhweb.shopkibe.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping()
    public ShopResponse getShop(@RequestParam String id){
        return shopService.getShop(id);
    }
}
