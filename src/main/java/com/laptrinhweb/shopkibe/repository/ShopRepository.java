package com.laptrinhweb.shopkibe.repository;

import com.laptrinhweb.shopkibe.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Long> {
}
