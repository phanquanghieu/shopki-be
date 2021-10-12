package com.laptrinhweb.shopkibe.payload.authSeller;

import com.laptrinhweb.shopkibe.entity.Seller;

public class LoginSellerResponsive {
    private String token;

    private Seller seller;

    public LoginSellerResponsive(String token, Seller seller) {
        this.token = token;
        this.seller = seller;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public Seller getUser() {
        return seller;
    }

    public void setUser(Seller seller) {
        this.seller = seller;
    }


}
