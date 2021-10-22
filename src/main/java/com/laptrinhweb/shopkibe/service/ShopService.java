package com.laptrinhweb.shopkibe.service;

import com.laptrinhweb.shopkibe.dtos.ShopDTO;
import com.laptrinhweb.shopkibe.entity.Shop;
import com.laptrinhweb.shopkibe.repository.ShopRepository;
import com.laptrinhweb.shopkibe.responses.ShopResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;


    public ShopResponse getShop(String id){
        Shop shop=shopRepository.getById(Long.parseLong(id));
        ShopDTO shopDTOs=new ShopDTO();
        shopDTOs.setId(shop.getId());
        shopDTOs.setName(shop.getName());
        return new ShopResponse(shopDTOs);
    }
}
