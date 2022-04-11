package com.rakuten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		System.out.println("init");
		SpringApplication.run(AccountApplication.class, args);
	}

}
