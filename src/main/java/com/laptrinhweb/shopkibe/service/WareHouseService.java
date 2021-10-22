package com.laptrinhweb.shopkibe.service;

import com.laptrinhweb.shopkibe.dtos.WareHouseDTO;
import com.laptrinhweb.shopkibe.payload.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public class WareHouseService {
    public ApiResponse create(WareHouseDTO wareHouseDTO){
    
        return new ApiResponse(0);
    }
}
