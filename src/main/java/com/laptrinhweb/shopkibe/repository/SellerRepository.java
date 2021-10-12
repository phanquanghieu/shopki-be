package com.laptrinhweb.shopkibe.repository;

import com.laptrinhweb.shopkibe.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
    Seller findByUserName(String userName);

    @Query("select u from Seller u where u.userName = ?1")
    Seller checkExistPhone(String phone);

    @Query("select u from Seller u")
    ArrayList<Seller> getAllUser ();
}
