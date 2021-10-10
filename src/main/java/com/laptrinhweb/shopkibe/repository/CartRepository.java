package com.laptrinhweb.shopkibe.repository;

import com.laptrinhweb.shopkibe.entity.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query("select c from Cart c")
    ArrayList<Cart> getAllCart();
    @Transactional
    @Modifying
    @Query("update Cart  c set c.quantity = ?1 where c.id = ?2")
    void updateCartQuantity(Long quantity,Long id);
    @Transactional
    @Modifying
    @Query("delete from Cart  c where c.id = ?1")
    void deleteCart(Long id);

}
