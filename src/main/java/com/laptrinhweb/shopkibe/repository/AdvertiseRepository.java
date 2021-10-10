package com.laptrinhweb.shopkibe.repository;


import com.laptrinhweb.shopkibe.entity.Advertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AdvertiseRepository extends JpaRepository<Advertise,Long> {
    @Query("select a from Advertise a")
    ArrayList<Advertise>getAllAdvertise();
}
