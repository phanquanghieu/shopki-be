package com.laptrinhweb.shopkibe.controller;

import com.laptrinhweb.shopkibe.dtos.WareHouseDTO;
import com.laptrinhweb.shopkibe.payload.ApiResponse;
import com.laptrinhweb.shopkibe.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/warehouse")
public class WareHouseController {
    @Autowired
    private WareHouseService wareHouseService;

    @GetMapping()
    public String getWareHouse(){
        return "chinh";
    }

    @PostMapping("create")
    public ApiResponse createWareHouse(@RequestBody WareHouseDTO wareHouseDTO){
        return wareHouseService.create(wareHouseDTO);
    }

}
