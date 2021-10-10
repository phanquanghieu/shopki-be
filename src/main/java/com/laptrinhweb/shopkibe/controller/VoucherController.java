package com.laptrinhweb.shopkibe.controller;


import com.laptrinhweb.shopkibe.entity.Product;
import com.laptrinhweb.shopkibe.entity.Voucher;
import com.laptrinhweb.shopkibe.payload.ApiResponse;
import com.laptrinhweb.shopkibe.repository.ProductRepository;
import com.laptrinhweb.shopkibe.repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/voucher")
public class VoucherController {
    @Autowired
    private VoucherRepository voucherRepository;

    @PostMapping("/create")
    public ApiResponse createVoucher(@RequestBody Voucher voucherReq){
        System.out.println(voucherReq);
        Voucher voucher= new Voucher(voucherReq.getImg(),voucherReq.getName(),voucherReq.getDescription());
        voucherRepository.save(voucher);
        return new ApiResponse(0);
    }

    @GetMapping("")
    public ArrayList<Voucher> getAllVoucher(){
        return voucherRepository.getAllVoucher();
    }
}

