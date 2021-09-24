package com.laptrinhweb.shopkibe.service;

import com.laptrinhweb.shopkibe.entity.Seller;
import com.laptrinhweb.shopkibe.entity.User;
import com.laptrinhweb.shopkibe.repository.SellerRepository;
import com.laptrinhweb.shopkibe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public Seller getSellerByUsername(String userName){
        return sellerRepository.findByUserName(userName);
    }
}
