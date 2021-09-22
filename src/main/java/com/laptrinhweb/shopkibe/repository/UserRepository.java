package com.laptrinhweb.shopkibe.repository;

import com.laptrinhweb.shopkibe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhone(String phone);

    @Query("select u from User u where u.phone = ?1")
    User checkExistPhone(String phone);

    @Query("select u from User u")
    ArrayList<User> getAllUser ();
}
