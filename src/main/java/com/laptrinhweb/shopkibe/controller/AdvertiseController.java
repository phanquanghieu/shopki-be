package com.laptrinhweb.shopkibe.controller;


import com.laptrinhweb.shopkibe.entity.Advertise;
import com.laptrinhweb.shopkibe.payload.ApiResponse;
import com.laptrinhweb.shopkibe.repository.AdvertiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/api/advertise")
public class AdvertiseController {
    @Autowired
    private AdvertiseRepository advertiseRepository;

    @PostMapping("/create")
    public ApiResponse createAdvertise(@RequestBody Advertise advertiseReq){
        System.out.println(advertiseReq);
        Advertise advertise = new Advertise(advertiseReq.getImg(),advertiseReq.getName(), advertiseReq.getDescription());
        advertiseRepository.save(advertise);
        return new ApiResponse(0);
    }
    @GetMapping("")
    public ArrayList<Advertise> getAllAdvertise(){
        return advertiseRepository.getAllAdvertise();
    }
}


