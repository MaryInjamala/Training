package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	
	List<User> users = new ArrayList<>();

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println(user.getArea());
		users.add(user);
		//return "saved succesfully";
		service.save(user);
	}

	//Get list of users
	@GetMapping
	List<User> getUsers() {
		return users;
	}

	//Get user by name
	@GetMapping("/{name}")
	List<User> getUsers(@PathVariable String name) {
		if(name.length() == 0) {
			throw new IllegalArgumentException("name cannot be empty");
		}
		System.out.println(name);
		List<User> filteredUsers = users.stream().filter((user)-> user.getName().equals(name)).collect(Collectors.toList());
		return filteredUsers;
	}
	
	//Get user by age
	@GetMapping("/age/{age}")//user/age/20
	List<User> getUsersByage(@PathVariable int age) {
		if(age<=20) {
			 throw new IllegalArgumentException("age should be more than 20");
		}
		System.out.println(age);
		List<User> filteredUsers = users.stream().filter((user)-> user.getAge()==age).collect(Collectors.toList());
		return filteredUsers;
	}
	
	
	//@PostMapping("/deleteproduct")
	//List<User> productRequest ) {
	
}
