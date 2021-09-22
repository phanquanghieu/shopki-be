package com.laptrinhweb.shopkibe;

import com.laptrinhweb.shopkibe.entity.User;
import com.laptrinhweb.shopkibe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class ShopkiBeApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ShopkiBeApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("0977275069", passwordEncoder.encode("test"));
		userRepository.save(user);
		System.out.println(user.getPassword()+" "+ user.getPhone());
	}
}
