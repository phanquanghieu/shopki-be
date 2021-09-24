package com.laptrinhweb.shopkibe.controller.seller;

import com.laptrinhweb.shopkibe.entity.Seller;
import com.laptrinhweb.shopkibe.payload.auth.AuthRequest;
import com.laptrinhweb.shopkibe.payload.auth.LoginResponse;
import com.laptrinhweb.shopkibe.payload.authSeller.LoginSellerResponsive;
import com.laptrinhweb.shopkibe.security.CustomUserDetails;
import com.laptrinhweb.shopkibe.security.JwtTokenProvider;
import com.laptrinhweb.shopkibe.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller/api/auth")
public class SellerController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private SellerService sellerService;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/")
    public LoginResponse login(@RequestBody AuthRequest authRequest){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authRequest.getPhone(),
                        authRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenProvider.generateToken((CustomUserDetails) authentication.getPrincipal());
        Seller seller = sellerService.getSellerByUsername(authRequest.getPhone());

        return new LoginSellerResponsive(token,seller);
    }
}
