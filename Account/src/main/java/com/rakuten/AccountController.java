package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService service;
	
	List<Account> accounts = new ArrayList<>();

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void saveAccount(@RequestBody Account account) {
		System.out.println(account.getName());
		System.out.println(account.getAccountno());
		System.out.println(account.getAddress());
		System.out.println(account.getMobile());
		System.out.println(account.getBalance());
		System.out.println(account.getDate());
		accounts.add(account);
		service.save(account);

	}
	@GetMapping
	List<Account>getAccounts(){
		return accounts;
	}

}
