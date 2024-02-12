package com.example.mobileshop;

import com.example.mobileshop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobileShopApplication implements ApplicationRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(MobileShopApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		userService.adminRegistration();
	}
}
