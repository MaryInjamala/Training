package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	List<Account> accounts = new ArrayList<>();
	@Autowired
	AccountRepository repository;

public void save(Account account) {
	repository.save(account);
	System.out.println("save method called");
}

public List<Account> getAllAccounts(){
	return repository.findAll();
}

}